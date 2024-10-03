package br.com.pointel.jeemuvi.service;

import java.io.File;
import java.nio.file.Files;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author emuvi
 */
public class FileDuplicate {
    
    private final File path;

    public FileDuplicate(File path) {
        this.path = path;
    }
    
    public void run() throws Exception {
        if (path.isDirectory()) {
            for (var inside : path.listFiles()) {
                duplicate(inside);
            }
        } else {
            duplicate(path);
        }
    }
    
    private void duplicate(File origin) throws Exception {
        var baseName = FilenameUtils.getBaseName(origin.getName());
        var extension = FilenameUtils.getExtension(origin.getName());
        var index = 1;
        var destiny = new File(origin.getParentFile(), baseName + " (" + (++index) + ")." + extension);
        while (destiny.exists()) {
            destiny = new File(origin.getParentFile(), baseName + " (" + (++index) + ")." + extension);
        }
        Files.copy(origin.toPath(), destiny.toPath());
    }
    
}
