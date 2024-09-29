package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.Act;
import br.com.pointel.jeemuvi.ActMeta;
import br.com.pointel.jeemuvi.ActProp;
import br.com.pointel.jeemuvi.wizard.WizFiles;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.io.File;
import java.nio.file.Files;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author emuvi
 */
public class AelinReditCatchOn extends Act {

    public static final ActMeta META = new ActMeta(
            "AelinReditCatchOn", 
            "Catch all new Redit and puts on Aelin and bootstrap them up.", 
                new ActProp[]{});
    
    @Override
    public ActMeta getMeta() {
        return META;
    }

    @Override
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
            throw new Exception("Not found root recorder");
        }
        var destinyFolder = new File("D:\\emuvi\\OneDrive\\Documentos\\Educação\\AELIN\\ABIN\\Redit");
        var originFolder = new File(rootRecorder, "REC_FILE\\FOLDER01");
        for (var reditOrigin : originFolder.listFiles()) {
            var reditDestiny = new File(destinyFolder, reditOrigin.getName());
            Files.copy(reditOrigin.toPath(), reditDestiny.toPath());
            reditOrigin.delete();
            var newNote = new File(destinyFolder, FilenameUtils.getBaseName(reditOrigin.getName()) + ".md");
            Files.createFile(newNote.toPath());
        }
        WizSwing.showInfo("Done to CatchOn Redit");
    }
    
}
