package br.com.pointel.jeemuvi.service;

import br.com.pointel.jeemuvi.wizard.WizChars;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author emuvi
 */
public class CaptSubtitled {
    
    private final File origin;
    private final File destinyFolder;
    private final String destinyName;
    private final File linker;
    
    private final List<String> links;

    public CaptSubtitled(File origin, File destinyFolder, String destinyName, File linker) {
        this.origin = origin;
        this.destinyFolder = destinyFolder;
        this.destinyName = destinyName;
        this.linker = linker;
        this.links = new ArrayList<>();
    }
    
    public void run() throws Exception {
        if (origin.isDirectory()) {
            for (var inside : origin.listFiles()) {
                shoot(inside);
            }
        } else {
            shoot(origin);
        }
        if (!links.isEmpty()) {
            makeLinker();
        }
    }
    
    private void shoot(File file) throws Exception {
        if (file.getName().endsWith(".srt")) {
            capture(file);
        }
    }
    
    private void capture(File file) throws Exception {
        var source = Files.readString(file.toPath(), StandardCharsets.UTF_8);
        var builder = new StringBuilder();
        var lines = WizChars.getLines(source);
        for (var line : lines) {
            line = line.trim();
            line = line.replaceAll("^\\d+$", "");
            line = line.replaceAll("^(\\d{2}:\\d{2}:\\d{2},\\d{3}) --> (\\d{2}:\\d{2}:\\d{2},\\d{3})$", "");
            if (!line.isEmpty()) {
                builder.append(line);
                builder.append("\n");
            }
        }
        var baseName = FilenameUtils.getBaseName(file.getName());
        var newName = destinyName.replace("{name}", baseName);
        var destinyFile = new File(destinyFolder, newName + ".md");
        Files.writeString(destinyFile.toPath(), builder.toString(), StandardCharsets.UTF_8);
        links.add("[[" + newName + "]]");
    }
    
    private void makeLinker() throws Exception {
        if (linker.exists()) {
            links.add(0, Files.readString(linker.toPath(), StandardCharsets.UTF_8));
        }
        var source = String.join("\n\n", links);
        Files.writeString(linker.toPath(), source, StandardCharsets.UTF_8);
    }
    
}
