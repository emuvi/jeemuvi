package br.com.pointel.jeemuvi;

import br.com.pointel.jeemuvi.wizard.WizSwing;
import com.google.common.reflect.ClassPath;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
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
    
    private final JMenuItem menuResize = new JMenuItem("Resize");
    private final JCheckBoxMenuItem menuOnTop = new JCheckBoxMenuItem("OnTop");
    private final JMenuItem menuExit = new JMenuItem("Exit");
    
    public JeemuviDeskMenu(JeemuviDesk desk) {
        this.desk = desk;
        initPopupListener();
    }
    
    private void initPopupListener() {
        addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                menuClean();
                menuPutDesks();
                menuPutEnding();
                menuOnTop.setSelected(desk.isAlwaysOnTop());
            }
            
            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
            }
            
            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
            }
        });
    }
    
    private void menuClean() {
        removeAll();
    }
    
    private void menuPutDesks() {
        try {
            String packageName = "br.com.pointel.jeemuvi.acts";
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            ClassPath classpath = ClassPath.from(loader);
            List<String> clazzNames = classpath.getTopLevelClasses(packageName)
                    .stream().map(ci -> ci.getName()).collect(Collectors.toList());
            Collections.sort(clazzNames);
            var menu = new JMenu("Desk");
            for (var clazzName : clazzNames) {
                var inClazz = Class.forName(clazzName);
                if (JFrame.class.isAssignableFrom(inClazz)) {
                    var item = new JMenuItem(inClazz.getSimpleName().replace("Desk", ""));
                    item.addActionListener(e -> callDesk(inClazz));
                    menu.add(item);
                }
            }
            add(menu);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }
    
    private void menuPutEnding() {
        this.addSeparator();
        WizSwing.addMenuItem(this, menuResize, e -> callResize());
        WizSwing.addMenuItem(this, menuOnTop, e -> callOnTop());
        WizSwing.addMenuItem(this, menuExit, e -> callExit());
    }
    
    private void callDesk(Class<?> clazz) {
        try {
            JFrame frame = (JFrame) clazz.getConstructor().newInstance();
            frame.setVisible(true);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }
    
    private void callResize() {
        switch (desk.getWidth()) {
            case 64 -> desk.setSize(128, 128);
            case 128 -> desk.setSize(192, 192);
            case 192 -> desk.setSize(256, 256);
            default -> desk.setSize(64, 64);
        }
    }
    
    private void callOnTop() {
        desk.setAlwaysOnTop(!desk.isAlwaysOnTop());
        menuOnTop.setSelected(desk.isAlwaysOnTop());
    }
    
    private void callExit() {
        WizSwing.close(desk);
    }
    
}
