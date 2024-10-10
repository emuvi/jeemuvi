package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.wizes.WizChats;
import br.com.pointel.jeemuvi.wizes.WizGroovy;
import br.com.pointel.jeemuvi.wizes.WizStore;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.awt.event.InputEvent;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author emuvi
 */
public class GroovyTheWayDesk extends javax.swing.JFrame {

    private final DefaultComboBoxModel<String> modelGroovy = new DefaultComboBoxModel<>();
    private final DefaultComboBoxModel<String> modelStore = new DefaultComboBoxModel<>();
    
    public GroovyTheWayDesk() {
        initComponents();
        initFrame();
    }
    
    private void initFrame() {
        WizGroovy.loadNames(modelGroovy);
        WizStore.loadNames(modelStore);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSources = new javax.swing.JButton();
        buttonSourceNew = new javax.swing.JButton();
        buttonSourceDel = new javax.swing.JButton();
        fieldSources = new javax.swing.JComboBox<>();
        buttonSourceGet = new javax.swing.JButton();
        buttonSourceSet = new javax.swing.JButton();
        buttonRun = new javax.swing.JButton();
        scrollSource = new javax.swing.JScrollPane();
        fieldSource = new javax.swing.JTextArea();
        buttonCapture = new javax.swing.JButton();
        fieldAssets = new javax.swing.JComboBox<>();
        fieldSearchAsset = new javax.swing.JTextField();
        buttonInsert = new javax.swing.JButton();
        fieldSearchSource = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GroovyTheWay");
        setName("GroovyTheWayDesk"); // NOI18N

        buttonSources.setText("#");
        buttonSources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSourcesActionPerformed(evt);
            }
        });

        buttonSourceNew.setText("+");
        buttonSourceNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSourceNewActionPerformed(evt);
            }
        });

        buttonSourceDel.setText("-");
        buttonSourceDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSourceDelActionPerformed(evt);
            }
        });

        fieldSources.setModel(modelGroovy);
        fieldSources.setName("AllSources"); // NOI18N

        buttonSourceGet.setText("=");
        buttonSourceGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSourceGetActionPerformed(evt);
            }
        });

        buttonSourceSet.setText("&");
        buttonSourceSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSourceSetActionPerformed(evt);
            }
        });

        buttonRun.setText("*");
        buttonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRunActionPerformed(evt);
            }
        });

        fieldSource.setColumns(20);
        fieldSource.setRows(5);
        fieldSource.setName("Source"); // NOI18N
        scrollSource.setViewportView(fieldSource);

        buttonCapture.setText("#");
        buttonCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaptureActionPerformed(evt);
            }
        });

        fieldAssets.setModel(modelStore);

        buttonInsert.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollSource)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSources)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSourceNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSourceDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldSources, 0, 157, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldSearchSource, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSourceGet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSourceSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRun))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCapture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldAssets, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldSearchAsset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonInsert)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSourceSet)
                    .addComponent(buttonSourceGet)
                    .addComponent(fieldSources, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSources)
                    .addComponent(buttonSourceNew)
                    .addComponent(buttonSourceDel)
                    .addComponent(buttonRun)
                    .addComponent(fieldSearchSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollSource, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCapture)
                    .addComponent(buttonInsert)
                    .addComponent(fieldAssets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSearchAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSourcesActionPerformed
        try {
            if ((evt.getModifiers() & InputEvent.ALT_MASK) != 0) {
                WizGroovy.loadNames(modelGroovy);
            } else {
                WizGroovy.openFolder();
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonSourcesActionPerformed

    private void buttonSourceNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSourceNewActionPerformed
        try {
            var sourceName = WizSwing.showInput("New Source");
            if (sourceName == null || sourceName.isBlank()) {
                return;
            }
            WizGroovy.create(sourceName);
            WizGroovy.loadNames(modelGroovy);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonSourceNewActionPerformed

    private void buttonSourceDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSourceDelActionPerformed
        try {
            WizGroovy.delete(getSourceName());
            WizGroovy.loadNames(modelGroovy);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonSourceDelActionPerformed

    private void buttonSourceGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSourceGetActionPerformed
        try {
            fieldSource.setText(WizGroovy.load(getSourceName()));
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonSourceGetActionPerformed

    private void buttonSourceSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSourceSetActionPerformed
        try {
            WizGroovy.save(getSourceName(), fieldSource.getText());
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonSourceSetActionPerformed

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        try {
            WizGroovy.run(fieldSource.getText());
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRunActionPerformed

    private void buttonCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaptureActionPerformed
        try {
            if ((evt.getModifiers() & InputEvent.ALT_MASK) != 0) {
                WizStore.loadNames(modelStore);
            } else {
                // TODO
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonCaptureActionPerformed

    private String getSourceName() {
        return fieldSources.getSelectedItem().toString();
    }
    
    private String getAssetName() {
        return fieldAssets.getSelectedItem().toString();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCapture;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonRun;
    private javax.swing.JButton buttonSourceDel;
    private javax.swing.JButton buttonSourceGet;
    private javax.swing.JButton buttonSourceNew;
    private javax.swing.JButton buttonSourceSet;
    private javax.swing.JButton buttonSources;
    private javax.swing.JComboBox<String> fieldAssets;
    private javax.swing.JTextField fieldSearchAsset;
    private javax.swing.JTextField fieldSearchSource;
    private javax.swing.JTextArea fieldSource;
    private javax.swing.JComboBox<String> fieldSources;
    private javax.swing.JScrollPane scrollSource;
    // End of variables declaration//GEN-END:variables
}
