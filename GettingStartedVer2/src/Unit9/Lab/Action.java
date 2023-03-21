package Unit9.Lab;

public class Action extends Movie {
    private String mainProtagonist;
    private String mainAntagonist;
    private int numFights;
    private boolean stuntsDoneByActor;


    public String getMainProtagonist() {
        return mainProtagonist;
    }

    public void setMainProtagonist(String mainProtagonist) {
        this.mainProtagonist = mainProtagonist;
    }

    public String getMainAntagonist() {
        return mainAntagonist;
    }

    public void setMainAntagonist(String mainAntagonist) {
        this.mainAntagonist = mainAntagonist;
    }

    public int getNumFights() {
        return numFights;
    }

    public void setNumFights(int numFights) {
        this.numFights = numFights;
    }

    public boolean isStuntsDoneByActor() {
        return stuntsDoneByActor;
    }

    public void setStuntsDoneByActor(boolean stuntsDoneByActor) {
        this.stuntsDoneByActor = stuntsDoneByActor;
    }

    public Action(String title, int hours, int minutes, double googleRating, String ageRating, boolean isAnimated,
                  String mainProtagonist, String mainAntagonist, int numFights, boolean stuntsDoneByActor) {
        super(title, hours, minutes, googleRating, ageRating, isAnimated);
        this.mainProtagonist = mainProtagonist;
        this.mainAntagonist = mainAntagonist;
        this.numFights = numFights;
        this.stuntsDoneByActor = stuntsDoneByActor;
    }

    /**
     * Creates a string of the attributes of an Action movie, formatted as an addition to the Movie class' toString
     * but with more attributes specific to the Action class
     * @return a string of attributes specific to the Action class, including mainProtagonist, mainAntagonist,
     * and stuntsDoneByActor
     */
    public String toString() {
        String str = "";
        str += super.toString();
        str += "\nThe main character of this ACTION movie is " + mainProtagonist + ", and the main antagonist of " +
                "this action movie is ";
        str += mainAntagonist + ".\n";
        if(stuntsDoneByActor) {
            str += " Most stunts were done by the starring actor";
        }
        else {
            str += " Most stunts were not performed by the starring actor";
        }
        return str;
    }

    /**
     * Creates a recommendation of a specific action movie based off of its numFights attribute
     * @return Recommendation string that suggests to watch if has > 6 fights and user likes action-heavy scenes
     * & cinematics, and if < 6 suggests to watch if user likes more plot and drama in their movies
     */
    public String recommender() {
        String ret = "";
        if(numFights > 6) {
            ret += "If you're really into action-heavy scenes and flashy cinematics, you'll love this movie!";
        }
        else {
            ret += "If you're into more plot and drama and less fighting, this is the film for you!";
        }
        return ret;
    }

}
