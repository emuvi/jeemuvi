package br.com.pointel.jeemuvi.acts;

import br.com.pointel.jeemuvi.wizes.WizProps;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author emuvi
 */
public class Root {
    
    private static final String ROOT_PROP = "Jeemuvi - Root";
    
    public static String get() {
        return WizProps.get(ROOT_PROP, "root");
    }
    
    public static void set(String root) {
        WizProps.set(ROOT_PROP, root);
    }
    
    public static File getFile() {
        return new File(get());
    }
    
    public static Path getPath() {
        return new File(get()).toPath();
    }
    
    public static File getSubs(String... names) throws Exception {
        var result = getFile();
        for (var name : names) {
            result = new File(result, name);
        }
        Files.createDirectories(result.toPath());
        return result;
    }
    
}
