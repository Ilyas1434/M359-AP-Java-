package Unit9.Lab;

import static java.lang.Math.round;

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

    /**
     * Creates string of Comedy class object attributes formatted as an addition to the Movie class toString() method
     * @return string using attributes of mainComedian, isSatire, and isRomCom, along with Movie Class toString()
     */
    public String toString() {
        System.out.println(super.toString());
        String str = "\nAdditionally, this is a COMEDY movie that features " + mainComedian + " as the main comedian.";
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

    /**
     * Recommends a Comedy object movie based off of the numFunnyJokes, numBadJokes, and funnyRating attributes
     * of the Comedy class, using numFunnyJokes and numBadJokes to calculate a funnyRating
     * @return a string suggesting to the user to watch this if they want to have a laugh if the movie has a
     * calculated funnyRating greater/equal to 65, and to watch if they like corny jokes if it is below 65
     */

    public String recommender() {
        funnyRating = (double)(numFunnyJokes)/(numFunnyJokes+numBadJokes) * 100;
        String str = "This movie has " + numFunnyJokes + " funny jokes and " + numBadJokes +
                " bad jokes coming to a funny rating of " + funnyRating;
        if(funnyRating >= 65) {
            str += "\nIf you are looking for a laugh, then this movie is for you";
        }
        else {
            str += "\nThis movie is great if you are looking for corny dad jokes";
        }
        return str;
    }
}
