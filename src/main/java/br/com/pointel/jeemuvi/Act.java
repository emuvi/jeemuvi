package br.com.pointel.jeemuvi;

import br.com.pointel.jeemuvi.wizard.WizProps;
import br.com.pointel.jeemuvi.wizard.WizSwing;

/**
 *
 * @author emuvi
 */
public abstract class Act {
    
    public abstract ActMeta getMeta();
    
    public abstract void run() throws Exception;
    
    private Long beginTime = null;
    private Long endTime = null;
    
    public void start() {
        try {
            beginTime = System.currentTimeMillis();
            run();
        } catch (Exception e) {
            WizSwing.showError(e);
        } finally {
            endTime = System.currentTimeMillis();
        }
    }
    
    public boolean hasStarted() {
        return beginTime != null;
    }
    
    public boolean hasFinished() {
        return endTime != null;
    }
    
    public Long getElapsedTime() {
        if (beginTime == null || endTime == null) {
            return null;
        }
        return endTime - beginTime;
    }
    
    public Boolean getProp(String key, Boolean defaultValue) {
        return WizProps.get(getPropNamePrepared(key), defaultValue);
    }

    public void setProp(String key, Boolean value) {
        WizProps.set(getPropNamePrepared(key), value);
    }

    public Integer getProp(String key, Integer defaultValue) {
        return WizProps.get(getPropNamePrepared(key), defaultValue);
    }

    public void setProp(String key, Integer value) {
        WizProps.set(getPropNamePrepared(key), value);
    }

    public Double getProp(String key, Double defaultValue) {
        return WizProps.get(getPropNamePrepared(key), defaultValue);
    }

    public void setProp(String key, Double value) {
        WizProps.set(getPropNamePrepared(key), value);
    }

    public String getProp(String key, String defaultValue) {
        return WizProps.get(getPropNamePrepared(key), defaultValue);
    }

    public void setProp(String key, String value) {
        WizProps.set(getPropNamePrepared(key), value);
    }
    
    private String getPropNamePrepared(String key) {
        return "ACT_" + getMeta().name() + "_PROP_" + key;
    }
    
}
