package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.wizes.WizChats;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.awt.event.InputEvent;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author emuvi
 */
public class ChatMountDesk extends javax.swing.JFrame {

    private final DefaultComboBoxModel<String> modelChats = new DefaultComboBoxModel<>();
    
    public ChatMountDesk() {
        initComponents();
        initFrame();
    }
    
    private void initFrame() { 
        WizChats.loadNames(modelChats);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldChat = new javax.swing.JComboBox<>();
        buttonGetChat = new javax.swing.JButton();
        buttonEditChat = new javax.swing.JButton();
        buttonGetFromClipboard = new javax.swing.JButton();
        buttonPutOnClipboard = new javax.swing.JButton();
        buttonOpenOrRefresh = new javax.swing.JButton();
        buttonMount = new javax.swing.JButton();
        scrollMount = new javax.swing.JScrollPane();
        fieldMount = new javax.swing.JTextArea();
        buttonInsertHere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ChatMount");
        setName("ChatMountDesk"); // NOI18N

        fieldChat.setModel(modelChats);

        buttonGetChat.setText("=");
        buttonGetChat.setToolTipText("Get Chat");
        buttonGetChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGetChatActionPerformed(evt);
            }
        });

        buttonEditChat.setText("&");
        buttonEditChat.setToolTipText("Edit Chat");
        buttonEditChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditChatActionPerformed(evt);
            }
        });

        buttonGetFromClipboard.setText("\\");
            buttonGetFromClipboard.setToolTipText("Get from Clipboard");
            buttonGetFromClipboard.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonGetFromClipboardActionPerformed(evt);
                }
            });

            buttonPutOnClipboard.setText("/");
            buttonPutOnClipboard.setToolTipText("Put on Clipboard");
            buttonPutOnClipboard.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonPutOnClipboardActionPerformed(evt);
                }
            });

            buttonOpenOrRefresh.setText("#");
            buttonOpenOrRefresh.setToolTipText("Open or Refresh Chats");
            buttonOpenOrRefresh.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonOpenOrRefreshActionPerformed(evt);
                }
            });

            buttonMount.setText("*");
            buttonMount.setToolTipText("Mount");
            buttonMount.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonMountActionPerformed(evt);
                }
            });

            fieldMount.setColumns(20);
            fieldMount.setRows(5);
            scrollMount.setViewportView(fieldMount);

            buttonInsertHere.setText("|");
            buttonInsertHere.setToolTipText("Put Insert Here");
            buttonInsertHere.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonInsertHereActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollMount)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonOpenOrRefresh)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldChat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonGetChat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonInsertHere)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonEditChat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonGetFromClipboard)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonPutOnClipboard)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonMount)
                            .addGap(0, 81, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonGetChat)
                        .addComponent(buttonEditChat)
                        .addComponent(buttonGetFromClipboard)
                        .addComponent(buttonPutOnClipboard)
                        .addComponent(buttonOpenOrRefresh)
                        .addComponent(buttonMount)
                        .addComponent(buttonInsertHere))
                    .addGap(18, 18, 18)
                    .addComponent(scrollMount, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void buttonOpenOrRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenOrRefreshActionPerformed
        try {
            if ((evt.getModifiers() & InputEvent.ALT_MASK) != 0) {
                WizChats.loadNames(modelChats);
            } else {
                WizChats.openFolder();
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonOpenOrRefreshActionPerformed

    private void buttonGetChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGetChatActionPerformed
        try {
            fieldMount.setText(WizChats.load(getChatName()));
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonGetChatActionPerformed

    private void buttonEditChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditChatActionPerformed
        try {
            WizChats.save(getChatName(), fieldMount.getText());
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonEditChatActionPerformed

    private String getChatName() {
        return fieldChat.getSelectedItem().toString();
    }
    
    private void buttonGetFromClipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGetFromClipboardActionPerformed
        try {
            var clipboard = WizSwing.getStringOnClipboard();
            var source = fieldMount.getText().trim();
            if (source.contains("<<INSERT_HERE>>")) {
                source = source.replace("<<INSERT_HERE>>", clipboard);
            } else {
                source += "\n\n" + clipboard;
            }
            fieldMount.setText(source);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonGetFromClipboardActionPerformed

    private void buttonPutOnClipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPutOnClipboardActionPerformed
        try {
            var source = fieldMount.getText().trim();
            WizSwing.putStringOnClipboard(source);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonPutOnClipboardActionPerformed

    private void buttonMountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMountActionPerformed
        buttonGetChatActionPerformed(evt);
        buttonGetFromClipboardActionPerformed(evt);
        buttonPutOnClipboardActionPerformed(evt);
    }//GEN-LAST:event_buttonMountActionPerformed

    private void buttonInsertHereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertHereActionPerformed
        fieldMount.replaceSelection("<<INSERT_HERE>>");
    }//GEN-LAST:event_buttonInsertHereActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditChat;
    private javax.swing.JButton buttonGetChat;
    private javax.swing.JButton buttonGetFromClipboard;
    private javax.swing.JButton buttonInsertHere;
    private javax.swing.JButton buttonMount;
    private javax.swing.JButton buttonOpenOrRefresh;
    private javax.swing.JButton buttonPutOnClipboard;
    private javax.swing.JComboBox<String> fieldChat;
    private javax.swing.JTextArea fieldMount;
    private javax.swing.JScrollPane scrollMount;
    // End of variables declaration//GEN-END:variables
}
