package br.com.pointel.jeemuvi.gears;

import br.com.pointel.jeemuvi.wizes.WizChars;
import br.com.pointel.jeemuvi.wizes.WizProps;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.text.JTextComponent;

public class SwingFramer {

    private final JFrame frame;
    private final String rootName;
    private final JPopupMenu popMenu;

    public SwingFramer(JFrame frame) {
        this.frame = frame;
        this.rootName = WizChars.makeParameterName(!frame.getName().isEmpty() ? frame.getName() : frame.getTitle());
        this.popMenu = new JPopupMenu();
    }

    public void init() {
        WizSwing.setAllCompontentsFont(frame, WizSwing.fontMonospaced());
        initWindow();
        initPopMenu();
    }

    private void initWindow() {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                loadFrameProps();
                loadFrameComps(frame);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                saveFrameProps();
                saveFrameComps(frame);
            }
        });
    }

    private void loadFrameProps() throws HeadlessException, SecurityException {
        var left = WizProps.get(rootName + "_FRAME_LEFT", frame.getBounds().x);
        var top = WizProps.get(rootName + "_FRAME_TOP", frame.getBounds().y);
        var width = WizProps.get(rootName + "_FRAME_WIDTH", frame.getBounds().width);
        var height = WizProps.get(rootName + "_FRAME_HEIGHT", frame.getBounds().height);
        var bounds = WizSwing.getBoundsInsideScreen(new Rectangle(left, top, width, height));
        frame.setBounds(bounds);
        frame.setAlwaysOnTop(WizProps.get(rootName + "_FRAME_ONTOP", frame.isAlwaysOnTop()));
    }

    public void loadFrameComps(Component component) {
        if (component != null && component.getName() != null && !component.getName().isEmpty()) {
            var paramName = rootName + "_COMP_" + WizChars.makeParameterName(component.getName());
            try {
                switch (component) {
                    case JTextComponent textField ->
                        textField.setText(WizProps.get(paramName, textField.getText()));
                    case JComboBox comboField ->
                        comboField.setSelectedIndex(WizProps.get(paramName, comboField.getSelectedIndex()));
                    case JSpinner spinnerField ->
                        spinnerField.setValue(WizProps.get(paramName, (Integer) spinnerField.getValue()));
                    case JCheckBox checkField ->
                        checkField.setSelected(WizProps.get(paramName, checkField.isSelected()));
                    default -> {
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (component instanceof Container container) {
            for (Component inside : container.getComponents()) {
                loadFrameComps(inside);
            }
        }
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
                case JTextComponent textField ->
                    WizProps.set(paramName, textField.getText());
                case JComboBox comboField ->
                    WizProps.set(paramName, comboField.getSelectedIndex());
                case JSpinner spinnerField ->
                    WizProps.set(paramName, (Integer) spinnerField.getValue());
                case JCheckBox checkField ->
                    WizProps.set(paramName, checkField.isSelected());
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

    private void initPopMenu() {
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popMenu.show(frame, e.getX(), e.getY());
                }
            }
        });
        createPopMenu();
    }

    private void createPopMenu() {
        createMenuSizes();
        WizSwing.addMenuItem(popMenu, new JMenuItem("OnTop"), (e) -> menuOnTop());
        WizSwing.addMenuItem(popMenu, new JMenuItem("Close"), (e) -> menuClose());
    }

    private void createMenuSizes() {
        var sizes = new JMenu("Sizes");
        WizSwing.addMenuItem(sizes, new JMenuItem("Tag as Size A"), (e) -> menuSizesTagAsSizeA());
        WizSwing.addMenuItem(sizes, new JMenuItem("Put on Size A"), (e) -> menuSizesPutOnSizeA());
        WizSwing.addMenuItem(sizes, new JMenuItem("Tag as Size B"), (e) -> menuSizesTagAsSizeB());
        WizSwing.addMenuItem(sizes, new JMenuItem("Put on Size B"), (e) -> menuSizesPutOnSizeB());
        popMenu.add(sizes);
    }

    private void menuSizesTagAsSizeA() {
        WizProps.set(rootName + "_FRAME_WIDTH_SIZE_A", frame.getBounds().width);
        WizProps.set(rootName + "_FRAME_HEIGHT_SIZE_A", frame.getBounds().height);
    }

    private void menuSizesPutOnSizeA() {
        var width = WizProps.get(rootName + "_FRAME_WIDTH_SIZE_A", frame.getBounds().width);
        var height = WizProps.get(rootName + "_FRAME_HEIGHT_SIZE_A", frame.getBounds().height);
        frame.setSize(width, height);
    }

    private void menuSizesTagAsSizeB() {
        WizProps.set(rootName + "_FRAME_WIDTH_SIZE_B", frame.getBounds().width);
        WizProps.set(rootName + "_FRAME_HEIGHT_SIZE_B", frame.getBounds().height);
    }

    private void menuSizesPutOnSizeB() {
        var width = WizProps.get(rootName + "_FRAME_WIDTH_SIZE_B", frame.getBounds().width);
        var height = WizProps.get(rootName + "_FRAME_HEIGHT_SIZE_B", frame.getBounds().height);
        frame.setSize(width, height);
    }

    private void menuOnTop() {
        frame.setAlwaysOnTop(!frame.isAlwaysOnTop());
    }

    private void menuClose() {
        WizSwing.close(frame);
    }

}
