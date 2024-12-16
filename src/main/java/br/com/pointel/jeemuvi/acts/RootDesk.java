package br.com.pointel.jeemuvi.acts;

import java.io.File;
import javax.swing.JTextField;
import br.com.pointel.jarch.gears.SwingDropper;
import br.com.pointel.jarch.mage.WizSwing;

/**
 *
 * @author emuvi
 */
public class RootDesk extends javax.swing.JFrame {

    public RootDesk() {
        initComponents();
        initFrame();
        fieldRoot.setText(Root.get());
    }

    private void initFrame() {
        SwingDropper.initAllOn(this);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGet = new javax.swing.JButton();
        fieldRoot = new javax.swing.JTextField();
        fieldRoot1 = new javax.swing.JTextField();
        buttonRootSet1 = new javax.swing.JButton();
        buttonRootSelect1 = new javax.swing.JButton();
        fieldRoot2 = new javax.swing.JTextField();
        buttonRootSet2 = new javax.swing.JButton();
        buttonRootSelect2 = new javax.swing.JButton();
        fieldRoot3 = new javax.swing.JTextField();
        buttonRootSet3 = new javax.swing.JButton();
        buttonRootSelect3 = new javax.swing.JButton();
        fieldRoot4 = new javax.swing.JTextField();
        buttonRootSet4 = new javax.swing.JButton();
        buttonRootSelect4 = new javax.swing.JButton();
        fieldRoot5 = new javax.swing.JTextField();
        buttonRootSet5 = new javax.swing.JButton();
        buttonRootSelect5 = new javax.swing.JButton();
        fieldRoot6 = new javax.swing.JTextField();
        buttonRootSet6 = new javax.swing.JButton();
        buttonRootSelect6 = new javax.swing.JButton();
        fieldRoot7 = new javax.swing.JTextField();
        buttonRootSet7 = new javax.swing.JButton();
        buttonRootSelect7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Root");
        setName("RootDesk"); // NOI18N

        buttonGet.setText("=");
        buttonGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGetActionPerformed(evt);
            }
        });

        fieldRoot1.setName("Root1"); // NOI18N

        buttonRootSet1.setText("&");
        buttonRootSet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSet1ActionPerformed(evt);
            }
        });

        buttonRootSelect1.setText("*");
        buttonRootSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSelect1ActionPerformed(evt);
            }
        });

        fieldRoot2.setName("Root2"); // NOI18N

        buttonRootSet2.setText("&");
        buttonRootSet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSet2ActionPerformed(evt);
            }
        });

        buttonRootSelect2.setText("*");
        buttonRootSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSelect2ActionPerformed(evt);
            }
        });

        fieldRoot3.setName("Root3"); // NOI18N

        buttonRootSet3.setText("&");
        buttonRootSet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSet3ActionPerformed(evt);
            }
        });

        buttonRootSelect3.setText("*");
        buttonRootSelect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSelect3ActionPerformed(evt);
            }
        });

        fieldRoot4.setName("Root4"); // NOI18N

        buttonRootSet4.setText("&");
        buttonRootSet4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSet4ActionPerformed(evt);
            }
        });

        buttonRootSelect4.setText("*");
        buttonRootSelect4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSelect4ActionPerformed(evt);
            }
        });

        fieldRoot5.setName("Root5"); // NOI18N

        buttonRootSet5.setText("&");
        buttonRootSet5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSet5ActionPerformed(evt);
            }
        });

        buttonRootSelect5.setText("*");
        buttonRootSelect5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSelect5ActionPerformed(evt);
            }
        });

        fieldRoot6.setName("Root6"); // NOI18N

        buttonRootSet6.setText("&");
        buttonRootSet6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSet6ActionPerformed(evt);
            }
        });

        buttonRootSelect6.setText("*");
        buttonRootSelect6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSelect6ActionPerformed(evt);
            }
        });

        fieldRoot7.setName("Root7"); // NOI18N

        buttonRootSet7.setText("&");
        buttonRootSet7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSet7ActionPerformed(evt);
            }
        });

        buttonRootSelect7.setText("*");
        buttonRootSelect7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRootSelect7ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldRoot2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(fieldRoot1)
                            .addComponent(fieldRoot3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonRootSet1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRootSelect1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonRootSet2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRootSelect2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonRootSet3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRootSelect3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldRoot7)
                            .addComponent(fieldRoot5)
                            .addComponent(fieldRoot4)
                            .addComponent(fieldRoot6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonRootSet4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRootSelect4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonRootSet5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRootSelect5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonRootSet6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRootSelect6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonRootSet7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRootSelect7))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonGet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldRoot)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGet)
                    .addComponent(fieldRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRoot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRootSet1)
                    .addComponent(buttonRootSelect1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRoot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRootSet2)
                    .addComponent(buttonRootSelect2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRoot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRootSet3)
                    .addComponent(buttonRootSelect3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRoot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRootSet4)
                    .addComponent(buttonRootSelect4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRoot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRootSet5)
                    .addComponent(buttonRootSelect5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRoot6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRootSet6)
                    .addComponent(buttonRootSelect6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRoot7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRootSet7)
                    .addComponent(buttonRootSelect7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGetActionPerformed
        fieldRoot.setText(Root.get());
    }//GEN-LAST:event_buttonGetActionPerformed

    private void buttonRootSet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSet1ActionPerformed
        Root.set(fieldRoot1.getText());
        buttonGetActionPerformed(evt);
    }//GEN-LAST:event_buttonRootSet1ActionPerformed

    private void buttonRootSet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSet2ActionPerformed
        Root.set(fieldRoot2.getText());
        buttonGetActionPerformed(evt);
    }//GEN-LAST:event_buttonRootSet2ActionPerformed

    private void buttonRootSet3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSet3ActionPerformed
        Root.set(fieldRoot3.getText());
        buttonGetActionPerformed(evt);
    }//GEN-LAST:event_buttonRootSet3ActionPerformed

    private void buttonRootSet4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSet4ActionPerformed
        Root.set(fieldRoot4.getText());
        buttonGetActionPerformed(evt);
    }//GEN-LAST:event_buttonRootSet4ActionPerformed

    private void buttonRootSet5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSet5ActionPerformed
        Root.set(fieldRoot5.getText());
        buttonGetActionPerformed(evt);
    }//GEN-LAST:event_buttonRootSet5ActionPerformed

    private void buttonRootSet6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSet6ActionPerformed
        Root.set(fieldRoot6.getText());
        buttonGetActionPerformed(evt);
    }//GEN-LAST:event_buttonRootSet6ActionPerformed

    private void buttonRootSet7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSet7ActionPerformed
        Root.set(fieldRoot7.getText());
        buttonGetActionPerformed(evt);
    }//GEN-LAST:event_buttonRootSet7ActionPerformed

    private void buttonRootSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSelect1ActionPerformed
        selectRoot(fieldRoot1);
    }//GEN-LAST:event_buttonRootSelect1ActionPerformed

    private void buttonRootSelect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSelect2ActionPerformed
        selectRoot(fieldRoot2);
    }//GEN-LAST:event_buttonRootSelect2ActionPerformed

    private void buttonRootSelect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSelect3ActionPerformed
        selectRoot(fieldRoot3);
    }//GEN-LAST:event_buttonRootSelect3ActionPerformed

    private void buttonRootSelect4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSelect4ActionPerformed
        selectRoot(fieldRoot4);
    }//GEN-LAST:event_buttonRootSelect4ActionPerformed

    private void buttonRootSelect5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSelect5ActionPerformed
        selectRoot(fieldRoot5);
    }//GEN-LAST:event_buttonRootSelect5ActionPerformed

    private void buttonRootSelect6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSelect6ActionPerformed
        selectRoot(fieldRoot6);
    }//GEN-LAST:event_buttonRootSelect6ActionPerformed

    private void buttonRootSelect7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRootSelect7ActionPerformed
        selectRoot(fieldRoot7);
    }//GEN-LAST:event_buttonRootSelect7ActionPerformed

    private void selectRoot(JTextField forField) {
        var selected = WizSwing.selectFolder(new File(forField.getText()));
        if (selected != null) {
            forField.setText(selected.getAbsolutePath());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGet;
    private javax.swing.JButton buttonRootSelect1;
    private javax.swing.JButton buttonRootSelect2;
    private javax.swing.JButton buttonRootSelect3;
    private javax.swing.JButton buttonRootSelect4;
    private javax.swing.JButton buttonRootSelect5;
    private javax.swing.JButton buttonRootSelect6;
    private javax.swing.JButton buttonRootSelect7;
    private javax.swing.JButton buttonRootSet1;
    private javax.swing.JButton buttonRootSet2;
    private javax.swing.JButton buttonRootSet3;
    private javax.swing.JButton buttonRootSet4;
    private javax.swing.JButton buttonRootSet5;
    private javax.swing.JButton buttonRootSet6;
    private javax.swing.JButton buttonRootSet7;
    private javax.swing.JTextField fieldRoot;
    private javax.swing.JTextField fieldRoot1;
    private javax.swing.JTextField fieldRoot2;
    private javax.swing.JTextField fieldRoot3;
    private javax.swing.JTextField fieldRoot4;
    private javax.swing.JTextField fieldRoot5;
    private javax.swing.JTextField fieldRoot6;
    private javax.swing.JTextField fieldRoot7;
    // End of variables declaration//GEN-END:variables
}
