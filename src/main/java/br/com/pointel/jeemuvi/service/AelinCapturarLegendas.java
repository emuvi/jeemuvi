package br.com.pointel.jeemuvi.service;

import java.io.File;

/**
 *
 * @author emuvi
 */
public class AelinCapturarLegendas {
    
    private final File origem;
    private final File destino;
    private final File vinculador;

    public AelinCapturarLegendas(File origem, File destino, File vinculador) {
        this.origem = origem;
        this.destino = destino;
        this.vinculador = vinculador;
    }
    
    public void run() throws Exception {
        
    }
    
}
