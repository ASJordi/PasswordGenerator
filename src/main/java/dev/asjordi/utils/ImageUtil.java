package dev.asjordi.utils;

import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class ImageUtil {
 
    public static ImageIcon getIcon() {
        try {
            InputStream inputStream = ImageUtil.class.getResourceAsStream("/img/icon.png");
            if (inputStream != null) return new ImageIcon(ImageIO.read(inputStream));
            else return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
