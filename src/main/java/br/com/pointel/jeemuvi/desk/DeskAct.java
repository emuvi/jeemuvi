package br.com.pointel.jeemuvi.desk;

import br.com.pointel.jeemuvi.Good;
import br.com.pointel.jeemuvi.wizard.WizActs;
import br.com.pointel.jeemuvi.wizard.WizBase;
import br.com.pointel.jeemuvi.wizard.WizProps;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author emuvi
 */
public class DeskAct extends JFrame {

    private static volatile int ACTIVES = 0;

    private final DefaultComboBoxModel<Good> modelAct = new DefaultComboBoxModel<>();
    private final JComboBox<Good> comboAct = new JComboBox<>(modelAct);
    private final JButton buttonAct = new JButton("*");
    private final JPanel panelBody = new JPanel(new BorderLayout(4, 4));

    public DeskAct() {
        initFrame();
    }

    private void initFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Jeemuvi - Act " + (++ACTIVES));
        setLocationRelativeTo(null);
        setLocationByPlatform(true);
        setContentPane(panelBody);
        initBody();
        pack();
        initComponents();
        initFrameListeners();
        initComboListeners();
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }

    private void initBody() {
        panelBody.add(comboAct, BorderLayout.CENTER);
        panelBody.add(buttonAct, BorderLayout.EAST);
        panelBody.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    }

    private void initComponents() {
        modelAct.addAll(Arrays.asList(WizActs.getGoods()));
        comboAct.setEditable(true);
        buttonAct.addActionListener(e -> startAct());
    }

    private void initFrameListeners() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                comboAct.requestFocus();
            }
            @Override
            public void windowClosed(WindowEvent e) {
                --ACTIVES;
            }
        });
    }

    private void initComboListeners() {
        var textField = (JTextField) comboAct.getEditor().getEditorComponent();
        textField.setColumns(12);
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    startAct();
                }
            }
        });
        textField.getDocument().addDocumentListener(new DocumentListener() {

            private volatile boolean started = false;

            @Override
            public void insertUpdate(DocumentEvent e) {
                handleTextChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleTextChange();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleTextChange();
            }

            private void handleTextChange() {
                if (started) {
                    return;
                }
                started = true;
                new Thread("Update Autocomplete") {
                    @Override
                    public void run() {
                        WizBase.sleep(200);
                        var text = textField.getText();
                        var selectionStart = textField.getSelectionStart();
                        var selectionEnd = textField.getSelectionEnd();
                        modelAct.removeAllElements();
                        var founds = 0;
                        if (text.isEmpty()) {
                            modelAct.addAll(Arrays.asList(WizActs.getGoods()));
                        } else {
                            for (var good : WizActs.getGoods()) {
                                if (good.toString().toLowerCase().startsWith(text.toLowerCase())) {
                                    modelAct.addElement(good);
                                    founds++;
                                }
                            }
                        }
                        final var shoudShow = founds > 1;
                        SwingUtilities.invokeLater(() -> {
                            textField.setText(text);
                            textField.setSelectionStart(selectionStart);
                            textField.setSelectionEnd(selectionEnd);
                            if (shoudShow) {
                                comboAct.showPopup();
                            } else {
                                comboAct.hidePopup();
                            }
                            started = false;
                        });
                    }
                }.start();
            }
        });
    }

    private void startAct() {
        if (modelAct.getSize() != 1) {
            WizSwing.showInfo("You not selected a single act.");
        } else {
            var selected = modelAct.getElementAt(0);
            WizActs.start(selected);
            WizSwing.close(this);
        }
    }

}
