package br.com.pointel.jeemuvi.acts;


import br.com.pointel.jeemuvi.wizard.WizChars;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.InputEvent;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingUtilities;
import org.apache.commons.io.FilenameUtils;

public class CharvsDesk extends javax.swing.JFrame {

    private final DefaultComboBoxModel<String> modelChats = new DefaultComboBoxModel<>();

    public CharvsDesk() {
        initComponents();
        initDrop();
        loadChats();
        WizSwing.initFrame(this);
    }

    private void initDrop() {
        new DropTarget(editFileName, DnDConstants.ACTION_COPY, new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent e) {
                try {
                    e.acceptDrop(DnDConstants.ACTION_COPY);
                    DataFlavor[] flavors = e.getCurrentDataFlavors();
                    for (DataFlavor flavor : flavors) {
                        if (flavor.isFlavorJavaFileListType()) {
                            java.util.List<File> files = (java.util.List<File>) e.getTransferable().getTransferData(flavor);
                            if (!files.isEmpty()) {
                                editFileName.setText(files.get(0).getAbsolutePath());
                            }
                            break;
                        }
                    }
                    e.dropComplete(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    e.dropComplete(false);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        scrollText = new javax.swing.JScrollPane();
        editText = new javax.swing.JTextArea();
        buttonCaptureContent = new javax.swing.JButton();
        comboChats = new javax.swing.JComboBox<>();
        checkRandom = new javax.swing.JCheckBox();
        buttonCopy = new javax.swing.JButton();
        fieldStatus = new javax.swing.JTextField();
        buttonReload = new javax.swing.JButton();
        buttonSetPasteCopy = new javax.swing.JButton();
        buttonOpen = new javax.swing.JButton();
        buttonRemake = new javax.swing.JButton();
        buttonSet = new javax.swing.JButton();
        buttonPasteCopy = new javax.swing.JButton();
        buttonAppend = new javax.swing.JButton();
        buttonPaste = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buttonSpaceAppend = new javax.swing.JButton();
        editFileName = new javax.swing.JTextField();
        buttonNewParagraph = new javax.swing.JButton();
        buttonNewTitle = new javax.swing.JButton();
        checkAlwaysOnTop = new javax.swing.JCheckBox();
        buttonUndo = new javax.swing.JButton();
        buttonNewQuest = new javax.swing.JButton();
        editAuxText = new javax.swing.JTextField();
        buttonCopyText = new javax.swing.JButton();
        buttonCopyGroup = new javax.swing.JButton();
        buttonnCopySubGroup = new javax.swing.JButton();
        editAppend = new javax.swing.JTextField();
        editHeartFolder = new javax.swing.JTextField();
        checkAutoAddAtEnd = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Charvs");

        editText.setColumns(20);
        editText.setLineWrap(true);
        editText.setRows(5);
        editText.setWrapStyleWord(true);
        scrollText.setViewportView(editText);

        buttonCaptureContent.setMnemonic('9');
        buttonCaptureContent.setText("9");
        buttonCaptureContent.setToolTipText("Capture Heart");
        buttonCaptureContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaptureContentActionPerformed(evt);
            }
        });

        comboChats.setModel(modelChats);

        checkRandom.setSelected(true);
        checkRandom.setText("Random");

        buttonCopy.setMnemonic('6');
        buttonCopy.setText("6");
        buttonCopy.setToolTipText("Copy Content");
        buttonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyActionPerformed(evt);
            }
        });

        fieldStatus.setEditable(false);
        fieldStatus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldStatus.setBorder(null);

        buttonReload.setMnemonic('2');
        buttonReload.setText("2");
        buttonReload.setToolTipText("Reload Folder");
        buttonReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReloadActionPerformed(evt);
            }
        });

        buttonSetPasteCopy.setMnemonic('8');
        buttonSetPasteCopy.setText("8");
        buttonSetPasteCopy.setToolTipText("Set, Paste and Copy Content");
        buttonSetPasteCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetPasteCopyActionPerformed(evt);
            }
        });

        buttonOpen.setText("1");
        buttonOpen.setToolTipText("Open Folder");
        buttonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenActionPerformed(evt);
            }
        });

        buttonRemake.setMnemonic('0');
        buttonRemake.setText("0");
        buttonRemake.setToolTipText("Ramake Heart");
        buttonRemake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemakeActionPerformed(evt);
            }
        });

        buttonSet.setMnemonic('3');
        buttonSet.setText("3");
        buttonSet.setToolTipText("Set Conntent");
        buttonSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetActionPerformed(evt);
            }
        });

        buttonPasteCopy.setMnemonic('7');
        buttonPasteCopy.setText("7");
        buttonPasteCopy.setToolTipText("Paste and Copy Content");
        buttonPasteCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPasteCopyActionPerformed(evt);
            }
        });

        buttonAppend.setMnemonic('4');
        buttonAppend.setText("4");
        buttonAppend.setToolTipText("Appennd Content");
        buttonAppend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAppendActionPerformed(evt);
            }
        });

        buttonPaste.setMnemonic('5');
        buttonPaste.setText("5");
        buttonPaste.setToolTipText("Paste Content");
        buttonPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPasteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollText)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonOpen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonReload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboChats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAppend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPaste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCopy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPasteCopy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSetPasteCopy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCaptureContent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemake))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fieldStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkRandom)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboChats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSet)
                    .addComponent(buttonAppend)
                    .addComponent(buttonPaste)
                    .addComponent(buttonCopy)
                    .addComponent(buttonSetPasteCopy)
                    .addComponent(buttonPasteCopy)
                    .addComponent(buttonOpen)
                    .addComponent(buttonReload)
                    .addComponent(buttonCaptureContent)
                    .addComponent(buttonRemake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollText, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkRandom))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        buttonSpaceAppend.setText("Appennd");
        buttonSpaceAppend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSpaceAppendActionPerformed(evt);
            }
        });

        buttonNewParagraph.setText("New Paragraph");
        buttonNewParagraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewParagraphActionPerformed(evt);
            }
        });

        buttonNewTitle.setText("New Title");
        buttonNewTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewTitleActionPerformed(evt);
            }
        });

        checkAlwaysOnTop.setText("Always on Top");
        checkAlwaysOnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAlwaysOnTopActionPerformed(evt);
            }
        });

        buttonUndo.setText("Undo");
        buttonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUndoActionPerformed(evt);
            }
        });

        buttonNewQuest.setText("New Quest");
        buttonNewQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewQuestActionPerformed(evt);
            }
        });

        buttonCopyText.setText("Copy");
        buttonCopyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyTextActionPerformed(evt);
            }
        });

        buttonCopyGroup.setText("Group");
        buttonCopyGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyGroupActionPerformed(evt);
            }
        });

        buttonnCopySubGroup.setText("SubGroup");
        buttonnCopySubGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnCopySubGroupActionPerformed(evt);
            }
        });

        editAppend.setText(" ");

        editHeartFolder.setText("D:\\emuvi\\OneDrive\\Documentos\\Educação\\AELIN\\ABIN\\Heart");

        checkAutoAddAtEnd.setToolTipText("Automatic add t the end.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editFileName)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonNewQuest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNewTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNewParagraph)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editAppend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSpaceAppend)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkAlwaysOnTop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editHeartFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonUndo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editAuxText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAutoAddAtEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCopyText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCopyGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonnCopySubGroup)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewTitle)
                    .addComponent(buttonNewParagraph)
                    .addComponent(buttonSpaceAppend)
                    .addComponent(buttonNewQuest)
                    .addComponent(editAppend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUndo)
                    .addComponent(editAuxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCopyText)
                    .addComponent(buttonCopyGroup)
                    .addComponent(buttonnCopySubGroup)
                    .addComponent(checkAutoAddAtEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAlwaysOnTop)
                    .addComponent(editHeartFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String readSelectedChat() throws Exception {
        return Files.readString(new File(FOLDER_CHATS, comboChats.getSelectedItem().toString()).toPath(), StandardCharsets.UTF_8);
    }

    private void buttonSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetActionPerformed
        try {
            var chat = readSelectedChat();
            editText.setText(chat);
        } catch (Exception ex) {
            WizSwing.showError(ex);
        }
    }//GEN-LAST:event_buttonSetActionPerformed

    private void buttonAppendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAppendActionPerformed
        try {
            var chat = readSelectedChat();
            editText.append(chat);
        } catch (Exception ex) {
            WizSwing.showError(ex);
        }
    }//GEN-LAST:event_buttonAppendActionPerformed

    private void buttonPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPasteActionPerformed
        try {
            var actual = editText.getText();
            var onClipboard = WizSwing.getStringOnClipboard();
            if (actual.contains("<<INSERT HERE>>")) {
                actual = actual.replace("<<INSERT HERE>>", onClipboard);
                editText.setText(actual);
            } else {
                editText.append("\n\n" + onClipboard);
            }
            
        } catch (Exception ex) {
            WizSwing.showError(ex);
        }
    }//GEN-LAST:event_buttonPasteActionPerformed

    private void buttonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyActionPerformed
        try {
            WizSwing.putStringOnClipboard(editText.getText());
        } catch (Exception ex) {
            WizSwing.showError(ex);
        }
    }//GEN-LAST:event_buttonCopyActionPerformed

    private void buttonSetPasteCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetPasteCopyActionPerformed
        buttonSetActionPerformed(evt);
        buttonPasteActionPerformed(evt);
        buttonCopyActionPerformed(evt);
    }//GEN-LAST:event_buttonSetPasteCopyActionPerformed

    private void buttonPasteCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPasteCopyActionPerformed
        buttonPasteActionPerformed(evt);
        buttonCopyActionPerformed(evt);
    }//GEN-LAST:event_buttonPasteCopyActionPerformed

    private void buttonReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReloadActionPerformed
        try {
            if ((evt.getModifiers() & InputEvent.CTRL_MASK) != 0) {
                openChat();
            } else if ((evt.getModifiers() & InputEvent.ALT_MASK) != 0) {
                loadChats();
            } else {
                comboChats.setSelectedIndex(1);
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonReloadActionPerformed

    private void buttonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenActionPerformed
        try {
            if ((evt.getModifiers() & InputEvent.ALT_MASK) != 0) {
                WizSwing.open(FOLDER_CHATS);
            } else {
                comboChats.setSelectedIndex(0);
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonOpenActionPerformed

    private void buttonCaptureContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaptureContentActionPerformed
        try {
            var content = WizSwing.getStringOnClipboard();
            var nameText = checkRandom.isSelected() ? WizChars.generateRandomString(18) : null;
            var title = produce(content, null, nameText, true);
            editText.setText(content);
            WizSwing.putStringOnClipboard("[[(H) " + title + "]]");
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonCaptureContentActionPerformed

    private void buttonRemakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemakeActionPerformed
        if (!"yes".equals(WizSwing.showInput("Do you really want to remake the heart?").toLowerCase())) {
            return;
        }
        try {
            for (var file : new File(editHeartFolder.getText()).listFiles()) {
                if (!file.getName().endsWith(".md")) {
                    file.delete();
                }
            }
            for (var file : new File(editHeartFolder.getText()).listFiles()) {
                if (file.getName().endsWith(".md")) {
                    remakeHeart(file, checkRandom.isSelected());
                }
            }
            WizSwing.showInfo("Finished to remake your heart!");
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRemakeActionPerformed

    private String cleanSource(String source) {
        var lines = source.split("\\r?\\n");
        var lastChar = '\0';
        var result = new StringBuilder();
        for (var line : lines) {
            line = line.replaceAll("\\s+", " ");
            line = line.trim();
            if (line.isEmpty() && lastChar == '\0') {
                continue;
            }
            if (line.isEmpty()) {
                result.append("\n");
                lastChar = '\0';
            } else {
                var firstChar = line.charAt(0);
                if (Character.isLowerCase(firstChar) && Character.isLowerCase(lastChar)) {
                    result.append(" ");
                } else {
                    result.append("\n");
                }
                result.append(line);
                lastChar = line.charAt(line.length() -1);
            }
        }
        return result.toString().trim();
    }
    
    private void buttonSpaceAppendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSpaceAppendActionPerformed
        try {
            var file = new File(editFileName.getText());
            var source = Files.readString(file.toPath(), StandardCharsets.UTF_8).trim();
            lastFile = file;
            lastSource = source;
            var fromClipboard = editAppend.getText() + WizSwing.getStringOnClipboard().trim();
            sourceCopyGroup += fromClipboard;
            sourceCopySubGroup += fromClipboard;
            source += fromClipboard;
            Files.writeString(file.toPath(), cleanSource(source), StandardCharsets.UTF_8);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonSpaceAppendActionPerformed

    private void buttonNewParagraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewParagraphActionPerformed
        try {
            var file = new File(editFileName.getText());
            var source = Files.readString(file.toPath(), StandardCharsets.UTF_8).trim();
            lastFile = file;
            lastSource = source;
            var fromClipboard = "\n\n" + WizSwing.getStringOnClipboard().trim();
            sourceCopyGroup += fromClipboard;
            sourceCopySubGroup = fromClipboard;
            source += fromClipboard;
            Files.writeString(file.toPath(), cleanSource(source), StandardCharsets.UTF_8);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonNewParagraphActionPerformed

    private void buttonNewTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewTitleActionPerformed
        try {
            var file = new File(editFileName.getText());
            var source = Files.readString(file.toPath(), StandardCharsets.UTF_8).trim();
            lastFile = file;
            lastSource = source;
            var fromClipBoard = WizSwing.getStringOnClipboard().trim();
            if (!fromClipBoard.startsWith("#")) {
                fromClipBoard = "### " + fromClipBoard;
            }
            sourceCopyGroup = fromClipBoard;
            sourceCopySubGroup = fromClipBoard;
            source = source + "\n\n" + fromClipBoard;
            Files.writeString(file.toPath(), cleanSource(source), StandardCharsets.UTF_8);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonNewTitleActionPerformed
    
    private void checkAlwaysOnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAlwaysOnTopActionPerformed
        setAlwaysOnTop(checkAlwaysOnTop.isSelected());
    }//GEN-LAST:event_checkAlwaysOnTopActionPerformed

    private File lastFile;
    private String lastSource;
    
    private void buttonUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUndoActionPerformed
        try {
            Files.writeString(lastFile.toPath(), lastSource, StandardCharsets.UTF_8);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonUndoActionPerformed

    private String sourceCopyGroup = "";
    private String sourceCopySubGroup = "";
    
    private void buttonNewQuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewQuestActionPerformed
        try {
            var file = new File(editFileName.getText());
            var source = Files.readString(file.toPath(), StandardCharsets.UTF_8).trim();
            lastFile = file;
            lastSource = source;
            var fromClipboard = WizSwing.getStringOnClipboard().trim();
            if (!fromClipboard.endsWith("Responder")) {
                fromClipboard += "\n\nResponder";
            }
            sourceCopyGroup = fromClipboard;
            sourceCopySubGroup = fromClipboard;
            if (!source.isEmpty()) {
                source += "\n\n---\n\n";
            }
            source += fromClipboard;
            Files.writeString(file.toPath(), cleanSource(source), StandardCharsets.UTF_8);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonNewQuestActionPerformed

    private void buttonCopyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyTextActionPerformed
        try {
            WizSwing.putStringOnClipboard(editAuxText.getText());
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonCopyTextActionPerformed

    private void buttonCopyGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyGroupActionPerformed
        try {
            WizSwing.putStringOnClipboard(sourceCopyGroup.trim());
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonCopyGroupActionPerformed

    private void buttonnCopySubGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnCopySubGroupActionPerformed
        try {
            WizSwing.putStringOnClipboard(sourceCopySubGroup.trim());
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonnCopySubGroupActionPerformed

    private void remakeHeart(File file, boolean random) throws Exception {
        var origin = Files.readString(file.toPath(), StandardCharsets.UTF_8);
        var nameMark = FilenameUtils.getBaseName(file.getName());
        var nameText = random ? WizChars.generateRandomString(18) : nameMark;
        produce(origin, nameMark, nameText, false);
    }

    private void loadChats() {
        modelChats.removeAllElements();
        for (var inside : FOLDER_CHATS.listFiles()) {
            if (inside.isFile() && inside.getName().toLowerCase().endsWith(".txt")) {
                modelChats.addElement(inside.getName());
            }
        }
    }
    private void openChat() throws Exception {
        var selected = new File(FOLDER_CHATS, comboChats.getSelectedItem().toString());
        WizSwing.open(selected);
    }

    private String produce(String origin, String nameMark, String nameText, boolean checkAlreadyExists) throws Exception {
        origin = origin.replaceAll("\\【.*\\†.*\\】", "");
        var begin = "{{Voice=Acapela Marcia22 (Brazilian Portuguese)/}}{{Pause=3}}Início.{{Pause=3}}\n\n";
        var end = "\n\n{{Pause=3}}Fim.{{Pause=3}}";
        if (origin.contains("%% Body in English %%")) {
            origin = origin.replace("%% Body in English %%", "");
            begin = "{{Voice=Acapela Ryan22/}}{{Pause=3}}Begin.{{Pause=3}}\n\n";
            end = "\n\n{{Pause=3}}End.{{Pause=3}}";
        } else if (origin.contains("%% Body in Spanish %%")) {
            origin = origin.replace("%% Body in Spanish %%", "");
            begin = "{{Voice=Acapela Antonio22 (Spanish)/}}{{Pause=3}}Empiezo.{{Pause=3}}\n\n";
            end = "\n\n{{Pause=3}}Fin.Pause=3}}";
        }
        var lines = origin.split("\\r?\\n");
        if (lines.length < 3) {
            throw new Exception("Actual content has too little lines.");
        }
        var title = cleanTitle(lines[0]);
        lines[0] = title;
        if (!lines[0].endsWith(".")) {
            lines[0] = lines[0] + ".";
        }
        for (int i = 1; i < lines.length; i++) {
            lines[i] = cleanLine(lines[i]);
            if (lines[i].startsWith("#") && !lines[i].endsWith(".")) {
                lines[i] = lines[i] + ".";
            }
        }
        var text = begin + String.join("\n", lines) + end;
        if (checkAutoAddAtEnd.isSelected()) {
            text = text + "\n\n" + editAuxText.getText();
        }
        if (nameMark == null) {
            nameMark = title;
        }
        if (nameText == null) {
            nameText = nameMark;
        }
        save(origin, text, nameMark, nameText, checkAlreadyExists);
        return title;
    }

    private boolean isCharTitleBondaryValid(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c) || c == '”' || c == '“' || c == '(' || c == ')';
    }

    private String cleanTitle(String title) {
        title = title.trim();
        while (!title.isEmpty() && !isCharTitleBondaryValid(title.charAt(0))) {
            title = title.substring(1);
            title = title.trim();
        }
        while (!title.isEmpty() && !isCharTitleBondaryValid(title.charAt(title.length() - 1))) {
            title = title.substring(0, title.length() - 1);
            title = title.trim();
        }
        return title
                .replace("{", "(")
                .replace("}", ")")
                .replace("[", "(")
                .replace("]", ")")
                .replace("\"", "”")
                .replace("'", "”")
                .replace("/", "-")
                .replace("|", "-")
                .replace("\\", "-")
                .replace("?", "")
                .replace("!", "")
                .replace("<", "")
                .replace(">", "")
                .replace("*", "")
                .replace("#", "")
                .replace(":", ",")
                .replace(";", ",")
                .trim();
    }

    private String cleanLine(String line) {
        return line
                .replaceAll("\\*+", "*")
                .replaceAll("\\#+", "#")
                .replaceAll("\\_+", "_")
                .replaceAll("\\-+", "-")
                .replaceAll("\\++", "+")
                .trim();
    }

    private void save(String origin, String text, String nameMark, String nameText, boolean checkAlreadyExists) throws Exception {
        var title = nameMark;
        if (!nameMark.startsWith("(H) ")) {
            if (nameMark.equals(nameText)) {
                nameText = "(H) " + nameText;
            }
            nameMark = "(H) " + nameMark;
        }
        var sourceFile = new File(new File(editHeartFolder.getText()), nameMark + ".md");
        if (sourceFile.exists() && checkAlreadyExists) {
            if (!WizSwing.showConfirm("Already exists, continue?")) {
                return;
            }
        }
        Files.writeString(sourceFile.toPath(), origin, StandardCharsets.UTF_8);
        Files.writeString(new File(new File(editHeartFolder.getText()), nameText + ".txt").toPath(), text, StandardCharsets.UTF_8);
        SwingUtilities.invokeLater(() -> fieldStatus.setText("Saved content on: " + title));
    }

    private static final File FOLDER_CHATS = new File("chats");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAppend;
    private javax.swing.JButton buttonCaptureContent;
    private javax.swing.JButton buttonCopy;
    private javax.swing.JButton buttonCopyGroup;
    private javax.swing.JButton buttonCopyText;
    private javax.swing.JButton buttonNewParagraph;
    private javax.swing.JButton buttonNewQuest;
    private javax.swing.JButton buttonNewTitle;
    private javax.swing.JButton buttonOpen;
    private javax.swing.JButton buttonPaste;
    private javax.swing.JButton buttonPasteCopy;
    private javax.swing.JButton buttonReload;
    private javax.swing.JButton buttonRemake;
    private javax.swing.JButton buttonSet;
    private javax.swing.JButton buttonSetPasteCopy;
    private javax.swing.JButton buttonSpaceAppend;
    private javax.swing.JButton buttonUndo;
    private javax.swing.JButton buttonnCopySubGroup;
    private javax.swing.JCheckBox checkAlwaysOnTop;
    private javax.swing.JCheckBox checkAutoAddAtEnd;
    private javax.swing.JCheckBox checkRandom;
    private javax.swing.JComboBox<String> comboChats;
    private javax.swing.JTextField editAppend;
    private javax.swing.JTextField editAuxText;
    private javax.swing.JTextField editFileName;
    private javax.swing.JTextField editHeartFolder;
    private javax.swing.JTextArea editText;
    private javax.swing.JTextField fieldStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane scrollText;
    // End of variables declaration//GEN-END:variables
}
