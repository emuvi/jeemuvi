package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.gears.SwingNotify;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

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
        labelPutLinkOn = new javax.swing.JLabel();
        fieldPutLinkOn = new javax.swing.JTextField();
        buttonWatch = new javax.swing.JButton();
        fieldCopyLink = new javax.swing.JCheckBox();

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

        labelPutLinkOn.setText("Put Link On");

        fieldPutLinkOn.setName("PutLinkOn"); // NOI18N

        buttonWatch.setText("Watch");
        buttonWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWatchActionPerformed(evt);
            }
        });

        fieldCopyLink.setText("Copy Link");
        fieldCopyLink.setName("CopyLink"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldFolder)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonCapture)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRemake))
                            .addComponent(labelFolder)
                            .addComponent(labelAddAtTheEnd))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fieldAddAtTheEnd)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPutLinkOn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(fieldCopyLink, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldPutLinkOn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonWatch)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPutLinkOn)
                    .addComponent(fieldCopyLink))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPutLinkOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonWatch))
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
            var link = "[[" + saved.nameMark() + "]]";
            if (!fieldPutLinkOn.getText().isBlank()) {
                putLinkOn(link);
            }
            if (fieldCopyLink.isSelected()) {
                WizSwing.putStringOnClipboard(link);
            }
            SwingNotify.show(saved, 2);
        } catch (Exception e) { 
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonCaptureActionPerformed

    private void putLinkOn(String link) throws Exception {
        var file = new File(fieldPutLinkOn.getText());
        var source = Files.readString(file.toPath(), StandardCharsets.UTF_8).trim();
        if (!source.isEmpty()) {
            source += "\n\n";
        }
        source += link;
        Files.writeString(file.toPath(), source, StandardCharsets.UTF_8);
    }
    
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

    private void buttonWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWatchActionPerformed
        new TextFileWatcherDesk(new File(fieldPutLinkOn.getText())).setVisible(true);
    }//GEN-LAST:event_buttonWatchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCapture;
    private javax.swing.JButton buttonRemake;
    private javax.swing.JButton buttonWatch;
    private javax.swing.JTextField fieldAddAtTheEnd;
    private javax.swing.JCheckBox fieldCopyLink;
    private javax.swing.JTextField fieldFolder;
    private javax.swing.JTextField fieldPutLinkOn;
    private javax.swing.JLabel labelAddAtTheEnd;
    private javax.swing.JLabel labelFolder;
    private javax.swing.JLabel labelPutLinkOn;
    // End of variables declaration//GEN-END:variables
}
