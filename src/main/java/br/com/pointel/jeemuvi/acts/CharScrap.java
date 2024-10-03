package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.wizard.WizChars;
import br.com.pointel.jeemuvi.wizard.WizSwing;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 *
 * @author emuvi
 */
public class CharScrap {
    
    private final File origin;
    private final Integer lines;
    private final Boolean deleteOnEmpty;

    public CharScrap(File origin, Integer lines, Boolean deleteOnEmpty) {
        this.origin = origin;
        this.lines = lines;
        this.deleteOnEmpty = deleteOnEmpty;
    }
    
    public void run() throws Exception {
        var source = Files.readString(origin.toPath(), StandardCharsets.UTF_8);
        var sourceLines = WizChars.getLines(source);
        var builderScrap = new StringBuilder();
        var builderSource = new StringBuilder();
        for (var index = 0; index < sourceLines.length; index++) {
            var sourceLine = sourceLines[index];
            if (index < lines) {
                if (!sourceLine.isBlank()) {
                    builderScrap.append(sourceLine);
                }
                builderScrap.append("\n");
            } else {
                builderSource.append(sourceLine);
                builderSource.append("\n");
            }     
        }
        var doneScrap = builderScrap.toString().trim();
        var doneSource = builderSource.toString().trim();
        WizSwing.putStringOnClipboard(doneScrap);
        Files.writeString(origin.toPath(), doneSource, StandardCharsets.UTF_8);
        if (deleteOnEmpty && doneSource.isEmpty()) {
            origin.delete();
        }
    }
    
}
