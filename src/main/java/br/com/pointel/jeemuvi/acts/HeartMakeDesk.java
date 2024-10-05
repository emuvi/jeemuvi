package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.gears.SwingNotify;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.io.File;
import java.util.Objects;

/**
 *
 * @author emuvi
 */
public class HeartMakeDesk extends javax.swing.JFrame {

    public HeartMakeDesk() {
        initComponents();
        initFrame();
    }
    
    private void initFrame() {
        SwingDropper.initAllOn(this);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFolder = new javax.swing.JLabel();
        fieldFolder = new javax.swing.JTextField();
        buttonCapture = new javax.swing.JButton();
        buttonRemake = new javax.swing.JButton();
        labelAddAtTheEnd = new javax.swing.JLabel();
        fieldAddAtTheEnd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HeartMake");
        setName("HeartMakeDesk"); // NOI18N

        labelFolder.setText("Folder");

        fieldFolder.setName("Folder"); // NOI18N

        buttonCapture.setText("Capture");
        buttonCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaptureActionPerformed(evt);
            }
        });

        buttonRemake.setText("Remake");
        buttonRemake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemakeActionPerformed(evt);
            }
        });

        labelAddAtTheEnd.setText("Add At The End");

        fieldAddAtTheEnd.setName("AddAtEnd"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldFolder)
                    .addComponent(fieldAddAtTheEnd)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonCapture)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRemake))
                            .addComponent(labelFolder)
                            .addComponent(labelAddAtTheEnd))
                        .addGap(0, 238, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCapture)
                    .addComponent(buttonRemake))
                .addGap(18, 18, 18)
                .addComponent(labelFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddAtTheEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldAddAtTheEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaptureActionPerformed
        try {
            var saved = new HeartMake(
                    new File(fieldFolder.getText()),
                    fieldAddAtTheEnd.getText()
            ).capture();
            SwingNotify.show(saved, 2);
        } catch (Exception e) { 
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonCaptureActionPerformed

    private void buttonRemakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemakeActionPerformed
        if (!WizSwing.showConfirm("Are you sure to remake the heart?")) {
            return;
        }
        buttonRemake.setEnabled(false);
        new HeartMake(
                new File(fieldFolder.getText()),
                fieldAddAtTheEnd.getText()
        ).startRemake();
        WizSwing.triggerDebounce(3000, () -> buttonRemake.setEnabled(true));
    }//GEN-LAST:event_buttonRemakeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCapture;
    private javax.swing.JButton buttonRemake;
    private javax.swing.JTextField fieldAddAtTheEnd;
    private javax.swing.JTextField fieldFolder;
    private javax.swing.JLabel labelAddAtTheEnd;
    private javax.swing.JLabel labelFolder;
    // End of variables declaration//GEN-END:variables
}
