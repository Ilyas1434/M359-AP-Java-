package Unit4.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
//Hello this is a test string for me to act upon
public class PigLatin {
    public static String toPigLatin(String str) {
        String ret = "";
        str = str.toLowerCase();
        while(str.indexOf(" ") != -1) {
            int i = str.indexOf(" ");
            ret += translateWordToPigLatin(str.substring(0, i));
            ret += " ";
            str = str.substring(i + 1);
        }
        ret += translateWordToPigLatin(str);
        char firstLetter = ret.charAt(0);
        String first = Character.toString(firstLetter);
        first = first.toUpperCase();
        ret = first + ret.substring(1);
        return ret;

    }

    public static String translateWordToPigLatin(String str) {
        String retString = "";
        boolean lowerVowels = str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i'
                || str.charAt(0) == 'o' || str.charAt(0) == 'u';
        boolean capitalVowels = str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I'
                || str.charAt(0) == 'O' || str.charAt(0) == 'U';
        if(lowerVowels || capitalVowels) {
            retString = str + "yay";
        }
        else {
            // This will be inside a helper method
            retString = consonantFirst(str);
        }
        return retString;
    }
    public static String consonantFirst(String str) {
        int i = 0;
        int consonantCount = 0;
        while(str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O'
                    && str.charAt(i) != 'U' && str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                consonantCount++;
            i++;
        }
        String cluster = str.substring(0,consonantCount);
        String leftOver = str.substring(consonantCount);
        return leftOver + cluster + "ay";
    }

}
// if word begins with consonants, move consonants to end and add ay
// if beings with vowels, add yay to the end
// treat y as a consonant
