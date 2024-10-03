package br.com.pointel.jeemuvi.acts;

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
    
    private final String driveName;
    private final String originPath;
    private final File destinyFolder;
    private final File visioFolder;
    private final File linkerNote;

    public CaptSounded(String driveName, String originPath, File destinyFolder, File visioFolder, File linkerNote) {
        this.driveName = driveName;
        this.originPath = originPath;
        this.destinyFolder = destinyFolder;
        this.visioFolder = visioFolder;
        this.linkerNote = linkerNote;
    }

    public void run() throws Exception {
        var rootsNamed = WizFiles.getRootsNamed();
        File rootRecorder = null;
        for (var rootNamed : rootsNamed) {
            if (rootNamed.name().startsWith(driveName)) {
                rootRecorder = rootNamed.root();
                break;
            }
        }
        if (rootRecorder == null) {
            throw new Exception("Not found the recorder root.");
        }
        var originFolder = new File(rootRecorder, originPath);
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
            var todayName = "VD-" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            var visioFile = new File(visioFolder, todayName + ".md");
            var visioText = String.join(" | ", links);
            if (visioFile.exists()) {
                visioText = String.join(" | ", Files.readString(visioFile.toPath(), StandardCharsets.UTF_8), visioText);
            }
            Files.writeString(visioFile.toPath(), visioText, StandardCharsets.UTF_8);
            var todayLink = "[[" + todayName + "]]";
            var classText = Files.readString(linkerNote.toPath(), StandardCharsets.UTF_8);
            if (!classText.contains(todayLink)) {
                classText = String.join(" | ", todayLink, classText);
            }
            Files.writeString(linkerNote.toPath(), classText, StandardCharsets.UTF_8);
        }
        WizSwing.showInfo("Done to CatchOn Redit");
    }

}
