package Unit4;

public class ChallengingLoops_4_5 {
    public static String everyOtherLetterPyramid(String str) {
        String result = "";
        while(str.length() > 1) {
            for (int i = 0; i < str.length(); i += 2) {
                result += str.charAt(i) + "\n";
            }
        }
        return result;
    }

    public static void main (String[] args) {
        // This is the first challenge
        String output = "";
        for(int i = 5; i >= 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //This is the second challenge
        String other = "";
        for(int i = 5; i >= 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println(everyOtherLetterPyramid("FremdVikings"));


    }

}
