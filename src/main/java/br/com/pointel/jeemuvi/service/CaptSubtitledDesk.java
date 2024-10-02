package br.com.pointel.jeemuvi.service;

import br.com.pointel.jeemuvi.gears.Dropper;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.io.File;

/**
 *
 * @author emuvi
 */
public class CaptSubtitledDesk extends javax.swing.JFrame {

    public CaptSubtitledDesk() {
        initComponents();
        initFrame();
    }

    private void initFrame() {
        WizSwing.initFrame(this);
        new Dropper(fieldOrigin, fieldDestiny, fieldLinker).init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelOrigem = new javax.swing.JLabel();
        fieldOrigin = new javax.swing.JTextField();
        labelDestino = new javax.swing.JLabel();
        fieldDestiny = new javax.swing.JTextField();
        labelLinker = new javax.swing.JLabel();
        fieldLinker = new javax.swing.JTextField();
        buttonRun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CaptSubtitled");
        setName("CaptSubtitledDesk"); // NOI18N

        labelOrigem.setText("Origin");

        fieldOrigin.setName("Origin"); // NOI18N

        labelDestino.setText("Destiny");

        fieldDestiny.setName("Destiny"); // NOI18N

        labelLinker.setText("Linker");

        fieldLinker.setName("Linker"); // NOI18N

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
                    .addComponent(fieldOrigin)
                    .addComponent(fieldDestiny)
                    .addComponent(fieldLinker)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOrigem)
                            .addComponent(labelDestino)
                            .addComponent(labelLinker)
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
                .addComponent(fieldOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLinker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldLinker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        try {
            new CaptSubtitled(
                    new File(fieldOrigin.getText()), 
                    new File(fieldDestiny.getText()), 
                    new File(fieldLinker.getText())
            ).run();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRunActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRun;
    private javax.swing.JTextField fieldDestiny;
    private javax.swing.JTextField fieldLinker;
    private javax.swing.JTextField fieldOrigin;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelLinker;
    private javax.swing.JLabel labelOrigem;
    // End of variables declaration//GEN-END:variables
}
