package Unit3.Chevy_Project;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double basePrice;
    private double priceWithUpgrades;
    private double grandTotal;
    private String model;
    private String color;
    private boolean luxuryPackageStatus;
    private boolean fourWDPackageStatus;
    private boolean sportsPackageStatus;
    private final String MAKE = "Chevrolet";
    private final double TAX_RATE = .122;
    private final double LUX = .20;
    private final int FOUR_WD = 3500;
    private final double BASE_INCREASE = 1.15;
    private final double FUEL_DECREASE = .80;

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


    }

}
