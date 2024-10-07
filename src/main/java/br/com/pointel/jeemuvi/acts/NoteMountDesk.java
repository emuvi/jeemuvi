package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.NotesHistory;
import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.gears.SwingNotify;
import br.com.pointel.jeemuvi.wizes.WizChats;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import java.awt.event.InputEvent;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author emuvi
 */
public class NoteMountDesk extends javax.swing.JFrame {

    private final DefaultComboBoxModel<String> modelChats = new DefaultComboBoxModel<>();
    private final NotesHistory notesHistory = new NotesHistory(10);
    
    public NoteMountDesk() {
        initComponents();
        initFrame();
    }
    
    private void initFrame() {
        WizChats.loadChatsNames(modelChats);
        SwingDropper.initAllOn(this);
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSection = new javax.swing.JButton();
        fieldTitleSize = new javax.swing.JSpinner();
        buttonTitle = new javax.swing.JButton();
        buttonParagraph = new javax.swing.JButton();
        buttonItem = new javax.swing.JButton();
        buttonAppend = new javax.swing.JButton();
        buttonUndo = new javax.swing.JButton();
        buttonRedo = new javax.swing.JButton();
        fieldCopyKind = new javax.swing.JComboBox<>();
        buttonCopy = new javax.swing.JButton();
        buttonOpenOrRefresh = new javax.swing.JButton();
        fieldChatName = new javax.swing.JComboBox<>();
        buttonInsert = new javax.swing.JButton();
        fieldCleanClipboard = new javax.swing.JCheckBox();
        labelPath = new javax.swing.JLabel();
        fieldPath = new javax.swing.JTextField();
        buttonWatch = new javax.swing.JButton();
        panelEditors = new javax.swing.JTabbedPane();
        panelSection = new javax.swing.JPanel();
        scrollSection = new javax.swing.JScrollPane();
        sourceSection = new javax.swing.JTextArea();
        panelTitle = new javax.swing.JPanel();
        scrollTitle = new javax.swing.JScrollPane();
        sourceTitle = new javax.swing.JTextArea();
        panelParagraph = new javax.swing.JPanel();
        scrollParagraph = new javax.swing.JScrollPane();
        sourceParagraph = new javax.swing.JTextArea();
        panelAppend = new javax.swing.JPanel();
        scrollAppend = new javax.swing.JScrollPane();
        sourceAppend = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NoteMount");
        setName("NoteMountDesk"); // NOI18N

        buttonSection.setText("Section");
        buttonSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSectionActionPerformed(evt);
            }
        });

        fieldTitleSize.setName("TitleSize"); // NOI18N
        fieldTitleSize.setValue(3);

        buttonTitle.setText("Title");
        buttonTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTitleActionPerformed(evt);
            }
        });

        buttonParagraph.setText("Paragraph");
        buttonParagraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonParagraphActionPerformed(evt);
            }
        });

        buttonItem.setText("Item");
        buttonItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonItemActionPerformed(evt);
            }
        });

        buttonAppend.setText("Append");
        buttonAppend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAppendActionPerformed(evt);
            }
        });

        buttonUndo.setText("<");
        buttonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUndoActionPerformed(evt);
            }
        });

        buttonRedo.setText(">");
        buttonRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRedoActionPerformed(evt);
            }
        });

        fieldCopyKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Note", "Section", "Title", "Paragraph", "Append" }));
        fieldCopyKind.setName("CopyKind"); // NOI18N

        buttonCopy.setText("Copy");
        buttonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyActionPerformed(evt);
            }
        });

        buttonOpenOrRefresh.setText("#");
        buttonOpenOrRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenOrRefreshActionPerformed(evt);
            }
        });

        fieldChatName.setModel(modelChats);
        fieldChatName.setName("ChatName"); // NOI18N

        buttonInsert.setText("+");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        fieldCleanClipboard.setText("Clean Clipboard");
        fieldCleanClipboard.setName("CleanClipboard"); // NOI18N

        labelPath.setText("Path");

        fieldPath.setName("Path"); // NOI18N

        buttonWatch.setText("Watch");
        buttonWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWatchActionPerformed(evt);
            }
        });

        panelEditors.setName(""); // NOI18N

        sourceSection.setColumns(20);
        sourceSection.setRows(5);
        sourceSection.setText("\"$clipboard\"");
        sourceSection.setName("SourceSection"); // NOI18N
        scrollSection.setViewportView(sourceSection);

        javax.swing.GroupLayout panelSectionLayout = new javax.swing.GroupLayout(panelSection);
        panelSection.setLayout(panelSectionLayout);
        panelSectionLayout.setHorizontalGroup(
            panelSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollSection, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSectionLayout.setVerticalGroup(
            panelSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollSection, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditors.addTab("Section", panelSection);

        sourceTitle.setColumns(20);
        sourceTitle.setRows(5);
        sourceTitle.setText("\"$clipboard\"");
        sourceTitle.setName("SourceTitle"); // NOI18N
        scrollTitle.setViewportView(sourceTitle);

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditors.addTab("Title", panelTitle);

        sourceParagraph.setColumns(20);
        sourceParagraph.setRows(5);
        sourceParagraph.setText("\"$clipboard\"");
        sourceParagraph.setName("SourceParagraph"); // NOI18N
        scrollParagraph.setViewportView(sourceParagraph);

        javax.swing.GroupLayout panelParagraphLayout = new javax.swing.GroupLayout(panelParagraph);
        panelParagraph.setLayout(panelParagraphLayout);
        panelParagraphLayout.setHorizontalGroup(
            panelParagraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParagraphLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollParagraph, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelParagraphLayout.setVerticalGroup(
            panelParagraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParagraphLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollParagraph, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditors.addTab("Paragraph", panelParagraph);

        sourceAppend.setColumns(20);
        sourceAppend.setRows(5);
        sourceAppend.setText("\"$clipboard\"");
        sourceAppend.setName("SourceAppend"); // NOI18N
        scrollAppend.setViewportView(sourceAppend);

        javax.swing.GroupLayout panelAppendLayout = new javax.swing.GroupLayout(panelAppend);
        panelAppend.setLayout(panelAppendLayout);
        panelAppendLayout.setHorizontalGroup(
            panelAppendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAppend, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAppendLayout.setVerticalGroup(
            panelAppendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAppend, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditors.addTab("Append", panelAppend);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelEditors)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(buttonUndo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRedo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCopyKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCopy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonOpenOrRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldChatName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonInsert))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(fieldPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonWatch))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(buttonSection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldTitleSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonParagraph)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAppend)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldCleanClipboard)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSection)
                    .addComponent(fieldTitleSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTitle)
                    .addComponent(buttonParagraph)
                    .addComponent(buttonAppend)
                    .addComponent(buttonItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUndo)
                    .addComponent(fieldCopyKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCopy)
                    .addComponent(fieldChatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInsert)
                    .addComponent(buttonOpenOrRefresh)
                    .addComponent(buttonRedo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelPath))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCleanClipboard)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonWatch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEditors)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private File getNoteFile() {
        return new File(fieldPath.getText());
    }
    
    private String loadNote() throws Exception {
        var noteFile = getNoteFile();
        var source = Files.readString(noteFile.toPath(), StandardCharsets.UTF_8);
        source = source.trim();
        notesHistory.push(noteFile, source);
        return source;
    }
    
    private void saveNote(String source) throws Exception {
        var noteFile = getNoteFile();
        source = source.trim();
        notesHistory.push(noteFile, source);
        Files.writeString(noteFile.toPath(), source, StandardCharsets.UTF_8);
    }
    
    private void buttonOpenOrRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenOrRefreshActionPerformed
        try {
            if ((evt.getModifiers() & InputEvent.ALT_MASK) != 0) {
                WizChats.loadChatsNames(modelChats);
            } else {
                WizChats.openChatsFolder();
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonOpenOrRefreshActionPerformed

    private void buttonUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUndoActionPerformed
        try {
            notesHistory.undo(getNoteFile());
            SwingNotify.show("Done Undo!", 1);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonUndoActionPerformed

    private void buttonRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRedoActionPerformed
       try {
            notesHistory.redo(getNoteFile());
            SwingNotify.show("Done Redo!", 1);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRedoActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        try {
            saveNote(loadNote() + WizChats.maybeInsertClipboard(getSelectedChat()));
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyActionPerformed
        try {
            switch (fieldCopyKind.getSelectedItem().toString()) {
                case "Note" -> copyNote();
                case "Section" -> copySection();
                case "Title" -> copyTitle();
                case "Paragraph" -> copyParagraph();
                case "Append" -> copyAppend();
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonCopyActionPerformed
    
    private String copySection = "";
    private String copyTitle = "";
    private String copyParagraph = "";
    private String copyAppend = "";
    
    private void buttonSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSectionActionPerformed
        try {
            var making = groovyClipboard(sourceSection.getText());
            var source = loadNote();
            if (!source.isEmpty()) {
                making = "\n\n---\n\n" + making;
            }
            source += making;
            saveNote(source);
            copySection = making;
            copyTitle = making;
            copyParagraph = making;
            copyAppend = making;
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonSectionActionPerformed
    
    private void buttonTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTitleActionPerformed
        try {
            var making = groovyClipboard(sourceTitle.getText());
            var title = "";
            for (int i = 0; i < (Integer) fieldTitleSize.getValue(); i++) {
                title += "#";
            }
            title += " ";
            if (title.isBlank()) {
                title = "#" + title;
            }
            making = title + making;
            var source = loadNote();
            if (!source.isEmpty()) {
                making = "\n\n" + making;
            }
            source += making;
            saveNote(source);
            copySection += making;
            copyTitle = making;
            copyParagraph = making;
            copyAppend = making;
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonTitleActionPerformed
    
    private void buttonParagraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonParagraphActionPerformed
        try {
            var making = groovyClipboard(sourceParagraph.getText());
            var source = loadNote();
            if (!source.isEmpty()) {
                making = "\n\n" + making;
            }
            source += making;
            saveNote(source);
            copySection += making;
            copyTitle += making;
            copyParagraph = making;
            copyAppend = making;
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonParagraphActionPerformed
    
    private void buttonAppendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAppendActionPerformed
        try {
            var making = groovyClipboard(sourceAppend.getText());
            var source = loadNote();
            if (!source.isEmpty()) {
                making = " " + making;
            }
            source += making;
            saveNote(source);
            copySection += making;
            copyTitle += making;
            copyParagraph += making;
            copyAppend = making;
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonAppendActionPerformed

    private void buttonWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWatchActionPerformed
        new TextFileWatcherDesk(new File(fieldPath.getText())).setVisible(true);
    }//GEN-LAST:event_buttonWatchActionPerformed

    private void buttonItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonItemActionPerformed
        try {
            var making = groovyClipboard(sourceParagraph.getText());
            making = "- " + making;
            var source = loadNote();
            if (!source.isEmpty()) {
                making = "\n\n" + making;
            }
            source += making;
            saveNote(source);
            copySection += making;
            copyTitle += making;
            copyParagraph += making;
            copyAppend = making;
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonItemActionPerformed

    private String groovyClipboard(String script) throws Exception {
        var clipboard = WizSwing.getStringOnClipboard().trim();
        if (fieldCleanClipboard.isSelected()) {
            clipboard = cleanClipboard(clipboard);
        }
        if (!script.isBlank()) {
            var binding = new Binding();
            binding.setProperty("clipboard", clipboard);
            var shell = new GroovyShell(binding);
            var result = shell.evaluate(script);
            clipboard = result.toString();
        }
        return clipboard;
    }
    
    private String cleanClipboard(String clipboard) {
        return clipboard.replaceAll("\\s+", " ");
    }
    
    private void copyNote() throws Exception {
        WizSwing.putStringOnClipboard(Files.readString(getNoteFile().toPath(), StandardCharsets.UTF_8));
    }
    
    private void copySection() {
        WizSwing.putStringOnClipboard(copySection);
    }
    
    private void copyTitle() {
        WizSwing.putStringOnClipboard(copyTitle);
    }
    
    private void copyParagraph() {
        WizSwing.putStringOnClipboard(copyParagraph);
    }
    
    private void copyAppend() {
        WizSwing.putStringOnClipboard(copyAppend);
    }
    
    private String getSelectedChat() {
        return fieldChatName.getSelectedItem().toString();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAppend;
    private javax.swing.JButton buttonCopy;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonItem;
    private javax.swing.JButton buttonOpenOrRefresh;
    private javax.swing.JButton buttonParagraph;
    private javax.swing.JButton buttonRedo;
    private javax.swing.JButton buttonSection;
    private javax.swing.JButton buttonTitle;
    private javax.swing.JButton buttonUndo;
    private javax.swing.JButton buttonWatch;
    private javax.swing.JComboBox<String> fieldChatName;
    private javax.swing.JCheckBox fieldCleanClipboard;
    private javax.swing.JComboBox<String> fieldCopyKind;
    private javax.swing.JTextField fieldPath;
    private javax.swing.JSpinner fieldTitleSize;
    private javax.swing.JLabel labelPath;
    private javax.swing.JPanel panelAppend;
    private javax.swing.JTabbedPane panelEditors;
    private javax.swing.JPanel panelParagraph;
    private javax.swing.JPanel panelSection;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JScrollPane scrollAppend;
    private javax.swing.JScrollPane scrollParagraph;
    private javax.swing.JScrollPane scrollSection;
    private javax.swing.JScrollPane scrollTitle;
    private javax.swing.JTextArea sourceAppend;
    private javax.swing.JTextArea sourceParagraph;
    private javax.swing.JTextArea sourceSection;
    private javax.swing.JTextArea sourceTitle;
    // End of variables declaration//GEN-END:variables
}
