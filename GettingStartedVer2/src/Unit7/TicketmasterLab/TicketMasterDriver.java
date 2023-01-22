package Unit7.TicketmasterLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        displayBeginning();
        displayMenu();
        int inputtedInfo = getInput(input);
    }
    public static void displayBeginning() {
        System.out.println("\nWelcome to the TicketMaster Kiosk");
        System.out.println("You may search our shows by city as well as sort the shows by performer and ticket price");
        System.out.println("Simply select the correct option corresponding with your choice");
        System.out.println("\n");
    }
    public static void displayMenu() {
        String menu = "1. Search by city\n2. Sort by performer (A-Z)\n" +
                "3. Sort by performer (Z-A)\n4. Sort by Price (low - high)\n"
                + "5. Sort by Price (high - low)" + "6. Quit";
        System.out.println(menu);
    }
    public static int getInput(Scanner in) {
        int ret = 0;
        boolean keepGoing = true;
        while(keepGoing){
            try {
                System.out.println("Enter an integer between 1 & 6");
                int num = in.nextInt();
                if(num >= 1 && num <= 5) {
                    System.out.println("You entered " + num);
                    ret = num;
                }
                else if(num == 6) {
                    System.out.println("Thank you for using our Kiosk");
                    System.out.println("Have a nice day!");
                    in.close();
                    keepGoing = false;
                }
                else {
                    System.out.println("Invalid entry, out of range");
                }
            }
            catch (Exception e) {
                System.out.println("Try again, that was not an integer");
                in.nextLine(); // dummy read to clear out bad data
            }

        }
        return ret;
    }
}
