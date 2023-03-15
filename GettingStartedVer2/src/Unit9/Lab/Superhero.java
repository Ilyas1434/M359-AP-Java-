package Unit9.Lab;

public class Superhero extends Action {
    private boolean isMarvel;
    private boolean isDC;
    private String heroSuperPower;

    public Superhero(String title, int hours, int minutes, double googleRating, String ageRating, boolean isAnimated, String mainProtagonist,
                     String mainAntagonist, int numFights, boolean stuntsDoneByActor, boolean isMarvel, boolean isDC, String heroSuperPower) {
        super(title, hours, minutes, googleRating, ageRating, isAnimated, mainProtagonist, mainAntagonist, numFights, stuntsDoneByActor);
        this.isMarvel = isMarvel;
        this.isDC = isDC;
        this.heroSuperPower = heroSuperPower;
    }

    public boolean isMarvel() {
        return isMarvel;
    }

    public void setMarvel(boolean marvel) {
        isMarvel = marvel;
    }

    public boolean isDC() {
        return isDC;
    }

    public void setDC(boolean DC) {
        isDC = DC;
    }

    public String getHeroSuperPower() {
        return heroSuperPower;
    }

    public void setHeroSuperPower(String heroSuperPower) {
        this.heroSuperPower = heroSuperPower;
    }

    // call recommender method of Action superclass, then add additionally add isMarvel dependent statement like
    // "do you like Iron Man, Spiderman, and the Hulk! Then, you'll enjoy this movie since it takes place in
    // the same universe!" and something similar for DC

    @Override
    public String toString() {
        super.toString();
        String ret = "Additionally, this is a SUPERHERO movie,";
        ret += " with the main superpower of the hero " + heroSuperPower;
        return ret;
    }

    public String recommender() {
        String ret = "\nAdditionally, this movie takes place in the ";
        if(isMarvel) {
            ret += "Marvel universe, so if you're a big fan of Iron Man, Spiderman, and the Hulk, you'll love this film!";
        }
        else if(isDC) {
            ret += "DC universe, so if you're a big fan of Batman, Wonder Woman, and Superman, you'll love this movie!";
        }
        return ret;
    }
}
