package Unit7.TicketmasterLab;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static final int CITYSEARCH= 1;
    public static final int PERFORMERATOZ = 2;
    public static final int PERFORMERZTOA = 3;
    public static final int PRICELOWHIGH = 4;
    public static final int PRICEHIGHLOW = 5;
    public static final int QUIT = 6;
    private static TicketMaster obj;

    public static void main(String[] args) throws FileNotFoundException {
        obj = new TicketMaster();
        obj.readInData();
        Scanner input = new Scanner(System.in);
        displayBeginning();
        getInput(input);


    }

    /**
     * Displays introductory message to user with instructions to how to use the kiosk
     */
    public static void displayBeginning() {
        System.out.println("\nWelcome to the TicketMaster Kiosk");
        System.out.println("You may search our shows by city as well as sort the shows by performer and ticket price");
        System.out.println("\nSimply select the correct option corresponding with your choice");
        System.out.println("\n");
    }

    /**
     * Displays the menu of choices the user has and the numbers that correspond with them
     */
    public static void displayMenu() {
        String menu = "\n1. Search by city\n2. Sort by performer (A-Z)\n" +
                "3. Sort by performer (Z-A)\n4. Sort by Price (low - high)\n"
                + "5. Sort by Price (high - low)" + "\n6. Quit\n";
        System.out.println(menu);
    }

    /**
     * Gets user input (1-6), and if invalid entry (such as different data type, out of bounds), error message
     * is displayed via try-catch block and selection statements. Depending on the input, it calls methods that
     * display the proper thing the user requested using selection statements
     * @param in
     */
    public static void getInput(Scanner in) {
        int ret = 0;
        boolean keepGoing = true;
        while(keepGoing){
            try {
                displayMenu();
                System.out.println("Enter an integer between 1 & 6");
                int num = in.nextInt();
                if(num >= CITYSEARCH && num <= PRICEHIGHLOW) {
                    if(num == CITYSEARCH) {
                        obj.citySearcher(in);
                    }
                    if(num == PERFORMERATOZ) {
                        obj.performerSortAZ();
                    }
                    if(num == PERFORMERZTOA) {
                        obj.performerSortZA();
                    }
                    if(num == PRICELOWHIGH) {
                        obj.priceSortLowHigh();
                    }
                    if(num == PRICEHIGHLOW) {
                        obj.priceSortHighLow();
                    }
                }
                else if(num == QUIT) {
                    System.out.println("Thank you for using our Kiosk");
                    System.out.println("Have a nice day!");
                    in.close();
                    keepGoing = false;
                }
                else {
                    System.out.println("Invalid entry, out of range (Must be between 1 & 6 inclusive)");
                }
            }
            catch (Exception e) {
                System.out.println("Try again, that was not an integer");
                in.nextLine(); // dummy read to clear out bad data
            }

        }
    }

    /**
     * Displays the beginning of the tabbed toString, indicating where the date, price qty, performer, and city lie
     */
    public static void beginningDisplay() {
        String ret = "";
        ret += "Date\t\tPrice\tQty\t" + " " + "Performer" + "                          " +"City";
        ret += "\n";
        ret += "----------------------------------------------------------------------";
        System.out.println(ret);
    }
}
