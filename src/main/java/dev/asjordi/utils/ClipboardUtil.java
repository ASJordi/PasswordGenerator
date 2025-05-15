package dev.asjordi.utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class ClipboardUtil {
    
    private final static Logger logger = LoggerFactory.getLogger(ClipboardUtil.class);
    
    public static void copyToClipboard(String str) {
        
        logger.atDebug().log("Copy to clipboard -> {}", str);
        
        if (!str.isBlank()) {
            StringSelection stringSelection = new StringSelection(str);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            logger.atDebug().log("The content has been copied to the clipboard.");
        }
        
    }
    
}
