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
    private final String kind;
    private final Integer count;
    private final Boolean deleteOnEmpty;

    public CharScrap(File origin, String kind, Integer count, Boolean deleteOnEmpty) {
        this.origin = origin;
        this.kind = kind;
        this.count = count;
        this.deleteOnEmpty = deleteOnEmpty;
    }
    
    public void run() throws Exception {
        var source = Files.readString(origin.toPath(), StandardCharsets.UTF_8);
        var sourceLines = WizChars.getLines(source);
        var builderScrap = new StringBuilder();
        var builderSource = new StringBuilder();
        var done = 0;
        for (var sourceLine : sourceLines) {
            if (done < count) {
                if (!sourceLine.isBlank()) {
                    builderScrap.append(sourceLine);
                }
                builderScrap.append("\n");
            } else {
                builderSource.append(sourceLine);
                builderSource.append("\n");
            }
            if ("Lines".equals(kind)) {
                done += 1;
            } else {
                done += sourceLine.length();
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
