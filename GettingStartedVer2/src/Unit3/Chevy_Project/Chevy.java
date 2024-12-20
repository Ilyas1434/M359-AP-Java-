package Unit3.Chevy_Project;


// Sameer Ilyas, Per 8, Mrs. Denna
// Create folder, put pdf, .java, .java, and click send to zipped folder, and then submit zipped folder
public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double basePrice;
    private String model;
    private String color;
    private boolean luxuryPackageStatus;
    private boolean fourWDPackageStatus;
    private boolean sportsPackageStatus;
    private final String MAKE = "Chevrolet";
    private final double TAX_RATE = .122;
    private final double LUX = 0.20;
    private final int FOURWD_PRICE_INCREASE = 3500;
    private final double SPORTS_BASE_INCREASE = 0.15;
    private final double SPORTS_FUEL_DECREASE = .80;
    private double priceWithUpgrades;
    private double grandTotal;


    public Chevy() {
        color = "White";
        year = 2021;
        model = "Trax";
        mileage = 0;
        basePrice = 16000;
        fuelEfficiency = 35.0;
        grandTotal = 16000;
        priceWithUpgrades = 16000;
        luxuryPackageStatus = false;
        fourWDPackageStatus = false;
        sportsPackageStatus = false;
    }

    public Chevy(int year, int mileage, double fuelEfficiency, double basePrice, String model, String color, boolean luxuryPackageStatus, boolean fourWDPackageStatus, boolean sportsPackageStatus) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.model = model;
        this.color = color;
        this.luxuryPackageStatus = luxuryPackageStatus;
        this.fourWDPackageStatus = fourWDPackageStatus;
        this.sportsPackageStatus = sportsPackageStatus;
    }

    public double getPriceWithUpgrades() {
        calcPrice();
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(double priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public double getGrandTotal() {
        calcPrice();
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return mileage;
    }

    public void setMiles(int mileage) {
        this.mileage = mileage;
    }

    public double getMpg() {
        return fuelEfficiency;
    }

    public void setMpg(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getLuxuryPkg() {
        return luxuryPackageStatus;
    }

    public void setLuxuryPkg(boolean luxuryPackageStatus) {
        this.luxuryPackageStatus = luxuryPackageStatus;
    }

    public boolean get4WDPkg() {
        return fourWDPackageStatus;
    }

    public void set4WDPkg(boolean fourWDPackageStatus) {
        this.fourWDPackageStatus = fourWDPackageStatus;
    }

    public boolean getSportsPkg() {
        return sportsPackageStatus;
    }

    public void setHasSportsPkg(boolean sportsPackageStatus) {
        this.sportsPackageStatus = sportsPackageStatus;
    }
    public String getMake() {
        return MAKE;
    }
    public int compareTo(Chevy other) {
        if(this.getMiles()>other.getMiles()) {
            return 1;
        }
        if(this.getMiles()<other.getMiles()) {
            return -1;
        }
        return 0;
    }
    public boolean equals(Chevy a) {
        boolean thisNew = false;
        boolean aNew = false;
        if(this.getMiles() < 200) {
            thisNew = true;
        }
        if(a.getMiles() < 200) {
            aNew = true;
        }
        if((this.getModel().equals(a.getModel())) && this.getColor().equals(a.getColor())) {
            if(aNew && thisNew) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        calcPrice();
        String lx = "Luxury Package";
        String four = "4WD Package";
        String sport = "Sports Package";
        String str = "**************************************************";
        str += "\n" + year + " " + MAKE + " " + model + " (" + color + ")";
        str += "\n" + "    BASE PRICE:\t\t\t$" +  basePrice;
        str += "\n" + "    MILES:\t\t\t\t" + mileage;
        str += "\n" + "    FUEL EFFICIENCY:\t" + fuelEfficiency + " mpg";
        str += "\n" + "    PACKAGES:";
        // if no packages, print none
        if(luxuryPackageStatus == false && fourWDPackageStatus == false && sportsPackageStatus == false) {
            str += "\n" + "        - None";
        }
        if(luxuryPackageStatus) {
            str += "\n" + "        - " + lx;
        }
        if(fourWDPackageStatus) {
            str += "\n" + "        - " + four;
        }
        if(sportsPackageStatus) {
            str += "\n" + "        - " + sport;
        }
        str += "\n\n";
        str += "    PRICE WITH UPGRADES:\t$" + priceWithUpgrades;
        str += "\n    FINAL PRICE WITH TAX:\t$" + grandTotal;
        str += "\n" + "**************************************************";
        return str;
    }
    public void calcPrice() {
        priceWithUpgrades += basePrice;
        if(fourWDPackageStatus) {
            priceWithUpgrades += FOURWD_PRICE_INCREASE;
        }
        if(luxuryPackageStatus) {
            priceWithUpgrades += basePrice * LUX;
        }
        if(sportsPackageStatus) {
            priceWithUpgrades += basePrice * SPORTS_BASE_INCREASE;
            fuelEfficiency = fuelEfficiency*SPORTS_FUEL_DECREASE;
        }
        grandTotal = priceWithUpgrades * TAX_RATE;
        grandTotal = priceWithUpgrades + grandTotal;
    }




}
