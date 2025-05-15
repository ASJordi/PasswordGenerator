package dev.asjordi;

import dev.asjordi.view.MainFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class Main {
    
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MainFrame m = new MainFrame();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        logger.atInfo().log("Starting application ...");
    }
    
}
