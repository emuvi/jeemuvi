package br.com.pointel.jeemuvi;

import br.com.pointel.jeemuvi.service.AelinCapturarLegendasDesk;
import br.com.pointel.jeemuvi.service.AelinReditCatchOn;
import br.com.pointel.jeemuvi.service.CharvsDesk;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/**
 *
 * @author emuvi
 */
public class JeemuviDeskMenu extends JPopupMenu {

    private final JeemuviDesk desk;
    
    private final JMenuItem menuCharvs = new JMenuItem("Charvs");
    private final JMenuItem menuAelinReditCatchOn = new JMenuItem("AelinReditCatchOn");
    private final JMenuItem menuAelinCapturarLegendas = new JMenuItem("Aelin Capturar Legendas");
    private final JCheckBoxMenuItem menuOnTop = new JCheckBoxMenuItem("On Top");
    private final JMenuItem menuExit = new JMenuItem("Exit");
    
    public JeemuviDeskMenu(JeemuviDesk desk) {
        this.desk = desk;
        initMenu();
        initPopupListener();
    }
    
    private void initMenu() {
        WizSwing.addMenuItem(this, menuCharvs, e -> callCharvs());
        WizSwing.addMenuItem(this, menuAelinCapturarLegendas, e -> callAelinCapturarLegendas());
        WizSwing.addMenuItem(this, menuAelinReditCatchOn, e -> callAelinReditCatchOn());
        WizSwing.addMenuItem(this, menuOnTop, e -> callRootOnTop());
        WizSwing.addMenuItem(this, menuExit, e -> callRootExit());
    }
    
    private void callCharvs() {
        new CharvsDesk().setVisible(true);
    }
    
    private void callAelinCapturarLegendas() {
        new AelinCapturarLegendasDesk().setVisible(true);
    }
    
    private void callAelinReditCatchOn() {
        try {
            new AelinReditCatchOn().run();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }
    
    private void callRootOnTop() {
        desk.setAlwaysOnTop(!desk.isAlwaysOnTop());
        menuOnTop.setSelected(desk.isAlwaysOnTop());
    }
    
    private void callRootExit() {
        WizSwing.close(desk);
    }
    
    private void initPopupListener() {
        addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                menuOnTop.setSelected(desk.isAlwaysOnTop());
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {}

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {}
        });
    }
    
}
