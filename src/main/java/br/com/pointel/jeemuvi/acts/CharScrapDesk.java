package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.wizes.WizBase;
import br.com.pointel.jeemuvi.wizes.WizSwing;
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
        fieldCount = new javax.swing.JSpinner();
        labelCount = new javax.swing.JLabel();
        buttonScrap = new javax.swing.JButton();
        fieldDeleteOnEmpty = new javax.swing.JCheckBox();
        labelScrapped = new javax.swing.JLabel();
        labelKind = new javax.swing.JLabel();
        fieldKind = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CharScrap");
        setName("CharScrapDesk"); // NOI18N

        labelOrigin.setText("Origin");

        fieldOrigin.setName("Origin"); // NOI18N

        fieldCount.setName("Lines"); // NOI18N
        fieldCount.setValue(30);

        labelCount.setText("Count");

        buttonScrap.setText("Scrap");
        buttonScrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonScrapActionPerformed(evt);
            }
        });

        fieldDeleteOnEmpty.setText("Delete On Empty");
        fieldDeleteOnEmpty.setName("DeleteOnEmpty"); // NOI18N

        labelScrapped.setText("Scrapped!");

        labelKind.setText("Kind");

        fieldKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lines", "Chars" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonScrap)
                        .addGap(18, 18, 18)
                        .addComponent(labelScrapped))
                    .addComponent(fieldDeleteOnEmpty)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelOrigin)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fieldOrigin, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKind)
                            .addComponent(fieldKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCount)
                    .addComponent(fieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonScrap)
                    .addComponent(labelScrapped))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrigin)
                    .addComponent(labelCount)
                    .addComponent(labelKind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDeleteOnEmpty)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonScrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonScrapActionPerformed
        try {
            new CharScrap(
                    new File(fieldOrigin.getText()),
                    fieldKind.getSelectedItem().toString(),
                    (Integer) fieldCount.getValue(),
                    fieldDeleteOnEmpty.isSelected()
            ).run();
            triggerDisplayScrapped();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonScrapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonScrap;
    private javax.swing.JSpinner fieldCount;
    private javax.swing.JCheckBox fieldDeleteOnEmpty;
    private javax.swing.JComboBox<String> fieldKind;
    private javax.swing.JTextField fieldOrigin;
    private javax.swing.JLabel labelCount;
    private javax.swing.JLabel labelKind;
    private javax.swing.JLabel labelOrigin;
    private javax.swing.JLabel labelScrapped;
    // End of variables declaration//GEN-END:variables
}
