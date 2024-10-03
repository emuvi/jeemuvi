/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pointel.jeemuvi.gears;

import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.awt.Component;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author emuvi
 */
public class Dropper {

    private final List<Component> components;

    public Dropper(Component... components) {
        this.components = Arrays.asList(components);
    }
    
    public Dropper(List<Component> components) {
        this.components = components;
    }

    public void init() {
        for (var component : components) {
            new DropTarget(component, DnDConstants.ACTION_COPY, new DropTargetAdapter() {
                @Override
                public void drop(DropTargetDropEvent e) {
                    try {
                        e.acceptDrop(DnDConstants.ACTION_COPY);
                        DataFlavor[] flavors = e.getCurrentDataFlavors();
                        for (DataFlavor flavor : flavors) {
                            if (flavor.isFlavorJavaFileListType()) {
                                dropped(component, (List<File>) e.getTransferable().getTransferData(flavor));
                                break;
                            } else if (flavor.isFlavorTextType()) {
                                dropped(component, (String) e.getTransferable().getTransferData(flavor));
                                break;
                            }
                        }
                        e.dropComplete(true);
                    } catch (Exception ex) {
                        e.dropComplete(false);
                        WizSwing.showError(ex);
                    }
                }
            });
        }
    }

    private void dropped(Component component, List<File> files) {
        if (component instanceof JTextField textField) {
            textField.setText(String.join(";", files.stream().map(f -> f.getAbsolutePath()).toList()));
        }
    }

    private void dropped(Component component, String text) {
        if (component instanceof JTextField textField) {
            textField.setText(text);
        }
    }

}
