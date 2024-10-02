package br.com.pointel.jeemuvi.service;

import br.com.pointel.jeemuvi.wizard.WizChars;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author emuvi
 */
public class CaptSubtitled {
    
    private final File origem;
    private final File destino;
    private final File vinculador;

    public CaptSubtitled(File origem, File destino, File vinculador) {
        this.origem = origem;
        this.destino = destino;
        this.vinculador = vinculador;
    }
    
    public void run() throws Exception {
        if (origem.isDirectory()) {
            for (var inside : origem.listFiles()) {
                shoot(inside);
            }
        } else {
            shoot(origem);
        }
    }
    
    private void shoot(File file) throws Exception {
        if (file.getName().endsWith(".srt")) {
            capturar(file);
        }
    }
    
    private void capturar(File legenda) throws Exception {
        var source = Files.readString(legenda.toPath(), StandardCharsets.UTF_8);
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
        var baseName = FilenameUtils.getBaseName(legenda.getName());
        var fileDestino = new File(destino, baseName + ".md");
        Files.writeString(fileDestino.toPath(), builder.toString(), StandardCharsets.UTF_8);
    }
    
}
