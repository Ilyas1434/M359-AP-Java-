package Unit3.Chevy_Project;

public class ChevyDriver {
    public static void main(String[] args) {
        Chevy traxBase = new Chevy();
        traxBase.setMiles(15);
        Chevy traxLux = new Chevy();
        traxLux.setMiles(175);
        traxLux.setLuxuryPkg(true);
        traxLux.set4WDPkg(true);
        int comparison = traxLux.compareTo(traxBase);
        System.out.println("Classic Corvette vs. Sport Corvette");
        System.out.println("Which car has the least miles?");
        if(comparison == 1) {
            System.out.println("Sport Corvette has less miles than Classic Corvette");
        }
        else if(comparison == 0) {
            System.out.println("Sport corvette has the same miles as Classic Corvette");
        }
        else if(comparison == -1) {
            System.out.println(" Sport corvette has more miles than Classic Corvette");
        }
        System.out.println("Base Trax vs. Luxury Trax");
        boolean equality = traxBase.equals(traxLux);
        if(equality) {
            System.out.println("Status: Same Car");
        }
        else {
            System.out.println("Status: Different Car");
        }
        Chevy corvetteClassic = new Chevy(1963,123500, 13.5, 61500, "Corvette (Classic)",
                "Fire red", true, false, false);
        Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)", "Fire Red",
                true, false, true);
        Chevy moonTesla = new Chevy(2021, 2000, 0, 69420, "Not a Chevy",
                "Silver", true, true, true);
        System.out.println(corvetteClassic.toString());
        System.out.println(corvetteSport.toString());
        System.out.println(moonTesla.toString());
    }

}
