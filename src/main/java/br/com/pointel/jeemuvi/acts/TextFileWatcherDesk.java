package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.SwingDropper;
import br.com.pointel.jeemuvi.wizes.WizBase;
import br.com.pointel.jeemuvi.wizes.WizSwing;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.SwingUtilities;

/**
 *
 * @author emuvi
 */
public class TextFileWatcherDesk extends javax.swing.JFrame {

    private final Consumer<List<File>> fileConsumer;
    
    private volatile File fileWatched;
    
    public TextFileWatcherDesk() {
        this(null);
    }
    
    public TextFileWatcherDesk(File fileWatched) {
        this.fileWatched = fileWatched;
        this.fileConsumer = initFileConsumer();
        initComponents();
        initFrame();
        initWatcher();
    }
    
    private Consumer<List<File>> initFileConsumer() {
        return (List<File> listFile) -> {
            if (!listFile.isEmpty()) {
                fileWatched = listFile.removeFirst();
            }
        };
    }
    
    private void initFrame() {
        new SwingDropper(fileConsumer, fieldText).init();
        WizSwing.initFrame(this);
        WizSwing.initEscaper(this);
    }
    
    private void initWatcher() {
        new Thread("Text Watcher") {
            @Override
            public void run() {
                while (isDisplayable()) {
                    try {
                        WizBase.sleep(1000);
                        if (fileWatched != null) {
                            show(Files.readString(fileWatched.toPath(), StandardCharsets.UTF_8));
                        } else {
                            show("");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            
            private void show(String source) {
                SwingUtilities.invokeLater(() -> {
                    fieldText.setText(source);
                });
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollText = new javax.swing.JScrollPane();
        fieldText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TextFileWatcher");
        setName("TextFileWatcherDesk"); // NOI18N

        fieldText.setColumns(20);
        fieldText.setLineWrap(true);
        fieldText.setRows(5);
        fieldText.setWrapStyleWord(true);
        scrollText.setViewportView(fieldText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollText, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollText, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea fieldText;
    private javax.swing.JScrollPane scrollText;
    // End of variables declaration//GEN-END:variables
}
