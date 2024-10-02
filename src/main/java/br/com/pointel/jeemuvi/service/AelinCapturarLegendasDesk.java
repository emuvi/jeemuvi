package br.com.pointel.jeemuvi.service;

import br.com.pointel.jeemuvi.gears.Dropper;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.io.File;

/**
 *
 * @author emuvi
 */
public class AelinCapturarLegendasDesk extends javax.swing.JFrame {

    public AelinCapturarLegendasDesk() {
        initComponents();
        initFrame();
    }

    private void initFrame() {
        WizSwing.initFrame(this);
        new Dropper(fieldOrigem, fieldDestino, fieldVinculador).init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelOrigem = new javax.swing.JLabel();
        fieldOrigem = new javax.swing.JTextField();
        labelDestino = new javax.swing.JLabel();
        fieldDestino = new javax.swing.JTextField();
        labelVinculador = new javax.swing.JLabel();
        fieldVinculador = new javax.swing.JTextField();
        buttonRun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aelin Capturar Legendas");
        setName("AelinCapturarLegendasDesk"); // NOI18N

        labelOrigem.setText("Origem");

        fieldOrigem.setName("Origem"); // NOI18N

        labelDestino.setText("Destino");

        fieldDestino.setName("Destino"); // NOI18N

        labelVinculador.setText("Vinculador");

        fieldVinculador.setName("Vinculador"); // NOI18N

        buttonRun.setText("Run");
        buttonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldOrigem)
                    .addComponent(fieldDestino)
                    .addComponent(fieldVinculador)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOrigem)
                            .addComponent(labelDestino)
                            .addComponent(labelVinculador)
                            .addComponent(buttonRun))
                        .addGap(0, 249, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOrigem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVinculador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldVinculador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        try {
            new AelinCapturarLegendas(
                    new File(fieldOrigem.getText()), 
                    new File(fieldDestino.getText()), 
                    new File(fieldVinculador.getText())
            ).run();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRunActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRun;
    private javax.swing.JTextField fieldDestino;
    private javax.swing.JTextField fieldOrigem;
    private javax.swing.JTextField fieldVinculador;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelOrigem;
    private javax.swing.JLabel labelVinculador;
    // End of variables declaration//GEN-END:variables
}
