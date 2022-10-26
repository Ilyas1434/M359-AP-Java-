package Unit5.HeroVillainExample;

public class SuperHero {
    private String nameHero;
    private Power superPower;

    public SuperHero(String nameHero, Power superPower) {
        this.nameHero = nameHero;
        this.superPower = superPower; // Sets the power reference = to the reference passed in
    }

    public String getNameHero() {
        return nameHero;
    }

    public void setNameHero(String nameHero) {
        this.nameHero = nameHero;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public String toString () {
        String str = "SuperHero name: " + nameHero + "\n";
        str += superPower.toString();
        return str;
    }
    public SuperHero(String nameHero, String power, int strength) {
        this.nameHero = nameHero;
        this.superPower = new Power(power, strength); // Creates a new power obect with the two parameters
    }
}
