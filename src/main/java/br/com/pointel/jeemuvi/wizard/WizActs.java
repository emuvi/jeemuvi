package br.com.pointel.jeemuvi.wizard;

import br.com.pointel.jeemuvi.Act;
import br.com.pointel.jeemuvi.Good;
import br.com.pointel.jeemuvi.acts.AelinReditCatchOnAct;
import java.util.ArrayList;
import java.util.List;

public class WizActs {

    private static final Good[] GOODS = new Good[] {
        new Good(AelinReditCatchOnAct.class, AelinReditCatchOnAct.META),
    };
        
    public static Good[] getGoods() {
        return GOODS;
    }
    
    private final static List<Act> STARTED = new ArrayList<>();
    
    private static void addStarted(Act act) {
        synchronized (STARTED) {
            STARTED.add(act);
        }
    }
    
    public static void start(Good good) {
        new Thread("Start " + good.meta().name()) {
            @Override
            public void run() {
                try {
                    Act act = good.clazz().getConstructor().newInstance();
                    addStarted(act);
                    act.start();
                } catch (Exception e) {
                    WizSwing.showError(e);
                }
            }
        }.start();
    }
    
    public static List<Act> getStarted() {
        synchronized (STARTED) {
            return List.copyOf(STARTED);
        }
    }
    
}
