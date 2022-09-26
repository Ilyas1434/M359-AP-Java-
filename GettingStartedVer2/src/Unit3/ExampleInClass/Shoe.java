package Unit3.ExampleInClass;

public class Shoe {
    private String brand;
    private String style;
    private double size;
    private double price;

    public Shoe(String brand, String style, double size, double price) {
        this.brand = brand;
        this.style = style;
        this.size = size;
        this.price = price;
    }
    public boolean equals(Shoe a) {
        if (this.getBrand().equals(a.getBrand()) && this.getStyle().equals(a.getStyle())) {
            return true;
        }
        else {
            return false;
        }
    }
    public int compareTo(Shoe b) {
        if(this.getPrice() > b.getPrice()) {
            return 1;
        }
        else if(this.getPrice() < b.getPrice()) {
            return -1;
        }
        else {
            return 0;
        }
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
