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
public class HeartMake {

    private final File folder;
    private final String addAtTheEnd;

    public HeartMake(File folder, String addAtTheEnd) {
        this.folder = folder;
        this.addAtTheEnd = addAtTheEnd;
    }

    public Saved capture() throws Exception {
        var content = WizSwing.getStringOnClipboard();
        var nameText = WizChars.generateRandomString(18);
        var saved = produce(content, null, nameText, true);
        WizSwing.putStringOnClipboard("[[" + saved.nameMark + "]]");
        return saved;
    }

    public void remake() throws Exception {

    }
    
    private Saved produce(String origin, String nameMark, String nameText, boolean checkAlreadyExists) throws Exception {
        origin = origin.replaceAll("\\【.*\\†.*\\】", "");
        var begin = "{{Voice=Acapela Marcia22 (Brazilian Portuguese)/}}{{Pause=3}}Início.{{Pause=3}}\n\n";
        var end = "\n\n{{Pause=3}}Fim.{{Pause=3}}";
        if (origin.contains("%% Body in English %%")) {
            origin = origin.replace("%% Body in English %%", "");
            begin = "{{Voice=Acapela Ryan22/}}{{Pause=3}}Begin.{{Pause=3}}\n\n";
            end = "\n\n{{Pause=3}}End.{{Pause=3}}";
        } else if (origin.contains("%% Body in Spanish %%")) {
            origin = origin.replace("%% Body in Spanish %%", "");
            begin = "{{Voice=Acapela Antonio22 (Spanish)/}}{{Pause=3}}Empiezo.{{Pause=3}}\n\n";
            end = "\n\n{{Pause=3}}Fin.Pause=3}}";
        }
        var lines = origin.split("\\r?\\n");
        if (lines.length < 3) {
            throw new Exception("Actual content has too little lines.");
        }
        var title = cleanTitle(lines[0]);
        lines[0] = title;
        if (!lines[0].endsWith(".")) {
            lines[0] = lines[0] + ".";
        }
        for (int i = 1; i < lines.length; i++) {
            lines[i] = cleanLine(lines[i]);
            if (lines[i].startsWith("#") && !lines[i].endsWith(".")) {
                lines[i] = lines[i] + ".";
            }
        }
        var text = begin + String.join("\n", lines) + end;
        if (addAtTheEnd != null && !addAtTheEnd.isBlank()) {
            text = text + "\n\n" + addAtTheEnd;
        }
        if (nameMark == null) {
            nameMark = title;
        }
        if (nameText == null) {
            nameText = nameMark;
        }
        return save(origin, text, nameMark, nameText, checkAlreadyExists);
    }
    
    private String cleanTitle(String title) {
        title = title.trim();
        while (!title.isEmpty() && !isCharTitleBondaryValid(title.charAt(0))) {
            title = title.substring(1);
            title = title.trim();
        }
        while (!title.isEmpty() && !isCharTitleBondaryValid(title.charAt(title.length() - 1))) {
            title = title.substring(0, title.length() - 1);
            title = title.trim();
        }
        return title
                .replace("{", "(")
                .replace("}", ")")
                .replace("[", "(")
                .replace("]", ")")
                .replace("\"", "”")
                .replace("'", "”")
                .replace("/", "-")
                .replace("|", "-")
                .replace("\\", "-")
                .replace("?", "")
                .replace("!", "")
                .replace("<", "")
                .replace(">", "")
                .replace("*", "")
                .replace("#", "")
                .replace(":", ",")
                .replace(";", ",")
                .trim();
    }

    private String cleanLine(String line) {
        return line
                .replaceAll("\\*+", "*")
                .replaceAll("\\#+", "#")
                .replaceAll("\\_+", "_")
                .replaceAll("\\-+", "-")
                .replaceAll("\\++", "+")
                .trim();
    }

    private boolean isCharTitleBondaryValid(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c) || c == '”' || c == '“' || c == '(' || c == ')';
    }

    private Saved save(String origin, String text, String nameMark, String nameText, boolean checkAlreadyExists) throws Exception {
        if (!nameMark.startsWith("(H) ")) {
            if (nameMark.equals(nameText)) {
                nameText = "(H) " + nameText;
            }
            nameMark = "(H) " + nameMark;
        }
        var sourceFile = new File(folder, nameMark + ".md");
        if (sourceFile.exists() && checkAlreadyExists) {
            if (!WizSwing.showConfirm("Already exists, continue?")) {
                return null;
            }
        }
        Files.writeString(sourceFile.toPath(), origin, StandardCharsets.UTF_8);
        Files.writeString(new File(folder, nameText + ".txt").toPath(), text, StandardCharsets.UTF_8);
        return new Saved(nameMark, nameText);
    }

    public static record Saved(
            String nameMark,
            String nameText
    ) {

        @Override
        public String toString() {
            return "Saved{" + "nameMark=" + nameMark + ", nameText=" + nameText + '}';
        }
        
    }

}
