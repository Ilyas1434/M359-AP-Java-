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
    public void readInData() throws FileNotFoundException {
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
    }
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
    public void performerSortAZ(Scanner s) {
        ArrayList<Show> newShows = new ArrayList<>();
        newShows = showList;
        for(int i = 0; i < newShows.size() - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; i < newShows.size() -1; i++) {
                if(newShows.get(j).getPerformer().compareTo(newShows.get(minIndex).getPerformer()) < 0) {
                    minIndex = j;
                }
                System.out.println(minIndex);
                Show temp = newShows.get(minIndex);
                newShows.set(minIndex, newShows.get(i));
                newShows.set(i, temp);
            }
        }
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
    public static void beginningDisplay() {
        String ret = "";
        ret += "Date\t\tPrice\tQty\t" + " " + "Performer" + "                          " +"City";
        ret += "\n";
        ret += "----------------------------------------------------------------------";
        System.out.println(ret);
    }
}
