package br.com.pointel.jeemuvi.acts;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import br.com.pointel.jarch.gears.CharsSections;
import br.com.pointel.jarch.gears.RunChase;

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
                    var originFiles = getOriginFiles();
                    chase.setProgressSize(originFiles.size());
                    var heartFolder = getHeartFolder();
                    for (var originFile : originFiles) {
                        chase.putInfo("Processing file: %s", originFile);
                        makeHeart(originFile, heartFolder);
                        chase.advanceWaitOnPauseThrowOnStop();
                    }
                    chase.putInfo("Writing the Quest Table.");
                    chase.putInfo("Finished to make the Aelin Heart!");
                } catch (Exception e) {
                    chase.putError(e);
                } finally {
                    chase.finish();
                }
            }
        }.start();
    }

    private List<File> getOriginFiles() {
        var result = new ArrayList<File>();
        result.addAll(Arrays.asList(new File(Root.getFile(), "Based").listFiles()));
        result.addAll(Arrays.asList(new File(Root.getFile(), "Quest").listFiles()));
        return result;
    }

    private File getHeartFolder() throws Exception {
        var result = new File(Root.getFile(), "Heart");
        if (!result.exists()) {
            Files.createDirectories(result.toPath());
        }
        return result;
    }

    private void makeHeart(File originFile, File heartFolder) throws Exception {
        var destinyFile = getDestinyFile(originFile, heartFolder);
        if (destinyFile.exists()
                && originFile.lastModified() < destinyFile.lastModified()) {
            return;
        }
        var sections = new CharsSections(originFile);
        var source = sections.read();
        var headerSource = source.get("");
        var abstractSource = source.get("Resumo");
        var articleSource = source.get("Artigo");
        var assertSource = source.get("Assertivas");
        var questSource = source.get("Questões");
        if (abstractSource == null && articleSource == null) {
            return;
        }
        var builder = new StringBuilder();
        makeHeader(builder, headerSource);
        makeLangs(headerSource, abstractSource, articleSource, assertSource, questSource);
        makeTitle(builder, originFile);
        makeAbstract(builder, abstractSource);
        makeArticle(builder, articleSource);
        makeAssert(builder, assertSource);
        makeQuest(builder, questSource);
        Files.writeString(destinyFile.toPath(), builder.toString(), StandardCharsets.UTF_8);
    }

    private File getDestinyFile(File originFile, File heartFolder) {
        return new File(heartFolder, "(H)" + FilenameUtils.getBaseName(originFile.getName()) + ".txt");
    }

    private void makeHeader(StringBuilder builder, List<String> headerSource) {
        if (headerSource.contains("🌐 : English")) {
            builder.append("{{Voice=Acapela Ryan22/}}<rate absspeed=\"-2\"/>{{Pause=5}}Attention, we are going to start a new title.{{Pause=5}}\n\n");
        } else if (headerSource.contains("🌐 : Español")) {
            builder.append("{{Voice=Acapela Antonio22 (Spanish)/}}<rate absspeed=\"-2\"/>{{Pause=5}}Atención, comencemos un nuevo título.{{Pause=5}}\n\n");
        } else {
            builder.append("{{Voice=Acapela Marcia22 (Brazilian Portuguese)/}}<rate absspeed=\"-2\"/>{{Pause=5}}Atenção, vamos começar um novo título.{{Pause=5}}\n\n");
        }
    }
    
    private void makeLangs(List<String> headerSource, List<String>... sources) {
        if (headerSource.contains("🌐 : Português, English")) {
            replaceAll(sources, 
                    new Replace(" [", " {{Voice=Acapela Ryan22/}}<rate absspeed=\"-2\"/> "),
                    new Replace("] ", " {{Voice=Acapela Marcia22 (Brazilian Portuguese)/}}<rate absspeed=\"-2\"/> "));
        } else if (headerSource.contains("🌐 : Português, Español")) {
            replaceAll(sources, 
                    new Replace(" [", " {{Voice=Acapela Antonio22 (Spanish)/}}<rate absspeed=\"-2\"/> "),
                    new Replace("] ", " {{Voice=Acapela Marcia22 (Brazilian Portuguese)/}}<rate absspeed=\"-2\"/> "));
        }
    }
    
    private void replaceAll(List<String>[] sources, Replace... replaces) {
        for (var source : sources) {
            for (int i = 0; i < source.size(); i++) {
                var line = source.get(i);
                for (var replace : replaces) {
                    line = line.replace(replace.fromChars, replace.toChars);
                }
                source.set(i, line);
            }
        }
    }

    private void makeTitle(StringBuilder builder, File basedFile) {
        var title = FilenameUtils.getBaseName(basedFile.getName());
        if (title.startsWith("(B) ") 
                || title.startsWith("(C) ") 
                || title.startsWith("(Q) ")) {
            title = title.substring(4);
        }
        builder.append(title);
        builder.append(".\n\n");
    }
    
    private void makeAbstract(StringBuilder builder, List<String> abstractSource) {
        if (abstractSource == null) {
            return;
        }
        builder.append("{{Pause=3}}Início do Resumo.{{Pause=3}}\n\n");
        insertLines(builder, abstractSource);
    }

    private void makeArticle(StringBuilder builder, List<String> articleSource) {
        if (articleSource == null) {
            return;
        }
        builder.append("{{Pause=3}}Início do Artigo.{{Pause=3}}\n\n");
        insertLines(builder, articleSource);
    }

    private void makeAssert(StringBuilder builder, List<String> assertSource) {
        if (assertSource == null) {
            return;
        }
        builder.append("{{Pause=3}}Início das Assertivas.{{Pause=3}}\n\n");
        insertLines(builder, assertSource, 
                new Replace("- **", "{{Pause=3}}Ponto{{Pause=2}} - **"),
                new Replace("• **", "{{Pause=3}}Ponto{{Pause=2}} • **"));
    }

    private void makeQuest(StringBuilder builder, List<String> questSource) {
        if (questSource == null) {
            return;
        }
        builder.append("{{Pause=3}}Início das Questões.{{Pause=3}}\n\n");
        insertLines(builder, questSource, 
                new Replace("**Pergunta**", "{{Pause=3}}**Pergunta**{{Pause=2}}"),
                new Replace("**Resposta**", "{{Pause=3}}**Resposta**{{Pause=2}}"));
    }

    private void insertLines(StringBuilder builder, List<String> source, Replace... replaces) {
        for (var line : source) {
            if (replaces != null) {
                for (var replace : replaces) {
                    line = line.replace(replace.fromChars, replace.toChars);
                }
            }
            builder.append(line);
            builder.append("\n");
        }
    }

    private static record Replace(
            String fromChars,
            String toChars) {

    }

}
