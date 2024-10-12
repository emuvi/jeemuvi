package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.wizes.WizChats;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;
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

        buttonOpenOrRefresh = new javax.swing.JButton();
        fieldChat = new javax.swing.JComboBox<>();
        buttonGetChat = new javax.swing.JButton();
        buttonInsertHere = new javax.swing.JButton();
        buttonEditChat = new javax.swing.JButton();
        buttonGetFromClipboard = new javax.swing.JButton();
        buttonPutOnBuffer = new javax.swing.JButton();
        labelBuffer = new javax.swing.JLabel();
        buttonPutOnClipboard = new javax.swing.JButton();
        buttonMount = new javax.swing.JButton();
        scrollMount = new javax.swing.JScrollPane();
        fieldMount = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ChatMount");
        setName("ChatMountDesk"); // NOI18N

        buttonOpenOrRefresh.setText("#");
        buttonOpenOrRefresh.setToolTipText("Open or Refresh Chats");
        buttonOpenOrRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenOrRefreshActionPerformed(evt);
            }
        });

        fieldChat.setModel(modelChats);
        fieldChat.setName("Chat"); // NOI18N

        buttonGetChat.setText("=");
        buttonGetChat.setToolTipText("Get Chat");
        buttonGetChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGetChatActionPerformed(evt);
            }
        });

        buttonInsertHere.setText("|");
        buttonInsertHere.setToolTipText("Put Insert Here");
        buttonInsertHere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertHereActionPerformed(evt);
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

            buttonPutOnBuffer.setText("+");
            buttonPutOnBuffer.setToolTipText("Put on Buffer");
            buttonPutOnBuffer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonPutOnBufferActionPerformed(evt);
                }
            });

            labelBuffer.setText("0");

            buttonPutOnClipboard.setText("/");
            buttonPutOnClipboard.setToolTipText("Put on Clipboard");
            buttonPutOnClipboard.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonPutOnClipboardActionPerformed(evt);
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

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollMount, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonOpenOrRefresh)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldChat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonGetChat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonInsertHere)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonEditChat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonGetFromClipboard)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonPutOnBuffer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelBuffer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonPutOnClipboard)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonMount)))
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
                        .addComponent(buttonInsertHere)
                        .addComponent(buttonPutOnBuffer)
                        .addComponent(labelBuffer))
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
            getChat();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonGetChatActionPerformed

    private void getChat() throws Exception {
        fieldMount.setText(WizChats.load(getChatName()));
    }

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
            getFromClipboard();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonGetFromClipboardActionPerformed

    private void getFromClipboard() throws Exception {
        var clipboard = WizSwing.getStringOnClipboard();
        var source = fieldMount.getText().trim();
        if (source.contains("<<INSERT_HERE>>")) {
            source = source.replace("<<INSERT_HERE>>", clipboard);
        } else {
            source += "\n\n" + clipboard;
        }
        fieldMount.setText(source);
    }

    private void buttonPutOnClipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPutOnClipboardActionPerformed
        try {
            putOnClipboard();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonPutOnClipboardActionPerformed

    private void putOnClipboard() {
        var source = fieldMount.getText().trim();
        WizSwing.putStringOnClipboard(source);
    }

    private void buttonMountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMountActionPerformed
        try {
            getChat();
            mountWithBuffer();
            getFromClipboard();
            putOnClipboard();
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonMountActionPerformed

    private void mountWithBuffer() throws Exception {
        if (!buffer.isEmpty()) {
            var onClipboard = WizSwing.getStringOnClipboard();
            if (onClipboard != null) {
                buffer.add(onClipboard);
            }
            WizSwing.putStringOnClipboard(String.join("\n", buffer));
            buffer.clear();
        }
        labelBuffer.setText(String.valueOf(buffer.size()));
    }

    private void buttonInsertHereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertHereActionPerformed
        fieldMount.replaceSelection("<<INSERT_HERE>>");
    }//GEN-LAST:event_buttonInsertHereActionPerformed

    private final List<String> buffer = new ArrayList<String>();

    private void buttonPutOnBufferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPutOnBufferActionPerformed
        try {
            var onClipboard = WizSwing.getStringOnClipboard();
            if (onClipboard != null) {
                buffer.add(onClipboard);
            }
            labelBuffer.setText(String.valueOf(buffer.size()));
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonPutOnBufferActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditChat;
    private javax.swing.JButton buttonGetChat;
    private javax.swing.JButton buttonGetFromClipboard;
    private javax.swing.JButton buttonInsertHere;
    private javax.swing.JButton buttonMount;
    private javax.swing.JButton buttonOpenOrRefresh;
    private javax.swing.JButton buttonPutOnBuffer;
    private javax.swing.JButton buttonPutOnClipboard;
    private javax.swing.JComboBox<String> fieldChat;
    private javax.swing.JTextArea fieldMount;
    private javax.swing.JLabel labelBuffer;
    private javax.swing.JScrollPane scrollMount;
    // End of variables declaration//GEN-END:variables
}
