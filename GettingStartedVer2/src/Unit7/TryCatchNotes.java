package Unit7;

import java.util.Scanner;

public class TryCatchNotes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int userChoice = getDesiredInt(in, Integer.MIN_VALUE, 12);

    }
    public static int getDesiredInt(Scanner in, int min, int max) {
        int ret = 0;
        boolean keepGoing = true;
        while(keepGoing){
            try {
                System.out.println("Enter an int to represent your year in school [9, 12]");
                int num = in.nextInt();
                if(num >= min && num <= max) {
                    System.out.println("You entered " + num);
                    ret = num;
                    keepGoing = false;
                }
                else {
                    System.out.println("Number out of range");
                }
            }
            catch (Exception e) {
                System.out.println("Try again, that was not an int");
                in.nextLine(); // dummy read to clear out bad data
            }

        }
        return ret;
    }
}

