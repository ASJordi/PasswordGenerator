package dev.asjordi.utils;

import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class ImageUtil {
    
    private final static Logger logger = LoggerFactory.getLogger(ImageUtil.class);
 
    public static ImageIcon getIcon() {
        try {
            logger.atDebug().log("Getting application icon.");
            InputStream inputStream = ImageUtil.class.getResourceAsStream("/img/icon.png");
            if (inputStream != null) {
                logger.atDebug().log("Icon has been loaded.");
                return new ImageIcon(ImageIO.read(inputStream));
            }
            else {
                logger.atDebug().log("Error getting icon.");
                return null;
            }
        } catch (IOException e) {
            logger.atError()
                    .setMessage("Failed to get icon.")
                    .setCause(e)
                    .log();
            e.printStackTrace();
            return null;
        }
    }
    
}
