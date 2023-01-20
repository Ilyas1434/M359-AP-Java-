package Unit7.TicketmasterLab;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    private String menuThing = "1. Search by city\n2. Sort by performer (A-Z)\n" +
            "3. Sort by performer ";

    public static void main(String[] args) throws FileNotFoundException {
        displayBeginning();
        TicketMaster test = new TicketMaster();
        test.readInData();
        System.out.println(test);
    }
    public static void displayBeginning() {
        System.out.println("Welcome to the TicketMaster Kiosk ");
        System.out.println("You may search our shows by city as well as sort the shows by performer and ticket price");
        System.out.println("Simply select the correct option corresponding with your choice");
        System.out.println("\n\n\n");
    }
    public static void displayMenu() {

    }


}
