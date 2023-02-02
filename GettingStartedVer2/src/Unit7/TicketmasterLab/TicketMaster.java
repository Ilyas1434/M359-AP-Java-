package Unit7.TicketmasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> showList;
    public TicketMaster() {
        this.showList = new ArrayList<>();
    }

    /**
     * Aggregates all data in obj.getShowList() to format in a nice, clean, column manner
     * @return String of arrayList data sorted in nice format, tabbed properly
     */
    public String toString() {
        String ret = "";
        ret += "Date\t\tPrice\tQty\t" + " " + "Performer" + "                          " +"City";
            ret += "\n";
        ret += "----------------------------------------------------------------------";
        ret += "\n";
        for(int i = 0; i < showList.size(); i++) {
            ret += showList.get(i).toString();
            ret += "\n";
        }
        return ret;
    }

    /**
     * Reads in all data in showData.text and stores each show's attributes in separate Show objects
     * Then, it stores each Show obj in showList
     */
    public void readInData()  {
        Scanner inFile = null;
        try {
             inFile = new Scanner(new File("showData.txt"));
           //inFile = new Scanner(new File("C:\\Users\\ilyas1434\\Documents\\GitHub\\M359-AP-Java-\\GettingStartedVer2\\showData.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("Error Reading file");
        }
        while(inFile != null && inFile.hasNextLine()) {
            String date = inFile.next();
            double price = inFile.nextDouble();
            int quantity = inFile.nextInt();
            String artist = inFile.nextLine();
            String[] splitUp = artist.split(",");
            artist = splitUp[0];
            String city = splitUp[1];
            Show concert = new Show(date, price, quantity, artist, city);
            showList.add(concert);
        }
        inFile.close();
    }

    /**
     * Asks for user input to search through ShowList with Shows in the desired city using linear search
     * For each Show object found with the desired city, the Show is printed and if not, a message is displayed
     * @param s represents the scanner object passed in through the TicketMasterDriver class to collect user input
     */
    public void citySearcher(Scanner s) {
            boolean keepGoing = true;
            while(keepGoing) {
                try {
                    int count = 0;
                    System.out.println("Enter the name of your city");
                    s.nextLine();
                    String cityName = s.nextLine();
                    for(int i = 0; i < getShowList().size(); i++) {
                        String hello = getShowList().get(i).getCity().trim();
                        if(hello.equalsIgnoreCase(cityName)) {
                            if(count == 0) {
                                beginningDisplay();
                            }
                            System.out.println(getShowList().get(i));
                            count++;
                        }
                }
                    if(count == 0) {
                        System.out.println("Sorry, there are no shows in your city of choice");
                    }
                    keepGoing = false;
                }
                catch (InputMismatchException e) {
                    System.out.println("Please try again, that was not a String");
                    s.nextLine(); // dummy read to clear out bad data
                }
            }
    }

    /**
     * Sorts showList in alphabetical order using selection sort and prints each Show object
     */
    public void performerSortAZ() {
        ArrayList<Show> newShows = new ArrayList<>();
        newShows = showList;
        for(int i = 0; i < newShows.size() - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < newShows.size(); j++) {
                String current = newShows.get(j).getPerformer();
                String minimum = newShows.get(minIndex).getPerformer();
                if(current.compareTo(minimum) < 0) {
                    minIndex = j;
                }
            }
            Show temp = newShows.get(minIndex);
            newShows.set(minIndex, newShows.get(i));
            newShows.set(i, temp);
        }
        beginningDisplay();
        for(int i = 0; i < newShows.size(); i++) {
            System.out.println(newShows.get(i));
            System.out.println();
        }
    }
    /**
     * Sorts showList in reverse alphabetical order using selection sort and prints each Show object
     */
    public void performerSortZA() {
        ArrayList<Show> newShows = new ArrayList<>();
        newShows = showList;
        for(int i = 0; i < newShows.size() - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < newShows.size(); j++) {
                String current = newShows.get(j).getPerformer();
                String minimum = newShows.get(minIndex).getPerformer();
                if(current.compareTo(minimum) > 0) {
                    minIndex = j;
                }
            }
            Show temp = newShows.get(minIndex);
            newShows.set(minIndex, newShows.get(i));
            newShows.set(i, temp);
        }
        beginningDisplay();
        for(int i = 0; i < newShows.size(); i++) {
            System.out.println(newShows.get(i));
            System.out.println();
        }
    }

    /**
     * Sorts showList by the price attribute of each Show from low-high, and then prints each Show from left-right
     */
    public void priceSortLowHigh() {
        ArrayList<Show> newShows = getShowList();

        for(int i = 1; i < newShows.size(); i++) {
            Show valueToInsert = newShows.get(i);
            int position = i;
            while(position > 0 && newShows.get(position -1 ).getPrice() > valueToInsert.getPrice()) {
                // shift the value to the right
                newShows.set(position, newShows.get(position - 1));
                position--; // move to the next value to check
            }
            newShows.set(position, valueToInsert);
        }
        beginningDisplay();
        for(int i = 0; i < newShows.size(); i++) {
            System.out.println(newShows.get(i));
            System.out.println();
        }
    }
    /**
     * Sorts showList by the price attribute of each Show from high-low, and then prints each Show from left-right
     */

    public void priceSortHighLow() {
        ArrayList<Show> newShows = getShowList();

        for(int i = 1; i < newShows.size(); i++) {
            Show valueToInsert = newShows.get(i);
            int position = i;
            while(position > 0 && newShows.get(position -1 ).getPrice() < valueToInsert.getPrice()) {
                // shift the value to the right
                newShows.set(position, newShows.get(position - 1));
                position--; // move to the next value to check
            }
            newShows.set(position, valueToInsert);
        }
        beginningDisplay();
        for(int i = 0; i < newShows.size(); i++) {
            System.out.println(newShows.get(i));
            System.out.println();
        }
    }

    public ArrayList<Show> getShowList() {
        return showList;
    }

    public void setShowList(ArrayList<Show> showList) {
        this.showList = showList;
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
