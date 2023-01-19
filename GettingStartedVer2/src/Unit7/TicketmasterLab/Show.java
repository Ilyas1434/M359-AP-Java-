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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Formats one line of a show's details, to be used in Ticketmaster class
     * @return line of show details
     */
    public String toString() {
        String ret = "";
        ret += date + "\t$" + price + "\t" + qty + "\t" + performer;
        for (int i = performer.length(); i < 35; i++) {
            ret += " ";
        }
        ret += city;
        return ret;
    }
}
