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

    /**
     * Creates string based off of the Superhero class' attrbute heroSuperPower, with it being formatted
     * as an extension to the Action class' toString
     * @return A string containing more information about a Superhero movie
     */
    @Override
    public String toString() {
        System.out.println(super.toString());
        String ret = "\nAdditionally, this is a SUPERHERO movie,";
        ret += " with the main superpower of the hero being " + heroSuperPower;
        return ret;
    }

    /**
     * Creates recommendation for user to watch depending on the isMarvel and isDC attributes
     * @return A string recommending the user to watch the movie if isMarvel and the user likes Marvel,
     * and recommending the user to watch if isDC and the user likes DC
     */
    public String recommender() {
        String ret = "\nThis movie takes place in the ";
        if(isMarvel) {
            ret += "Marvel universe, so if you're a big fan of Iron Man, Spiderman, and the Hulk, you'll love this film!";
        }
        else if(isDC) {
            ret += "DC universe, so if you're a big fan of Batman, Wonder Woman, and Superman, you'll love this movie!";
        }
        return ret;
    }
}
