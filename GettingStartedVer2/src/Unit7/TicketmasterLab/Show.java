package Unit7.TicketmasterLab;

public class Show {
    String date;
    double price;
    int qty;
    String performer;
    String city;

    public Show(String date, double price, int qty, String performer, String city) {
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.performer = performer;
        this.city = city;
    }

    /**
     * Formats one line of a show's details, to be used in Ticketmaster class
     * @return line of show details
     */
    public String toString() {
        String ret = "";
        ret += date + "\t$" + price + "\t" + qty + "\t" + performer + "\t" + city;
        return ret;
    }
}
