package Unit9.Lab;

public class Comedy extends Movie {
    private String mainComedian;
    private boolean isSatire;
    private int numFunnyJokes;
    private int numBadJokes;
    private double funnyRating;
    private boolean isRomCom;

    public Comedy(String title, int hours, int minutes, double googleRating, String ageRating, boolean isAnimated,
                  String mainComedian, boolean isSatire, int numFunnyJokes, int numBadJokes,  boolean isRomCom) {
        super(title, hours, minutes, googleRating, ageRating, isAnimated);
        this.mainComedian = mainComedian;
        this.isSatire = isSatire;
        this.numFunnyJokes = numFunnyJokes;
        this.numBadJokes = numBadJokes;
        this.isRomCom = isRomCom;
    }

    public String toString() {
        super.toString();
        String str = "\nThis is a COMEDY movie that features " + mainComedian + " as the main comedian.";
        if(isSatire) {
            str += " This movie is satirical.";
        }
        if(isRomCom) {
            str += "\nThis film also features romance";
        }
        else {
            str += "\nThis film is non-romantic";
        }
        return str;
    }


    public String getMainComedian() {
        return mainComedian;
    }

    public void setMainComedian(String mainComedian) {
        this.mainComedian = mainComedian;
    }

    public boolean isSatire() {
        return isSatire;
    }

    public void setSatire(boolean satire) {
        isSatire = satire;
    }

    public int getNumFunnyJokes() {
        return numFunnyJokes;
    }

    public void setNumFunnyJokes(int numFunnyJokes) {
        this.numFunnyJokes = numFunnyJokes;
    }

    public int getNumBadJokes() {
        return numBadJokes;
    }

    public void setNumBadJokes(int numBadJokes) {
        this.numBadJokes = numBadJokes;
    }

    public boolean isRomCom() {
        return isRomCom;
    }

    public void setRomCom(boolean romCom) {
        isRomCom = romCom;
    }
    //  Recommender Method that calculates funny rating and suggests to watch this movie when you are sad and want to laugh
}
