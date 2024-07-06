package dev.asjordi.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class FileUtil {
    
    private static final Path PATH = Paths.get("data.txt");
    
    public static void writePassword(String password) {
        try (Writer w = new FileWriter(PATH.toFile(), true);
                BufferedWriter bw = new BufferedWriter(w)) {
            bw.append(password).append("\n");
            bw.flush();
        } catch (Exception e) {
            throw new RuntimeException("Failed to write password", e);
        }
    }
    
    public static List<String> readAllPasswords() {
        List<String> list = new ArrayList<>();
        
        try (Reader r = new FileReader(PATH.toFile(), StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(r)) {
            String line;
            while ((line = br.readLine()) != null) {                
                list.add(line);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to read passwords", e);
        }
        
        return list;
    }
    
}