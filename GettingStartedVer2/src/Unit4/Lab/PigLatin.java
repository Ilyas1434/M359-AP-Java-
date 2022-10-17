package Unit4.Lab;

import java.util.Objects;

public class PigLatin {
    public static String toPigLatin() {
        String retString = "";
        return retString;
    }
    public static String translateWordToPigLatin(String str) {
        String retString = "";
        if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u') {
            retString = str + "yay";
        }
        if(str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'O' || str.charAt(0) == 'U') {
            retString = str + "yay";
        }
        if(!(str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'O' || str.charAt(0) == 'U')) {
        }
        if(!(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u')) {

        }
            return retString;
    }
}
// if word begins with consonants, move consonants to end and add ay
// if beings with vowels, add yay to the end
// treat y as a consonant
