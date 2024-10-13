package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.gears.CharsSections;
import br.com.pointel.jeemuvi.gears.RunChase;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author emuvi
 */
public class HeartMaker {

    private final RunChase chase = RunChase.init("Heart Maker");

    public void start() {
        new Thread("HeartRemake") {
            @Override
            public void run() {
                try {
                    chase.putInfo("Starting making the Aelin Heart.");
                    var basedFiles = getBasedFiles();
                    chase.setProgressSize(basedFiles.length);
                    var heartFolder = getHeartFolder();
                    for (var basedFile : basedFiles) {
                        chase.putInfo("Processing file: %s", basedFile);
                        processBased(basedFile, heartFolder);
                        chase.advanceWaitOnPauseThrowOnStop();
                    }
                    chase.putInfo("Finished to make the Aelin Heart!");
                } catch (Exception e) {
                    chase.putError(e);
                } finally {
                    chase.finish();
                }
            }
        }.start();
    }

    private File[] getBasedFiles() {
        return new File(Root.getFile(), "Based").listFiles();
    }

    private File getHeartFolder() throws Exception {
        var result = new File(Root.getFile(), "Heart");
        if (!result.exists()) {
            Files.createDirectories(result.toPath());
        }
        return result;
    }

    private void processBased(File basedFile, File heartFolder) throws Exception {
        var destinyFile = getDestinyFile(basedFile, heartFolder);
        if (destinyFile.exists()) {
            return;
        }
        var sections = new CharsSections(basedFile);
        var source = sections.read();
        var builder = new StringBuilder();
        makeHeader(builder, source.get(""));
        makeTitle(builder, basedFile);
        makeAssert(builder, source.get("Assert"));
        makeQuest(builder, source.get("Quest"));
        Files.writeString(destinyFile.toPath(), builder.toString(), StandardCharsets.UTF_8);
    }

    private File getDestinyFile(File basedFile, File heartFolder) {
        return new File(heartFolder, FilenameUtils.getBaseName(basedFile.getName()) + ".txt");
    }

    private void makeHeader(StringBuilder builder, List<String> headerSource) {
        if (headerSource.contains("%% Body in English %%")) {
            builder.append("{{Voice=Acapela Ryan22/}}{{Pause=3}}Attention.{{Pause=3}}\n\n");
        } else if (headerSource.contains("%% Body in Spanish %%")) {
            builder.append("{{Voice=Acapela Antonio22 (Spanish)/}}{{Pause=3}}Atención.{{Pause=3}}\n\n");
        } else {
            builder.append("{{Voice=Acapela Marcia22 (Brazilian Portuguese)/}}{{Pause=3}}Atenção.{{Pause=3}}\n\n");
        }
    }

    private void makeTitle(StringBuilder builder, File basedFile) {
        var title = FilenameUtils.getBaseName(basedFile.getName());
        if (title.startsWith("(B) ")) {
            title = title.substring(4);
        }
        builder.append(title);
        builder.append("\n\n");
    }

    private void makeAssert(StringBuilder builder, List<String> assertSource) {
        if (assertSource == null) {
            return;
        }
        builder.append("{{Pause=2}}Lista de Pontos Chaves.{{Pause=2}}\n\n");
        insertLines(builder, assertSource);
    }

    private void makeQuest(StringBuilder builder, List<String> questSource) {
        if (questSource == null) {
            return;
        }
        builder.append("{{Pause=2}}Lista de Perguntas e Respostas.{{Pause=2}}\n\n");
        insertLines(builder, questSource);
    }

    private void insertLines(StringBuilder builder, List<String> source) {
        for (var line : source) {
            builder.append(line);
            builder.append("\n");
        }
    }
}
