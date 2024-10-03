package br.com.pointel.jeemuvi;

import br.com.pointel.jeemuvi.service.CaptSubtitledDesk;
import br.com.pointel.jeemuvi.service.CaptSoundedDesk;
import br.com.pointel.jeemuvi.service.CharvsDesk;
import br.com.pointel.jeemuvi.service.CharScrapDesk;
import br.com.pointel.jeemuvi.service.FileDuplicateDesk;
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
public class JeemuviDeskMenu extends JPopupMenu {

    private final JeemuviDesk desk;
    
    private final JMenuItem menuCaptSounded = new JMenuItem("CaptSounded");
    private final JMenuItem menuCaptSubtitled = new JMenuItem("CaptSubtitled");
    private final JMenuItem menuFileDuplicate = new JMenuItem("FileDuplicate");
    private final JMenuItem menuCharScrap = new JMenuItem("CharScrap");
    private final JMenuItem menuCharvs = new JMenuItem("Charvs");
    private final JCheckBoxMenuItem menuOnTop = new JCheckBoxMenuItem("OnTop");
    private final JMenuItem menuExit = new JMenuItem("Exit");
    
    public JeemuviDeskMenu(JeemuviDesk desk) {
        this.desk = desk;
        initMenu();
        initPopupListener();
    }
    
    private void initMenu() {
        WizSwing.addMenuItem(this, menuCaptSounded, e -> callCaptSounded());
        WizSwing.addMenuItem(this, menuCaptSubtitled, e -> callCaptSubtitled());
        WizSwing.addMenuItem(this, menuFileDuplicate, e -> callFileDuplicate());
        WizSwing.addMenuItem(this, menuCharScrap, e -> callCharScrap());
        WizSwing.addMenuItem(this, menuCharvs, e -> callCharvs());
        WizSwing.addMenuItem(this, menuOnTop, e -> callOnTop());
        WizSwing.addMenuItem(this, menuExit, e -> callExit());
    }
    
    private void callCaptSounded() {
        new CaptSoundedDesk().setVisible(true);
    }
    
    private void callCaptSubtitled() {
        new CaptSubtitledDesk().setVisible(true);
    }
    
    private void callFileDuplicate() {
        new FileDuplicateDesk().setVisible(true);
    }
    
    private void callCharvs() {
        new CharvsDesk().setVisible(true);
    }
    
    private void callCharScrap() {
        new CharScrapDesk().setVisible(true);
    }
    
    private void callOnTop() {
        desk.setAlwaysOnTop(!desk.isAlwaysOnTop());
        menuOnTop.setSelected(desk.isAlwaysOnTop());
    }
    
    private void callExit() {
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
