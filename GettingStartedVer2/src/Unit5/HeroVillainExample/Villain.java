package Unit5.HeroVillainExample;

public class Villain {
    private String nameVillain;
    private Power superPower;

    public Villain(String nameVillain, Power superPower) {
        this.nameVillain = nameVillain;
        this.superPower = superPower;
    }

    public String getNameVillain() {
        return nameVillain;
    }

    public void setNameVillain(String nameVillain) {
        this.nameVillain = nameVillain;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
