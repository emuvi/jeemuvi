package br.com.pointel.jeemuvi.acts;

import java.io.File;
import br.com.pointel.jarch.gears.SwingDropper;
import br.com.pointel.jarch.mage.WizSwing;

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
        SwingDropper.initAllOn(this);
        WizSwing.initFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelOrigem = new javax.swing.JLabel();
        fieldOrigin = new javax.swing.JTextField();
        labelDestino = new javax.swing.JLabel();
        fieldDestinyFolder = new javax.swing.JTextField();
        labelLinker = new javax.swing.JLabel();
        fieldLinker = new javax.swing.JTextField();
        buttonRun = new javax.swing.JButton();
        fieldDestinyName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CaptSubtitled");
        setName("CaptSubtitledDesk"); // NOI18N

        labelOrigem.setText("Origin");

        fieldOrigin.setName("Origin"); // NOI18N

        labelDestino.setText("Destiny");

        fieldDestinyFolder.setName("DestinyFolder"); // NOI18N

        labelLinker.setText("Linker");

        fieldLinker.setName("Linker"); // NOI18N

        buttonRun.setText("Run");
        buttonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRunActionPerformed(evt);
            }
        });

        fieldDestinyName.setText("{name}");
        fieldDestinyName.setName("DestinyName"); // NOI18N

        jLabel1.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRun)
                            .addComponent(labelOrigem))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDestinyFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(labelDestino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldDestinyName, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLinker)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldOrigin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldLinker))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRun)
                .addGap(18, 18, 18)
                .addComponent(labelOrigem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDestino)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDestinyFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDestinyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLinker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldLinker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        try {
            new CaptSubtitled(
                    new File(fieldOrigin.getText()), 
                    new File(fieldDestinyFolder.getText()), 
                    fieldDestinyName.getText(),
                    new File(fieldLinker.getText())
            ).run();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRunActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRun;
    private javax.swing.JTextField fieldDestinyFolder;
    private javax.swing.JTextField fieldDestinyName;
    private javax.swing.JTextField fieldLinker;
    private javax.swing.JTextField fieldOrigin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelLinker;
    private javax.swing.JLabel labelOrigem;
    // End of variables declaration//GEN-END:variables
}
