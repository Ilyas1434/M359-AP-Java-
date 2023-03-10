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
        str += "\nThe main character of this action movie is " + mainProtagonist + ", and the main antagonist of this action movie is ";
        str += mainAntagonist + ".\n";
        str += "This action movie has " + numFights + " fights/action scenes, and ";
        if(stuntsDoneByActor) {
            str += " most stunts were done by the starring actor";
        }
        else {
            str += " most stunts were not performed by the starring actor";
        }
        return str;
    }
    // Something that checks the amount of fights, and returns a value saying "wow, that's a lot of fights!" or
    // this is a calmer action movie


}
