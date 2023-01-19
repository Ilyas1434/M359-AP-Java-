package Unit7.TicketmasterLab;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster test = new TicketMaster();
        test.readInData();
        System.out.println(test);
    }

}
