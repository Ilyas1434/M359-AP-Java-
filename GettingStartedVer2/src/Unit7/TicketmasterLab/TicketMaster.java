package Unit7.TicketmasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> showList;
    public TicketMaster() {
        this.showList = new ArrayList<>();
    }
    public String toString() {
        String ret = "";
        ret += "Date\tPrice\tQty\tPerformer\t\tCity";
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
            inFile = new Scanner(new File("C:\\Users\\Ilyas\\GitHub\\M359-AP-Java-\\GettingStartedVer2\\showData.txt"));
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
}
