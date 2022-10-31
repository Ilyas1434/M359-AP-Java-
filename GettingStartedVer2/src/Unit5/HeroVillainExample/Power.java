package Unit5.HeroVillainExample;

public class Power {
    private String namePower;
    private int strengthPower;

    public Power(String namePower, int strengthPower) {
        this.namePower = namePower;
        this.strengthPower = strengthPower;
    }

    public String getNamePower() {
        return namePower;
    }

    public void setNamePower(String namePower) {
        this.namePower = namePower;
    }

    public int getStrengthPower() {
        return strengthPower;
    }

    public void setStrengthPower(int strengthPower) {
        if(strengthPower <= 0) {
            this.strengthPower = 0;
        }
        this.strengthPower = strengthPower;
    }
    public String toString() {
        return "Power is " + namePower + " with a strength of " + strengthPower;
    }
}
