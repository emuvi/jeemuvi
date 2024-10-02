package br.com.pointel.jeemuvi.service;

import br.com.pointel.jeemuvi.wizard.WizFiles;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author emuvi
 */
public class CaptSounded {

    public void run() throws Exception {
        if (!WizSwing.showConfirm("Want to CatchOn the Redit?")) {
            return;
        }
        var rootsNamed = WizFiles.getRootsNamed();
        File rootRecorder = null;
        for (var rootNamed : rootsNamed) {
            if (rootNamed.name().startsWith("IC RECORDER")) {
                rootRecorder = rootNamed.root();
                break;
            }
        }
        if (rootRecorder == null) {
            throw new Exception("Not found the recorder root.");
        }
        var destinyFolder = new File("D:\\emuvi\\OneDrive\\Documentos\\Educação\\AELIN\\ABIN\\Redit");
        var originFolder = new File(rootRecorder, "REC_FILE\\FOLDER01");
        var links = new ArrayList<String>();
        for (var reditOrigin : originFolder.listFiles()) {
            var yearOrigin = reditOrigin.getName().substring(0, 2);
            var monthOrigin = reditOrigin.getName().substring(2, 4);
            var dayOrigin = reditOrigin.getName().substring(4, 6);
            var reditDestinyFolder = new File(destinyFolder, yearOrigin + "/" + monthOrigin + "/" + dayOrigin);
            var reditDestinyFile = new File(reditDestinyFolder, "(R) " + reditOrigin.getName());
            Files.createDirectories(reditDestinyFolder.toPath());
            Files.copy(reditOrigin.toPath(), reditDestinyFile.toPath());
            reditOrigin.delete();
            var baseName = "(R) " + FilenameUtils.getBaseName(reditOrigin.getName());
            var newNote = new File(reditDestinyFolder, baseName + ".md");
            Files.createFile(newNote.toPath());
            links.add("[[" + baseName + "]]");
        }
        if (!links.isEmpty()) {
            var visioFolder = new File("D:\\emuvi\\OneDrive\\Documentos\\Educação\\AELIN\\ABIN\\Visio");
            var todayName = "VD-" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            var visioFile = new File(visioFolder, todayName + ".md");
            var visioText = String.join(" | ", links);
            if (visioFile.exists()) {
                visioText = String.join(" | ", Files.readString(visioFile.toPath(), StandardCharsets.UTF_8), visioText);
            }
            Files.writeString(visioFile.toPath(), visioText, StandardCharsets.UTF_8);
            var classFile = new File("D:\\emuvi\\OneDrive\\Documentos\\Educação\\AELIN\\ABIN\\Class\\Revisão Diária.md");
            var todayLink = "[[" + todayName + "]]";
            var classText = Files.readString(classFile.toPath(), StandardCharsets.UTF_8);
            if (!classText.contains(todayLink)) {
                classText = String.join(" | ", todayLink, classText);
            }
            Files.writeString(classFile.toPath(), classText, StandardCharsets.UTF_8);
        }
        WizSwing.showInfo("Done to CatchOn Redit");
    }

}
