package br.com.pointel.jeemuvi.wizes;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author emuvi
 */
public class WizChats {
    
    private static final File FOLDER_CHATS = new File("chats");
    private static final String TAG_INSERT = "<<INSERT_HERE>>";
    
    public static void openChatsFolder() throws Exception {
        WizSwing.open(FOLDER_CHATS);
    }
 
    public static List<String> getChatsNames() {
        var result = new ArrayList<String>();
        for (var inside : FOLDER_CHATS.listFiles()) {
            if (inside.isFile() && inside.getName().toLowerCase().endsWith(".txt")) {
                result.add(inside.getName());
            }
        }
        return result;
    }
    
    public static void loadChatsNames(DefaultComboBoxModel<String> field) {
        field.removeAllElements();
        for(var chatName : getChatsNames()) {
            field.addElement(chatName);
        }
    }
    
    public static String loadChat(String chatName) throws Exception {
        var chatFile = new File(FOLDER_CHATS, chatName);
        return Files.readString(chatFile.toPath(), StandardCharsets.UTF_8);
    }
    
    public static void saveChat(String chatName, String source) throws Exception {
        var chatFile = new File(FOLDER_CHATS, chatName);
        Files.writeString(chatFile.toPath(), source, StandardCharsets.UTF_8);
    }
    
    public static String maybeInsertClipboard(String chatName) throws Exception {
        var chat = loadChat(chatName);
        if (chat.contains(TAG_INSERT)) {
            chat = chat.replace(TAG_INSERT, WizSwing.getStringOnClipboard());
        }
        return chat;
    }
    
    public static String forceInsertClipboard(String chatName) throws Exception {
        var chat = loadChat(chatName);
        if (chat.contains(TAG_INSERT)) {
            chat = chat.replace(TAG_INSERT, WizSwing.getStringOnClipboard());
        } else {
            chat += "\n" + WizSwing.getStringOnClipboard();
        }
        return chat;
    }
    
}
