package br.com.pointel.jeemuvi.desk;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author emuvi
 */
public class DeskAct extends JFrame {
    
    
    private DefaultComboBoxModel<String> modelAct = new DefaultComboBoxModel<>();
    private JComboBox<String> comboAct = new JComboBox<>(modelAct);

    public DeskAct() {
        setTitle("Act");
        setLayout(new BorderLayout());
        add(comboAct, BorderLayout.CENTER);
        pack();
    }
    
}
