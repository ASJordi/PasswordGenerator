package dev.asjordi.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class FileUtil {
    
    private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);
    private static final Path PATH = Paths.get("data.txt");
    
    public static void writePassword(String password) {
        verifyFile();
        logger.atDebug().log("Starting to write password.");
        
        try (Writer w = new FileWriter(PATH.toFile(), true);
                BufferedWriter bw = new BufferedWriter(w)) {
            bw.append(password).append("\n");
            bw.flush();
            logger.atDebug().log("Password has been saved.");
        } catch (Exception e) {
            logger.atError()
                    .setMessage("Failed to write password.")
                    .setCause(e)
                    .log();
            throw new RuntimeException("Failed to write password", e);
        }
    }
    
    public static List<String> readAllPasswords() {
        verifyFile();
        List<String> list = new ArrayList<>();
        
        logger.atDebug().log("Starting to read stored passwords.");
        
        try (Reader r = new FileReader(PATH.toFile(), StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(r)) {
            String line;
            while ((line = br.readLine()) != null) {                
                list.add(line);
            }
        } catch (Exception e) {
            logger.atError()
                    .setMessage("Failed to read passwords.")
                    .setCause(e)
                    .log();
            throw new RuntimeException("Failed to read passwords", e);
        }
        
        logger.atDebug().log("Passwords read successfully.");
        return list;
    }
    
    private static void verifyFile() {
        
        logger.atDebug().log("Checking if the file {} is valid", PATH);
        
        if (!Files.exists(PATH)) {
            try {
                Files.createFile(PATH);
                logger.atDebug().log("File {} has been created", PATH);
            } catch (IOException ex) {
                logger.atError()
                        .setMessage("Unable to create file {}")
                        .addArgument(PATH)
                        .setCause(ex)
                        .log();
                throw new RuntimeException("Unable to create file");
            }
        }
        
    }
    
}
