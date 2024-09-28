package br.com.pointel.jeemuvi;

import br.com.pointel.jeemuvi.wizard.WizProps;

/**
 *
 * @author emuvi
 */
public abstract class Act {
    
    public abstract String getName();
    
    public abstract String getHint();
    
    public abstract String[] getProps();
    
    public abstract void execute() throws Exception;
    
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
        return "ACT_" + getName() + "_PROP_" + key;
    }
    
}
