package Unit3.Chevy_Project;

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
    private final double LUX = 1.20;
    private final int FOURWD_PRICE_INCREASE = 3500;
    private final double SPORTS_BASE_INCREASE = 1.15;
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
        grandTotal = 1600;
        priceWithUpgrades = 1600;
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
        this.priceWithUpgrades = priceWithUpgrades;
        this.grandTotal = grandTotal;
    }
    

}
