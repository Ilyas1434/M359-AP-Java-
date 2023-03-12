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
    public String toString() {
        String str = "";
        str += super.toString();
        str += "\nThe main character of this ACTION movie is " + mainProtagonist + ", and the main antagonist of this action movie is ";
        str += mainAntagonist + ".\n";
        if(stuntsDoneByActor) {
            str += " Most stunts were done by the starring actor";
        }
        else {
            str += " Most stunts were not performed by the starring actor";
        }
        return str;
    }
    // Recommender method that checks the amount of fights, and returns a value saying "If you're into really action-heavy
    // scenes, you'll love this movie!" or
    // "If you're into more plot and drama and less fighting, this is the film for you!"


}
