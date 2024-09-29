package br.com.pointel.jeemuvi.desk;

import br.com.pointel.jeemuvi.acts.AelinReditCatchOn;
import br.com.pointel.jeemuvi.wizard.WizBase;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author emuvi
 */
public class Desk extends JFrame {
    
    private final DeskIcon deskIcon = new DeskIcon(this);
    private final DeskMenu deskMenu = new DeskMenu(this);

    public Desk() throws HeadlessException {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(deskIcon.getLogo());
        setSize(128, 128);
        setUndecorated(true);
        setTitle(WizBase.APP_TITLE);
        setLayout(new BorderLayout());
        add(deskIcon, BorderLayout.CENTER);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }
    
    public void actMain() {
        new DeskAct().setVisible(true);
    }
    
    public void actMenu() {
        this.deskMenu.show(deskIcon, 0, deskIcon.getHeight());
    }
    
    public static void start(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Desk().setVisible(true);
        });
    }
    
}
