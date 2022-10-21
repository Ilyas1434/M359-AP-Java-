package Unit4.Lab;

import java.util.Scanner;

public class PigLatinTester {
    public static void main(String[] args) {
        output("The black cat ate a red apple");
        output("Writing college essays is driving me crazy");
        output("Everyone loves to code in Java");
    }
    public static void output(String str) {
        System.out.println("In English:");
        System.out.println("\t" + str);
        System.out.println("In Pig Latin:\t");
        System.out.println("\t" + PigLatin.toPigLatin(str));
        System.out.println();
    }

}
