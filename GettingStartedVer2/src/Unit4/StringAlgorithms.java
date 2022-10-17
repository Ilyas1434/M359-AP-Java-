package Unit4;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for(int i = 0; i < mySchool.length(); i+= 2) {
            System.out.print(mySchool.charAt(i));
        }

        System.out.println("");
        // print the String mySchool in reverse (all characters on the same line)
        int length = mySchool.length();
        for(int i = length -1; i >= 0; i--) {
            System.out.print(mySchool.charAt(i));
        }


        System.out.println("");

         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "monkey";
        for(var i  = 0; i < animal.length(); i++) {
            System.out.println(animal.substring(0, i + 1));
        }

        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?
        boolean little = false;
        int count = 0;
        while(phrase.indexOf("little") != -1) {
            count += 1;
            phrase = phrase.substring(phrase.indexOf("little") + 6);
        }
        System.out.println("\n" + count);


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        String actual = "";
          for(int i = 0; i < phrase.length(); i++) {
            if(phrase.indexOf("little") != i) {
                char temp = phrase.charAt(i);

            }
        }




        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"




    }
}
