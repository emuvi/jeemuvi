package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.NotesHistory;
import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.gears.SwingNotify;
import br.com.pointel.jeemuvi.wizes.WizChars;
import br.com.pointel.jeemuvi.wizes.WizGroovy;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author emuvi
 */
public class QuestMountDesk extends javax.swing.JFrame {

    private final NotesHistory notesHistory = new NotesHistory(10);
    
    public QuestMountDesk() {
        initComponents();
        initFrame();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonNew = new javax.swing.JButton();
        buttonWatch = new javax.swing.JButton();
        buttonParagraph = new javax.swing.JButton();
        buttonItem = new javax.swing.JButton();
        fieldItemLined = new javax.swing.JCheckBox();
        buttonLined = new javax.swing.JButton();
        buttonAppend = new javax.swing.JButton();
        buttonUndo = new javax.swing.JButton();
        buttonRedo = new javax.swing.JButton();
        labelPath = new javax.swing.JLabel();
        fieldPath = new javax.swing.JTextField();
        panelEditors = new javax.swing.JTabbedPane();
        panelParagraph = new javax.swing.JPanel();
        scrollParagraph = new javax.swing.JScrollPane();
        sourceParagraph = new javax.swing.JTextArea();
        panelAppend = new javax.swing.JPanel();
        scrollAppend = new javax.swing.JScrollPane();
        sourceAppend = new javax.swing.JTextArea();
        fieldCleanClipboard = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QuestMount");
        setName("QuestMountDesk"); // NOI18N

        buttonNew.setText("+");
        buttonNew.setToolTipText("New");
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });

        buttonWatch.setText("W");
        buttonWatch.setToolTipText("Watch");
        buttonWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWatchActionPerformed(evt);
            }
        });

        buttonParagraph.setText("P");
        buttonParagraph.setToolTipText("Paragraph");
        buttonParagraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonParagraphActionPerformed(evt);
            }
        });

        buttonItem.setText("I");
        buttonItem.setToolTipText("Item");
        buttonItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonItemActionPerformed(evt);
            }
        });

        fieldItemLined.setName("ItemLined"); // NOI18N

        buttonLined.setText("L");
        buttonLined.setToolTipText("Lined");
        buttonLined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLinedActionPerformed(evt);
            }
        });

        buttonAppend.setText("A");
        buttonAppend.setToolTipText("Append");
        buttonAppend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAppendActionPerformed(evt);
            }
        });

        buttonUndo.setText("<");
        buttonUndo.setToolTipText("Undo");
        buttonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUndoActionPerformed(evt);
            }
        });

        buttonRedo.setText(">");
        buttonRedo.setToolTipText("Redo");
        buttonRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRedoActionPerformed(evt);
            }
        });

        labelPath.setText("Path");

        fieldPath.setName("Path"); // NOI18N

        panelEditors.setName(""); // NOI18N

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
                .addComponent(scrollParagraph, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelParagraphLayout.setVerticalGroup(
            panelParagraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParagraphLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollParagraph, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
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
                .addComponent(scrollAppend, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAppendLayout.setVerticalGroup(
            panelAppendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAppend, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditors.addTab("Append", panelAppend);

        fieldCleanClipboard.setText("Clean Clipboard");
        fieldCleanClipboard.setName("CleanClipboard"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPath)
                    .addComponent(panelEditors, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPath)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonWatch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonParagraph)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldItemLined)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLined)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAppend)
                                .addGap(18, 18, 18)
                                .addComponent(buttonUndo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRedo)
                                .addGap(18, 18, 18)
                                .addComponent(fieldCleanClipboard)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldItemLined, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonParagraph)
                            .addComponent(buttonAppend)
                            .addComponent(buttonItem)
                            .addComponent(buttonLined)
                            .addComponent(buttonUndo)
                            .addComponent(buttonRedo)
                            .addComponent(fieldCleanClipboard)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonNew)
                        .addComponent(buttonWatch)))
                .addGap(18, 18, 18)
                .addComponent(labelPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEditors, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initFrame() {
        SwingDropper.initAllOn(this);
        new SwingDropper((f) -> setPath(f), this).init();
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }

    private void setPath(List<File> files) {
        if (files != null && !files.isEmpty()) {
            fieldPath.setText(files.get(0).getAbsolutePath());
        }
    }
    
    private File getQuestFile() {
        return new File(fieldPath.getText());
    }
    
    private String loadQuest() throws Exception {
        var noteFile = getQuestFile();
        var source = Files.readString(noteFile.toPath(), StandardCharsets.UTF_8);
        source = source.trim();
        notesHistory.push(noteFile, source);
        return source;
    }
    
    private void saveQuest(String source) throws Exception {
        var noteFile = getQuestFile();
        source = source.trim();
        notesHistory.push(noteFile, source);
        Files.writeString(noteFile.toPath(), source, StandardCharsets.UTF_8);
    }
    
    private void buttonParagraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonParagraphActionPerformed
        try {
            var making = groovyClipboard(sourceParagraph.getText());
            var source = loadQuest();
            if (!source.isEmpty()) {
                making = "\n\n" + making;
            }
            source += making;
            saveQuest(source);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonParagraphActionPerformed

    private void buttonItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonItemActionPerformed
        try {
            var making = groovyClipboard(sourceParagraph.getText());
            making = "- " + making;
            var source = loadQuest();
            if (!source.isEmpty()) {
                if (fieldItemLined.isSelected()) {
                    making = "\n" + making;
                } else {
                    making = "\n\n" + making;
                }
            }
            source += making;
            saveQuest(source);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonItemActionPerformed

    private void buttonLinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLinedActionPerformed
        try {
            var making = groovyClipboard(sourceParagraph.getText());
            var source = loadQuest();
            if (!source.isEmpty()) {
                making = "\n" + making;
            }
            source += making;
            saveQuest(source);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonLinedActionPerformed

    private void buttonAppendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAppendActionPerformed
        try {
            var making = groovyClipboard(sourceAppend.getText());
            var source = loadQuest();
            if (!source.isEmpty()) {
                making = " " + making;
            }
            source += making;
            saveQuest(source);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonAppendActionPerformed

    private void buttonUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUndoActionPerformed
        try {
            notesHistory.undo(getQuestFile());
            SwingNotify.show("Done Undo!", 1);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonUndoActionPerformed

    private void buttonRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRedoActionPerformed
        try {
            notesHistory.redo(getQuestFile());
            SwingNotify.show("Done Redo!", 1);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonRedoActionPerformed
    
    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
        try {
            final var newQuestFile = newQuestFile();            
            fieldPath.setText(newQuestFile.getAbsolutePath());
            var baseName = FilenameUtils.getBaseName(newQuestFile.getName());
            WizSwing.putStringOnClipboard("[[" + baseName + "]]");
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonNewActionPerformed

    private void buttonWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWatchActionPerformed
        new TextFileWatcherDesk(new File(fieldPath.getText())).setVisible(true);
    }//GEN-LAST:event_buttonWatchActionPerformed

    private File newQuestFile() throws Exception {
        final var questFolder = getQuestFolder();
        File result;
        do {
            result = new File(questFolder, "(Q) " + WizChars.newRandomStringOnlyNumbers(12));
        } while (result.exists());
        if (!result.createNewFile()) {
            throw new Exception("Could not create the file: " + result.getAbsolutePath());
        }
        return result;
    }
    
    private File getQuestFolder() throws Exception {
        return Root.getSubs("Quest");
    }
    
    private String groovyClipboard(String script) throws Exception {
        var clipboard = WizSwing.getStringOnClipboard().trim();
        if (fieldCleanClipboard.isSelected()) {
            clipboard = cleanClipboard(clipboard);
        }
        if (!script.isBlank()) {
            clipboard = WizGroovy.run(script, WizGroovy.mapped(
                    WizGroovy.map("clipboard", clipboard))).toString();
        }
        return clipboard;
    }
    
    private String cleanClipboard(String clipboard) {
        return clipboard.replaceAll("\\s+", " ");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAppend;
    private javax.swing.JButton buttonItem;
    private javax.swing.JButton buttonLined;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonParagraph;
    private javax.swing.JButton buttonRedo;
    private javax.swing.JButton buttonUndo;
    private javax.swing.JButton buttonWatch;
    private javax.swing.JCheckBox fieldCleanClipboard;
    private javax.swing.JCheckBox fieldItemLined;
    private javax.swing.JTextField fieldPath;
    private javax.swing.JLabel labelPath;
    private javax.swing.JPanel panelAppend;
    private javax.swing.JTabbedPane panelEditors;
    private javax.swing.JPanel panelParagraph;
    private javax.swing.JScrollPane scrollAppend;
    private javax.swing.JScrollPane scrollParagraph;
    private javax.swing.JTextArea sourceAppend;
    private javax.swing.JTextArea sourceParagraph;
    // End of variables declaration//GEN-END:variables
}
