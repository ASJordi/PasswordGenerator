package dev.asjordi;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class PasswordGenerator {
    
    private static final String UPPERCASE = "ABCDEFGJKLMNPRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*";
    public static Integer MIN_LENGTH = 8;
    private static SecureRandom r = new SecureRandom();
    
    public static String generate(int length, boolean uppercase, boolean lowercase, boolean numbers, boolean symbols, int minNumbers, int minSpecial) {
        
        if (length < MIN_LENGTH) length = MIN_LENGTH;
        
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
        
        return password.toString();
    }
    
}