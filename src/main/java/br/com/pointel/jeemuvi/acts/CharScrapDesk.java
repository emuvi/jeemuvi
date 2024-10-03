package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.wizard.WizBase;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.io.File;
import javax.swing.SwingUtilities;

/**
 *
 * @author emuvi
 */
public class CharScrapDesk extends javax.swing.JFrame {

    public CharScrapDesk() {
        initComponents();
        initFrame();
    }

    private void initFrame() {
        labelScrapped.setVisible(false);
        SwingDropper.initAllOn(this);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }
    
    public void triggerDisplayScrapped() { 
        labelScrapped.setVisible(true);
        new Thread("Hide Scrapped") {
            @Override
            public void run() {
                WizBase.sleep(3000);
                SwingUtilities.invokeLater(() -> labelScrapped.setVisible(false));
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelOrigin = new javax.swing.JLabel();
        fieldOrigin = new javax.swing.JTextField();
        fieldLines = new javax.swing.JSpinner();
        labelLines = new javax.swing.JLabel();
        buttonScrap = new javax.swing.JButton();
        fieldDeleteOnEmpty = new javax.swing.JCheckBox();
        labelScrapped = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CharScrap");
        setName("CharScrapDesk"); // NOI18N

        labelOrigin.setText("Origin");

        fieldOrigin.setName("Origin"); // NOI18N

        fieldLines.setName("Lines"); // NOI18N
        fieldLines.setValue(30);

        labelLines.setText("Lines");

        buttonScrap.setText("Scrap");
        buttonScrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonScrapActionPerformed(evt);
            }
        });

        fieldDeleteOnEmpty.setText("Delete On Empty");
        fieldDeleteOnEmpty.setName("DeleteOnEmpty"); // NOI18N

        labelScrapped.setText("Scrapped!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelOrigin)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fieldOrigin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldLines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLines)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelScrapped)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(fieldDeleteOnEmpty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonScrap)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrigin)
                    .addComponent(labelLines))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonScrap)
                    .addComponent(fieldDeleteOnEmpty)
                    .addComponent(labelScrapped))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonScrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonScrapActionPerformed
        try {
            new CharScrap(
                    new File(fieldOrigin.getText()),
                    (Integer) fieldLines.getValue(),
                    fieldDeleteOnEmpty.isSelected()
            ).run();
            triggerDisplayScrapped();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonScrapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonScrap;
    private javax.swing.JCheckBox fieldDeleteOnEmpty;
    private javax.swing.JSpinner fieldLines;
    private javax.swing.JTextField fieldOrigin;
    private javax.swing.JLabel labelLines;
    private javax.swing.JLabel labelOrigin;
    private javax.swing.JLabel labelScrapped;
    // End of variables declaration//GEN-END:variables
}
