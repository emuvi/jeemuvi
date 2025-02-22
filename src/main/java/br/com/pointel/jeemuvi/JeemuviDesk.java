package br.com.pointel.jeemuvi;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import br.com.pointel.jarch.mage.WizDesk;
import br.com.pointel.jarch.mage.WizSwing;

/**
 *
 * @author emuvi
 */
public class JeemuviDesk extends JFrame {
    
    private final JeemuviDeskIcon deskIcon = new JeemuviDeskIcon(this);
    private final JeemuviDeskMenu deskMenu = new JeemuviDeskMenu(this);

    public JeemuviDesk() throws HeadlessException {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(deskIcon.getLogo());
        setSize(128, 128);
        setUndecorated(true);
        setName("jeemuvi");
        setTitle("Jeemuvi");
        setLayout(new BorderLayout());
        add(deskIcon, BorderLayout.CENTER);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }
    
    public void actMenu() {
        this.deskMenu.show(deskIcon, 0, deskIcon.getHeight());
    }
    
    public static void start(String[] args) {
        WizDesk.start("Jeemuvi", () -> new JeemuviDesk().setVisible(true));
    }
    
}
