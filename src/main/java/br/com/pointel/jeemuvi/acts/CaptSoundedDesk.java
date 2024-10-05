package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.io.File;
import javax.swing.JTextField;

/**
 *
 * @author emuvi
 */
public class CaptSoundedDesk extends javax.swing.JFrame {

    public CaptSoundedDesk() {
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

        labelDriveName = new javax.swing.JLabel();
        fieldDriveName = new javax.swing.JTextField();
        fieldOriginPath = new javax.swing.JTextField();
        labelOriginPath = new javax.swing.JLabel();
        labelDestinyFolder = new javax.swing.JLabel();
        fieldDestinyFolder = new javax.swing.JTextField();
        labelVisioFolder = new javax.swing.JLabel();
        fieldVisioFolder = new javax.swing.JTextField();
        labelLinkerNote = new javax.swing.JLabel();
        fieldLinkerNote = new javax.swing.JTextField();
        buttonRun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CaptSounded");
        setName("CaptSoundedDesk"); // NOI18N

        labelDriveName.setText("Drive Name");

        fieldDriveName.setName("DriveName"); // NOI18N

        fieldOriginPath.setName("OriginPath"); // NOI18N

        labelOriginPath.setText("Origin Path");

        labelDestinyFolder.setText("Destiny Folder");

        fieldDestinyFolder.setName("DestinyFolder"); // NOI18N

        labelVisioFolder.setText("Visio Folder");

        fieldVisioFolder.setName("VisioFolder"); // NOI18N

        labelLinkerNote.setText("Linker Note");

        fieldLinkerNote.setName("LinkerNote"); // NOI18N

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDriveName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDriveName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelOriginPath)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fieldOriginPath, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
                    .addComponent(fieldDestinyFolder)
                    .addComponent(fieldVisioFolder)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDestinyFolder)
                            .addComponent(labelVisioFolder)
                            .addComponent(labelLinkerNote))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fieldLinkerNote)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonRun)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDriveName)
                    .addComponent(labelOriginPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDriveName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldOriginPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDestinyFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDestinyFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVisioFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldVisioFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLinkerNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldLinkerNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        try {
            new CaptSounded(
                    fieldDriveName.getText(),
                    fieldOriginPath.getText(),
                    new File(fieldDestinyFolder.getText()),
                    new File(fieldVisioFolder.getText()),
                    new File(fieldLinkerNote.getText())
            ).run();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRunActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRun;
    private javax.swing.JTextField fieldDestinyFolder;
    private javax.swing.JTextField fieldDriveName;
    private javax.swing.JTextField fieldLinkerNote;
    private javax.swing.JTextField fieldOriginPath;
    private javax.swing.JTextField fieldVisioFolder;
    private javax.swing.JLabel labelDestinyFolder;
    private javax.swing.JLabel labelDriveName;
    private javax.swing.JLabel labelLinkerNote;
    private javax.swing.JLabel labelOriginPath;
    private javax.swing.JLabel labelVisioFolder;
    // End of variables declaration//GEN-END:variables
}
