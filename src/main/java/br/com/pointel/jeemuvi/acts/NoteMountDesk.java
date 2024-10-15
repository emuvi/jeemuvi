package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.CharsSections;
import br.com.pointel.jeemuvi.gears.TextHistory;
import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.gears.SwingNotify;
import br.com.pointel.jeemuvi.wizes.WizChars;
import br.com.pointel.jeemuvi.wizes.WizGroovy;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author emuvi
 */
public class NoteMountDesk extends javax.swing.JFrame {

    private final TextHistory notesHistory = new TextHistory(10);

    public NoteMountDesk() {
        initComponents();
        initFrame();
    }

    private void initFrame() {
        SwingDropper.initAllOn(this);
        new SwingDropper((f) -> setPath(f), this).init();
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
        fieldItemLined = new javax.swing.JCheckBox();
        buttonLined = new javax.swing.JButton();
        buttonAppend = new javax.swing.JButton();
        buttonUndo = new javax.swing.JButton();
        buttonRedo = new javax.swing.JButton();
        fieldCopyKind = new javax.swing.JComboBox<>();
        buttonCopyBuffer = new javax.swing.JButton();
        fieldSections = new javax.swing.JComboBox<>();
        buttonGetFromSection = new javax.swing.JButton();
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
        panelItem = new javax.swing.JPanel();
        scrollItem = new javax.swing.JScrollPane();
        sourceItem = new javax.swing.JTextArea();
        panelAppend = new javax.swing.JPanel();
        scrollAppend = new javax.swing.JScrollPane();
        sourceAppend = new javax.swing.JTextArea();
        buttonCleanCopyBuffer = new javax.swing.JButton();
        buttonCopyAndCleanBuffer = new javax.swing.JButton();
        buttonPutOnSection = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NoteMount");
        setName("NoteMountDesk"); // NOI18N

        buttonSection.setMnemonic('S');
        buttonSection.setText("S");
        buttonSection.setToolTipText("Section");
        buttonSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSectionActionPerformed(evt);
            }
        });

        fieldTitleSize.setName("TitleSize"); // NOI18N
        fieldTitleSize.setValue(3);

        buttonTitle.setMnemonic('T');
        buttonTitle.setText("T");
        buttonTitle.setToolTipText("Title");
        buttonTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTitleActionPerformed(evt);
            }
        });

        buttonParagraph.setMnemonic('P');
        buttonParagraph.setText("P");
        buttonParagraph.setToolTipText("Paragraph");
        buttonParagraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonParagraphActionPerformed(evt);
            }
        });

        buttonItem.setMnemonic('I');
        buttonItem.setText("I");
        buttonItem.setToolTipText("Item");
        buttonItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonItemActionPerformed(evt);
            }
        });

        fieldItemLined.setName("ItemLined"); // NOI18N

        buttonLined.setMnemonic('L');
        buttonLined.setText("L");
        buttonLined.setToolTipText("Lined");
        buttonLined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLinedActionPerformed(evt);
            }
        });

        buttonAppend.setMnemonic('A');
        buttonAppend.setText("A");
        buttonAppend.setToolTipText("Append");
        buttonAppend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAppendActionPerformed(evt);
            }
        });

        buttonUndo.setMnemonic('<');
        buttonUndo.setText("<");
        buttonUndo.setToolTipText("Undo");
        buttonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUndoActionPerformed(evt);
            }
        });

        buttonRedo.setMnemonic('>');
        buttonRedo.setText(">");
        buttonRedo.setToolTipText("Redo");
        buttonRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRedoActionPerformed(evt);
            }
        });

        fieldCopyKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Note", "Section", "Title", "Paragraph", "Append" }));
        fieldCopyKind.setToolTipText("Copy Source");
        fieldCopyKind.setName("CopyKind"); // NOI18N

        buttonCopyBuffer.setText("/");
        buttonCopyBuffer.setToolTipText("Copy the Buffer to Clipboard");
        buttonCopyBuffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyBufferActionPerformed(evt);
            }
        });

        fieldSections.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Based", "Fount", "Source", "Article", "Assert", "Quest" }));
        fieldSections.setName("ChatName"); // NOI18N

        buttonGetFromSection.setText("/");
        buttonGetFromSection.setToolTipText("Get From Section");
        buttonGetFromSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGetFromSectionActionPerformed(evt);
            }
        });

        fieldCleanClipboard.setMnemonic('X');
        fieldCleanClipboard.setText("X");
        fieldCleanClipboard.setToolTipText("Clean Clipboard");
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
                .addComponent(scrollSection, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSectionLayout.setVerticalGroup(
            panelSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollSection, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
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
                .addComponent(scrollTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
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
                .addComponent(scrollParagraph, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelParagraphLayout.setVerticalGroup(
            panelParagraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParagraphLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollParagraph, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditors.addTab("Paragraph", panelParagraph);

        sourceItem.setColumns(20);
        sourceItem.setRows(5);
        sourceItem.setText("\"$clipboard\"");
        sourceItem.setName("SourceItem"); // NOI18N
        scrollItem.setViewportView(sourceItem);

        javax.swing.GroupLayout panelItemLayout = new javax.swing.GroupLayout(panelItem);
        panelItem.setLayout(panelItemLayout);
        panelItemLayout.setHorizontalGroup(
            panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollItem, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelItemLayout.setVerticalGroup(
            panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollItem, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditors.addTab("Item", panelItem);

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
                .addComponent(scrollAppend, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAppendLayout.setVerticalGroup(
            panelAppendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAppend, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditors.addTab("Append", panelAppend);

        buttonCleanCopyBuffer.setText("_");
        buttonCleanCopyBuffer.setToolTipText("Clean the Copy Buffer");
        buttonCleanCopyBuffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanCopyBufferActionPerformed(evt);
            }
        });

        buttonCopyAndCleanBuffer.setText("|");
        buttonCopyAndCleanBuffer.setToolTipText("Copy and Clean the Buffer");
        buttonCopyAndCleanBuffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyAndCleanBufferActionPerformed(evt);
            }
        });

        buttonPutOnSection.setText("\\");
            buttonPutOnSection.setToolTipText("Put On Section");
            buttonPutOnSection.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonPutOnSectionActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelEditors, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(fieldPath)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonWatch))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonCleanCopyBuffer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldCopyKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonCopyBuffer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonCopyAndCleanBuffer)
                            .addGap(18, 18, 18)
                            .addComponent(fieldSections, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonPutOnSection)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonGetFromSection))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelPath)
                                .addGroup(layout.createSequentialGroup()
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
                        .addComponent(fieldItemLined, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonUndo)
                            .addComponent(buttonRedo)
                            .addComponent(fieldCleanClipboard))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSection)
                            .addComponent(fieldTitleSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTitle)
                            .addComponent(buttonParagraph)
                            .addComponent(buttonAppend)
                            .addComponent(buttonItem)
                            .addComponent(buttonLined)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldCopyKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCopyBuffer)
                        .addComponent(fieldSections, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonGetFromSection)
                        .addComponent(buttonCleanCopyBuffer)
                        .addComponent(buttonCopyAndCleanBuffer)
                        .addComponent(buttonPutOnSection))
                    .addGap(22, 22, 22)
                    .addComponent(labelPath)
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

    private void setPath(List<File> files) {
        if (files != null && !files.isEmpty()) {
            fieldPath.setText(files.get(0).getAbsolutePath());
        }
        buttonCleanCopyBufferActionPerformed(null);
        notesHistory.clean();
    }

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

    private void buttonGetFromSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGetFromSectionActionPerformed
        try {
            var charsSections = new CharsSections(getNoteFile());
            var sections = charsSections.read(notesHistory);
            var lines = sections.get(getSelectedSection());
            if (lines == null) {
                WizSwing.putStringOnClipboard("");
            } else {
                WizSwing.putStringOnClipboard(String.join("\n", lines));
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonGetFromSectionActionPerformed


    private void buttonCopyBufferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyBufferActionPerformed
        try {
            switch (fieldCopyKind.getSelectedItem().toString()) {
                case "Note" ->
                    copyNote();
                case "Section" ->
                    copySection();
                case "Title" ->
                    copyTitle();
                case "Paragraph" ->
                    copyParagraph();
                case "Append" ->
                    copyAppend();
            }
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonCopyBufferActionPerformed

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
            var making = groovyClipboard(sourceItem.getText());
            making = "- " + making;
            var source = loadNote();
            if (!source.isEmpty()) {
                if (fieldItemLined.isSelected()) {
                    making = "\n" + making;
                } else {
                    making = "\n\n" + making;
                }
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

    private void buttonCleanCopyBufferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanCopyBufferActionPerformed
        copySection = "";
        copyTitle = "";
        copyParagraph = "";
        copyAppend = "";
    }//GEN-LAST:event_buttonCleanCopyBufferActionPerformed

    private void buttonCopyAndCleanBufferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyAndCleanBufferActionPerformed
        buttonCopyBufferActionPerformed(evt);
        buttonCleanCopyBufferActionPerformed(evt);
    }//GEN-LAST:event_buttonCopyAndCleanBufferActionPerformed

    private void buttonPutOnSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPutOnSectionActionPerformed
        try {
            var clipboard = WizSwing.getStringOnClipboard().trim();
            if (clipboard.isEmpty()) {
                throw new Exception("Clipboard is empty.");
            }
            var lines = Arrays.stream(WizChars.getLines(clipboard))
                    .collect(Collectors.toCollection(ArrayList::new));
            lines.add(0, "");
            lines.add("");
            var charsSections = new CharsSections(getNoteFile());
            var sections = charsSections.read(notesHistory);
            sections.put(getSelectedSection(), lines);
            charsSections.write(sections, notesHistory);
        } catch (Exception e) {
            WizSwing.showError(e);
        }
    }//GEN-LAST:event_buttonPutOnSectionActionPerformed

    private void buttonLinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLinedActionPerformed
        try {
            var making = groovyClipboard(sourceParagraph.getText());
            var source = loadNote();
            if (!source.isEmpty()) {
                making = "\n" + making;
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
    }//GEN-LAST:event_buttonLinedActionPerformed

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
        return clipboard
                .replaceAll("\\s+", " ")
                .replace("- ", "");
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

    private String getSelectedSection() {
        return fieldSections.getSelectedItem().toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAppend;
    private javax.swing.JButton buttonCleanCopyBuffer;
    private javax.swing.JButton buttonCopyAndCleanBuffer;
    private javax.swing.JButton buttonCopyBuffer;
    private javax.swing.JButton buttonGetFromSection;
    private javax.swing.JButton buttonItem;
    private javax.swing.JButton buttonLined;
    private javax.swing.JButton buttonParagraph;
    private javax.swing.JButton buttonPutOnSection;
    private javax.swing.JButton buttonRedo;
    private javax.swing.JButton buttonSection;
    private javax.swing.JButton buttonTitle;
    private javax.swing.JButton buttonUndo;
    private javax.swing.JButton buttonWatch;
    private javax.swing.JCheckBox fieldCleanClipboard;
    private javax.swing.JComboBox<String> fieldCopyKind;
    private javax.swing.JCheckBox fieldItemLined;
    private javax.swing.JTextField fieldPath;
    private javax.swing.JComboBox<String> fieldSections;
    private javax.swing.JSpinner fieldTitleSize;
    private javax.swing.JLabel labelPath;
    private javax.swing.JPanel panelAppend;
    private javax.swing.JTabbedPane panelEditors;
    private javax.swing.JPanel panelItem;
    private javax.swing.JPanel panelParagraph;
    private javax.swing.JPanel panelSection;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JScrollPane scrollAppend;
    private javax.swing.JScrollPane scrollItem;
    private javax.swing.JScrollPane scrollParagraph;
    private javax.swing.JScrollPane scrollSection;
    private javax.swing.JScrollPane scrollTitle;
    private javax.swing.JTextArea sourceAppend;
    private javax.swing.JTextArea sourceItem;
    private javax.swing.JTextArea sourceParagraph;
    private javax.swing.JTextArea sourceSection;
    private javax.swing.JTextArea sourceTitle;
    // End of variables declaration//GEN-END:variables
}
