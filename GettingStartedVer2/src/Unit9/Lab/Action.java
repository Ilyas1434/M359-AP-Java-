package Unit9.Lab;

public class Action extends Movie {
    private String mainProtagonist;
    private String mainAntagonist;
    private int numFights;
    private boolean stuntsDoneByActor;

    public Action(String title, int hours, int minutes, double googleRating, String ageRating) {
        super(title, hours, minutes, googleRating, ageRating);
        this.mainProtagonist = mainProtagonist;
        this.mainAntagonist = mainAntagonist;
        this.numFights = numFights;
        this.stuntsDoneByActor = stuntsDoneByActor;
    }
}
