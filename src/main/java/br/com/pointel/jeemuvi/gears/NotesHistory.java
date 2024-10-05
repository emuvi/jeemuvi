package br.com.pointel.jeemuvi.gears;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author emuvi
 */
public class NotesHistory {

    private final Integer size;
    private final Map<File, History> notesHistory = new HashMap<>();

    public NotesHistory(Integer size) {
        this.size = size;
    }

    public void push(File noteFile, String source) {
        getHistory(noteFile).push(source);
    }

    public void undo(File noteFile) throws Exception {
        getHistory(noteFile).undo();
    }

    public void redo(File noteFile) throws Exception {
        getHistory(noteFile).redo();
    }

    private History getHistory(File noteFile) {
        var history = notesHistory.get(noteFile);
        if (history == null) {
            history = new History(noteFile);
            notesHistory.put(noteFile, history);
        }
        return history;
    }

    private class History {

        private final File noteFile;
        private final List<String> sources;
        private Integer index;

        public History(File noteFile) {
            this.noteFile = noteFile;
            this.sources = new ArrayList<>();
            this.index = -1;
        }

        public void push(String source) {
            assert source != null;
            if (index > -1 && source.equals(sources.get(index))) {
                return;
            }
            if (index + 1 < sources.size() && source.equals(sources.get(index + 1))) {
                index++;
                return;
            }
            index++;
            sources.add(index, source);
            while (index > size) {
                sources.remove(0);
                index--;
            }
        }

        public void undo() throws Exception {
            if (index < 0) {
                throw new Exception("No source in the history to undo.");
            }
            rewrite();
            index--;
        }

        public void redo() throws Exception {
            if (index >= sources.size() - 1) {
                throw new Exception("No source in the history to redo.");
            }
            index++;
            rewrite();
        }

        private void rewrite() throws Exception {
            var source = sources.get(index);
            Files.writeString(noteFile.toPath(), source, StandardCharsets.UTF_8);
        }

    }

}
