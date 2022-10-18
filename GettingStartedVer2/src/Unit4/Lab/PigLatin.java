package Unit4.Lab;

import java.util.Objects;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(translateWordToPigLatin("BLACK"));
    }
    public static String toPigLatin() {
        String retString = "";
        return retString;
    }
    public static String translateWordToPigLatin(String str) {
        String retString = "";
        boolean lowerVowels = str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u';
        boolean capitalVowels = str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'O' || str.charAt(0) == 'U';
        if(lowerVowels || capitalVowels) {
            retString = str + "yay";
        }
        if(!lowerVowels || !capitalVowels) {
            // This will be inside a helper method
            retString = consonantFirst(str);
        }
        return retString;
    }
    public static String consonantFirst(String str) {
        int i = 0;
        int consonantCount = 0;
        while(str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U'
                && str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
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
