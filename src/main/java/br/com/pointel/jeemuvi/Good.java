package br.com.pointel.jeemuvi;

/**
 *
 * @author emuvi
 */
public record Good (Class<? extends Act> clazz, ActMeta meta) {
    
    @Override
    public String toString() {
        return meta().name();
    }

}
