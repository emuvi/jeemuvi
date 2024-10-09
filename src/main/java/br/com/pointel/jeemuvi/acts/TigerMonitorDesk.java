package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.wizes.WizBase;
import br.com.pointel.jeemuvi.wizes.WizGroovy;
import br.com.pointel.jeemuvi.wizes.WizNative;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.awt.event.InputEvent;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author emuvi
 */
public class TigerMonitorDesk extends javax.swing.JFrame {

    private final DefaultComboBoxModel<String> modelGroovy = new DefaultComboBoxModel<>();
    private final AtomicInteger runCount = new AtomicInteger(0);

    public TigerMonitorDesk() {
        initComponents();
        initFrame();
        initMonitor();
    }

    private void initFrame() {
        WizGroovy.loadNames(modelGroovy);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }

    private void initMonitor() {
        new Thread("Tiger Monitor") {
            @Override
            public void run() {
                while (isDisplayable()) {
                    try {
                        if (fieldActive.isSelected()) {
                            var activeWindowTitle = WizNative.getWindowActiveTitle();
                            SwingUtilities.invokeLater(() -> fieldOnWindow.setText(activeWindowTitle));
                            if (shouldRun(activeWindowTitle)) {
                                WizGroovy.run(fieldSource.getText());
                                SwingUtilities.invokeLater(() -> labelRunCount.setText("* " + runCount.incrementAndGet()));
                            }
                        }
                        WizBase.sleep(getInterval());
                    } catch (Exception e) {
                        try {
                            SwingUtilities.invokeAndWait(() -> {
                                fieldActive.setSelected(false);
                                fieldTrigger.setSelected(false);
                                WizSwing.showError(e);
                            });
                        } catch (Exception ei) {
                            ei.printStackTrace();
                        }
                    } finally {
                        WizBase.sleep(10);
                    }
                }
            }

            private Integer getInterval() {
                return (Integer) fieldInterval.getValue();
            }

            private boolean shouldRun(String activeWindowTitle) {
                return fieldTrigger.isSelected()
                        && Objects.equals(activeWindowTitle, fieldTriggerTitle.getText());
            }

        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldActive = new javax.swing.JCheckBox();
        labelRunCount = new javax.swing.JLabel();
        labelInterval = new javax.swing.JLabel();
        fieldInterval = new javax.swing.JSpinner();
        labelOnWindow = new javax.swing.JLabel();
        fieldOnWindow = new javax.swing.JTextField();
        buttonMark = new javax.swing.JButton();
        fieldTrigger = new javax.swing.JCheckBox();
        fieldTriggerTitle = new javax.swing.JTextField();
        scrollSource = new javax.swing.JScrollPane();
        fieldSource = new javax.swing.JTextArea();
        buttonSources = new javax.swing.JButton();
        buttonSourceNew = new javax.swing.JButton();
        buttonSourceDel = new javax.swing.JButton();
        fieldSources = new javax.swing.JComboBox<>();
        buttonSourceGet = new javax.swing.JButton();
        buttonSourceSet = new javax.swing.JButton();
        buttonRun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TigerMonitor");
        setName("TigerMonitorDesk"); // NOI18N

        fieldActive.setText("Active");
        fieldActive.setName("Active"); // NOI18N
        fieldActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldActiveActionPerformed(evt);
            }
        });

        labelRunCount.setText("* 0");

        labelInterval.setText("Interval");

        fieldInterval.setName("Interval"); // NOI18N
        fieldInterval.setValue(1000);

        labelOnWindow.setText("On Window");

        fieldOnWindow.setName(""); // NOI18N

        buttonMark.setText("Mark");
        buttonMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMarkActionPerformed(evt);
            }
        });

        fieldTrigger.setText("Trigger On");
        fieldTrigger.setName("TriggerOn"); // NOI18N

        fieldTriggerTitle.setName("TriggerOnTitle"); // NOI18N

        fieldSource.setColumns(20);
        fieldSource.setRows(5);
        fieldSource.setName("Source"); // NOI18N
        scrollSource.setViewportView(fieldSource);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollSource)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldOnWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMark))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldTrigger)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldTriggerTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonSources)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSourceNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSourceDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldSources, 0, 187, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSourceGet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSourceSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRun))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOnWindow)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldActive)
                                .addGap(18, 18, 18)
                                .addComponent(labelRunCount)
                                .addGap(18, 18, 18)
                                .addComponent(labelInterval)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldActive)
                    .addComponent(labelInterval)
                    .addComponent(fieldInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRunCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelOnWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldOnWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMark))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldTriggerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTrigger))
                .addGap(18, 18, 18)
                .addComponent(scrollSource, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSourceSet)
                    .addComponent(buttonSourceGet)
                    .addComponent(fieldSources, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSources)
                    .addComponent(buttonSourceNew)
                    .addComponent(buttonSourceDel)
                    .addComponent(buttonRun))
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

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        try {
            WizGroovy.run(fieldSource.getText());
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRunActionPerformed

    private void buttonMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMarkActionPerformed
        fieldTriggerTitle.setText(fieldOnWindow.getText());
    }//GEN-LAST:event_buttonMarkActionPerformed

    private void fieldActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldActiveActionPerformed
        runCount.set(0);
        labelRunCount.setText("* 0");
    }//GEN-LAST:event_fieldActiveActionPerformed

    private String getSourceName() {
        return fieldSources.getSelectedItem().toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMark;
    private javax.swing.JButton buttonRun;
    private javax.swing.JButton buttonSourceDel;
    private javax.swing.JButton buttonSourceGet;
    private javax.swing.JButton buttonSourceNew;
    private javax.swing.JButton buttonSourceSet;
    private javax.swing.JButton buttonSources;
    private javax.swing.JCheckBox fieldActive;
    private javax.swing.JSpinner fieldInterval;
    private javax.swing.JTextField fieldOnWindow;
    private javax.swing.JTextArea fieldSource;
    private javax.swing.JComboBox<String> fieldSources;
    private javax.swing.JCheckBox fieldTrigger;
    private javax.swing.JTextField fieldTriggerTitle;
    private javax.swing.JLabel labelInterval;
    private javax.swing.JLabel labelOnWindow;
    private javax.swing.JLabel labelRunCount;
    private javax.swing.JScrollPane scrollSource;
    // End of variables declaration//GEN-END:variables
}
