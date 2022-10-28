package Unit5.HeroVillainExample;

public class Villain {

    private String nameVillain;
    private Power villainPower;

    public Villain(String nameVillain, Power superPower) {
        this.nameVillain = nameVillain;
        this.villainPower = superPower;
    }
    public String toString () {
        String str = "SuperHero name: " + nameVillain + "\n";
        str += villainPower.toString();
        return str;
    }
    public Villain(String nameVillain, String power, int strength) {
        this.nameVillain = nameVillain;
        this.villainPower = new Power(power, strength); // Creates a new power obect with the two parameters
    }

    public String getNameVillain() {
        return nameVillain;
    }

    public void setNameVillain(String nameVillain) {
        this.nameVillain = nameVillain;
    }

    public Power getVillainPower() {
        return villainPower;
    }

    public void setSuperPower(Power villainPower) {
        this.villainPower = villainPower;
    }
}
