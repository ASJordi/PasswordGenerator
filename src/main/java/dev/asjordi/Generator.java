package dev.asjordi;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.datafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class Generator {
    
    private static final Logger logger = LoggerFactory.getLogger(Generator.class);
    private static final String UPPERCASE = "ABCDEFGJKLMNPRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*";
    public static Integer MIN_LENGTH_PASSWORD = 8;
    public static Integer MIN_LENGTH_PASSPHRASE = 3;
    public static String DEFAULT_SEPARATOR = "-";
    private static SecureRandom r = new SecureRandom();
    private static Faker f = new Faker();
    
    public static String generatePassword(int length, boolean uppercase, boolean lowercase, boolean numbers, boolean symbols, int minNumbers, int minSpecial) {
        
        if (length < MIN_LENGTH_PASSWORD) length = MIN_LENGTH_PASSWORD;
        
        logger.atDebug()
                .setMessage("Generating password with length {}, uppercase -> {}, lowercase -> {}, numbers -> {}, symbols -> {}, min numbers = {}, min special = {}")
                .addArgument(length)
                .addArgument(uppercase)
                .addArgument(lowercase)
                .addArgument(numbers)
                .addArgument(symbols)
                .addArgument(minNumbers)
                .addArgument(minSpecial)
                .log();
        
        StringBuilder password = new StringBuilder();
        StringBuilder allowed = new StringBuilder();
        List<Character> passwordChars = new ArrayList<>();
        
        for (int i = 0; i < minNumbers; i++) {
            passwordChars.add(NUMBERS.charAt(r.nextInt(NUMBERS.length())));
        }
        
        for (int i = 0; i < minSpecial; i++) {
            passwordChars.add(SYMBOLS.charAt(r.nextInt(SYMBOLS.length())));
        }
        
        if (uppercase) allowed.append(UPPERCASE);
        if (lowercase) allowed.append(LOWERCASE);
        if (numbers) allowed.append(NUMBERS);
        if (symbols) allowed.append(SYMBOLS);
        
        while (passwordChars.size() < length) {            
            passwordChars.add(allowed.charAt(r.nextInt(allowed.length())));
        }
        
        Collections.shuffle(passwordChars);
        for (Character c : passwordChars) password.append(c);
        
        logger.atDebug().log("Password generated correctly.");
        
        return password.toString();
    }
    
    public static String generatePassphrase(int length, String separator, boolean capitalize, boolean includeNumber) {
        
        if (length < MIN_LENGTH_PASSPHRASE) length = MIN_LENGTH_PASSPHRASE;
        if (separator.isBlank()) separator = DEFAULT_SEPARATOR;
        
        logger.atDebug()
                .setMessage("Generating passphrase with length {}, separator -> {}, capitalize -> {}, include numbers -> {}")
                .addArgument(length)
                .addArgument(separator)
                .addArgument(capitalize)
                .addArgument(includeNumber)
                .log();
        
        StringBuilder password = new StringBuilder();
        
        List<String> words = f.collection(() -> f.verb().base())
                .maxLen(length)
                .generate();
        
        int indexToIncludeNumber = r.nextInt(words.size());
        char number = NUMBERS.charAt(r.nextInt(NUMBERS.length()));
        
        if (includeNumber) words.set(indexToIncludeNumber, words.get(indexToIncludeNumber) + String.valueOf(number));
        
        Collections.shuffle(words);
        
        for (String w : words) {
            if (capitalize) password.append(capitalizeWord(w)).append(separator);    
            else password.append(w).append(separator);
        }
        
        logger.atDebug().log("Passphrase generated correctly.");
        
        return password.toString().substring(0, password.length() - 1);
    }
    
    private static String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
    
}