package br.com.pointel.jeemuvi.desk;

import br.com.pointel.jeemuvi.wizard.WizSwing;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/**
 *
 * @author emuvi
 */
public class DeskMenu extends JPopupMenu {

    private final Desk desk;
    
    private final JCheckBoxMenuItem rootOnTop = new JCheckBoxMenuItem("OnTop");
    private final JMenuItem rootExit = new JMenuItem("Exit");
    
    public DeskMenu(Desk desk) {
        this.desk = desk;
        initRoot();
        initPopupListener();
    }
    
    private void initPopupListener() {
        addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                rootOnTop.setSelected(desk.isAlwaysOnTop());
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {}

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {}
        });
    }
    
    private void initRoot() {
        rootOnTop.setSelected(desk.isAlwaysOnTop());
        rootOnTop.addActionListener(e -> actRootOnTop());
        add(rootOnTop);
        rootExit.addActionListener(e -> actRootExit());
        add(rootExit);
    }
    
    private void actRootOnTop() {
        desk.setAlwaysOnTop(!desk.isAlwaysOnTop());
        rootOnTop.setSelected(desk.isAlwaysOnTop());
    }
    
    private void actRootExit() {
        WizSwing.close(desk);
    }
    
}
