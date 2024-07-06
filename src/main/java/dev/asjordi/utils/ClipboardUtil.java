package dev.asjordi.utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class ClipboardUtil {
    
    public static void copyToClipboard(String str) {
        if (!str.isBlank()) {
            StringSelection stringSelection = new StringSelection(str);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }
    
}
