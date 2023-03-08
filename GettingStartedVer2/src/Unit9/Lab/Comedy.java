package Unit9.Lab;

public class Comedy extends Movie {
    private String mainComedian;
    private boolean isSatire;
    private int numFunnyJokes;
    private int numBadJokes;
    private double funnyRating;
    private boolean isRomCom;
    public Comedy(String title, int hours, int minutes, double googleRating, String ageRating, String mainComedian, boolean isSatire, int numFunnyJokes,
                  int numBadJokes, double funnyRating, boolean isRomCom) {
        super(title, hours, minutes, googleRating, ageRating);
        this.mainComedian = mainComedian;
        this.isSatire = isSatire;
        this.numFunnyJokes = numFunnyJokes;
        this.numBadJokes = numBadJokes;
        this.funnyRating = funnyRating;
        this.isRomCom = isRomCom;
    }
}
