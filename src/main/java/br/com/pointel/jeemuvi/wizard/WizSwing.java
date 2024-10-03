package br.com.pointel.jeemuvi.wizard;

import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

/**
 *
 * @author emuvi
 */
public class WizSwing {

    public static void addMenuItem(JComponent menu, AbstractButton item, ActionListener action) {
        item.addActionListener(action);
        menu.add(item);
    }

    public static void showInfo(String message) {
        if (SwingUtilities.isEventDispatchThread()) {
            JOptionPane.showMessageDialog(null, message, "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null, message, "Info", JOptionPane.INFORMATION_MESSAGE));
        }
    }

    public static void showError(Throwable error) {
        showError(error, null);
    }

    public static void showError(Throwable error, String detail) {
        error.printStackTrace();
        String message = error.getMessage() + (detail != null ? " " + detail : "");
        if (SwingUtilities.isEventDispatchThread()) {
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE));
        }
    }

    public static boolean showConfirm(String message) {
        return JOptionPane.YES_OPTION
                == JOptionPane.showConfirmDialog(
                        null, message, "Confirm",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    public static String showInput(String message) {
        return JOptionPane.showInputDialog(
                null, message, "Input",
                JOptionPane.QUESTION_MESSAGE);
    }

    public static String getStringOnClipboard() throws Exception {
        Clipboard systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable clipboardContents = systemClipboard.getContents(null);
        if (clipboardContents != null) {
            try {
                if (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    return (String) clipboardContents.getTransferData(DataFlavor.stringFlavor);
                }
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public static void putStringOnClipboard(String string) {
        StringSelection selection = new StringSelection(string);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

    public static File selectFolder(File selected) {
        return selectPath(selected, JFileChooser.DIRECTORIES_ONLY);
    }

    public static File selectFile(File selected) {
        return selectPath(selected, JFileChooser.FILES_ONLY);
    }

    public static File selectPath(File selected) {
        return selectPath(selected, JFileChooser.FILES_AND_DIRECTORIES);
    }

    public static File selectPath(File selected, int kind) {
        var chooser = new JFileChooser();
        chooser.setFileSelectionMode(kind);
        if (selected != null) {
            chooser.setSelectedFile(selected);
        }
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile();
        }
        return null;
    }

    public static void open(File file) throws Exception {
        Desktop.getDesktop().open(file);
    }

    public static void navigate(String address) throws Exception {
        Desktop.getDesktop().browse(new URI(address));
    }

    public static Font fontMonospaced() {
        return new Font(Font.MONOSPACED, Font.PLAIN, 11);
    }

    public static Font fontSerif() {
        return new Font(Font.SERIF, Font.PLAIN, 11);
    }

    public static Font fontSansSerif() {
        return new Font(Font.SANS_SERIF, Font.PLAIN, 11);
    }

    public static void initFrame(JFrame frame) {
        final var rootName = WizChars.makeParameterName(!frame.getName().isEmpty() ? frame.getName() : frame.getTitle());
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                loadFrameProps();
                loadFrameComps(frame);
            }

            private void loadFrameProps() throws HeadlessException, SecurityException {
                var left = WizProps.get(rootName + "_FRAME_LEFT", frame.getBounds().x);
                var top = WizProps.get(rootName + "_FRAME_TOP", frame.getBounds().y);
                var width = WizProps.get(rootName + "_FRAME_WIDTH", frame.getBounds().width);
                var height = WizProps.get(rootName + "_FRAME_HEIGHT", frame.getBounds().height);
                var gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                var screenBounds = gd.getDefaultConfiguration().getBounds();
                if (left + width > screenBounds.x + screenBounds.width) {
                    left = screenBounds.width - width;
                }
                if (top + height > screenBounds.y + screenBounds.height) {
                    top = screenBounds.height - height;
                }
                if (left < screenBounds.x) {
                    left = screenBounds.x;
                }
                if (top < screenBounds.y) {
                    top = screenBounds.y;
                }
                frame.setBounds(left, top, width, height);
                frame.setAlwaysOnTop(WizProps.get(rootName + "_FRAME_ONTOP", frame.isAlwaysOnTop()));
            }

            public void loadFrameComps(Component component) {
                if (component != null && component.getName() != null && !component.getName().isEmpty()) {
                    var paramName = rootName + "_COMP_" + WizChars.makeParameterName(component.getName());
                    switch (component) {
                        case JTextField textField -> textField.setText(WizProps.get(paramName, textField.getText()));
                        case JSpinner spinnerField -> spinnerField.setValue(WizProps.get(paramName, (Integer) spinnerField.getValue()));
                        case JCheckBox checkField -> checkField.setSelected(WizProps.get(paramName, checkField.isSelected()));
                        default -> {
                        }
                    }
                }
                if (component instanceof Container container) {
                    for (Component inside : container.getComponents()) {
                        loadFrameComps(inside);
                    }
                }
            }

            @Override
            public void windowClosing(WindowEvent e) {
                saveFrameProps();
                saveFrameComps(frame);
            }

            private void saveFrameProps() {
                WizProps.set(rootName + "_FRAME_LEFT", frame.getBounds().x);
                WizProps.set(rootName + "_FRAME_TOP", frame.getBounds().y);
                WizProps.set(rootName + "_FRAME_WIDTH", frame.getBounds().width);
                WizProps.set(rootName + "_FRAME_HEIGHT", frame.getBounds().height);
                WizProps.set(rootName + "_FRAME_ONTOP", frame.isAlwaysOnTop());
            }

            public void saveFrameComps(Component component) {
                if (component != null && component.getName() != null && !component.getName().isEmpty()) {
                    var paramName = rootName + "_COMP_" + WizChars.makeParameterName(component.getName());
                    switch (component) {
                        case JTextField textField -> WizProps.set(paramName, textField.getText());
                        case JSpinner spinnerField -> WizProps.set(paramName, (Integer) spinnerField.getValue());
                        case JCheckBox checkField -> WizProps.set(paramName, checkField.isSelected());
                        default -> {
                        }
                    }
                }
                if (component instanceof Container container) {
                    for (Component inside : container.getComponents()) {
                        saveFrameComps(inside);
                    }
                }
            }
        });
        setAllCompontentsFont(frame, fontMonospaced());
    }

    public static void setAllCompontentsFont(Component component, Font fonte) {
        component.setFont(fonte);
        if (component instanceof Container container) {
            for (Component inside : container.getComponents()) {
                setAllCompontentsFont(inside, fonte);
            }
        }
    }
    
    public static <T extends Class<? extends Component>> List<Component> getAllCompontentsOf(Component root, T... clazz) {
        var results = new ArrayList<Component>();
        getAllCompontentsOf(results, root, clazz);
        return results;
    }
    
    public static <T extends Class<? extends Component>> void getAllCompontentsOf(List<Component> results, Component root, T... clazz) {
        for (var kind : clazz) {
            if (kind.isInstance(root)) {
                results.add(root);
            }
        }
        if (root instanceof Container container) {
            for (Component inside : container.getComponents()) {
                getAllCompontentsOf(results, inside, clazz);
            }
        }
    }

    public static void initEscaper(JFrame frame) {
        String ESCAPER_KEY = "FramEscaperAction";
        frame.getRootPane().getActionMap().put(ESCAPER_KEY, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close(frame);
            }
        });
        frame.getRootPane().getInputMap().put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                ESCAPER_KEY);
    }

    public static void close(JFrame frame) {
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        frame.setVisible(false);
        frame.dispose();
    }

}
