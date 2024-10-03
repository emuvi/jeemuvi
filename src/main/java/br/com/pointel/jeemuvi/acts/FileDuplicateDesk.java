package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.io.File;

/**
 *
 * @author emuvi
 */
public class FileDuplicateDesk extends javax.swing.JFrame {

    public FileDuplicateDesk() {
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

        labelPath = new javax.swing.JLabel();
        fieldPath = new javax.swing.JTextField();
        buttonRun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FileDuplicate");
        setName("FileDuplicateDesk"); // NOI18N

        labelPath.setText("Path");

        fieldPath.setName("Path"); // NOI18N

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPath)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fieldPath)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 156, Short.MAX_VALUE)
                        .addComponent(buttonRun)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        try {
            new FileDuplicate(new File(fieldPath.getText())).run();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRunActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRun;
    private javax.swing.JTextField fieldPath;
    private javax.swing.JLabel labelPath;
    // End of variables declaration//GEN-END:variables
}
