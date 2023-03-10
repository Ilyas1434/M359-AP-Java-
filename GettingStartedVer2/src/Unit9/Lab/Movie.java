package Unit9.Lab;

public class Movie {
    private String title;
    private int hours;
    private int minutes;
    private double googleRating;
    private String ageRating;
    private boolean isAnimated;

    public Movie(String title, int hours, int minutes, double googleRating, String ageRating, boolean isAnimated) {
        this.title = title;
        this.hours = hours;
        this.minutes = minutes;
        this.googleRating = googleRating;
        this.ageRating = ageRating;
        this.isAnimated = isAnimated;
    }

    public String toString() {
        String str = "The name of this film is " + title + ", and is " + hours + ":" + minutes + " long\n";
        str += "It is rated " + googleRating + "/10 on Google, and it's age rating is " + ageRating;
        if(isAnimated) {
            str += "\nThis movie IS animated";
        }
        else{
            str += "\nThis movie is NOT animated";
        }
        return str;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getGoogleRating() {
        return googleRating;
    }

    public void setGoogleRating(double googleRating) {
        this.googleRating = googleRating;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public boolean isAnimated() {
        return isAnimated;
    }

    public void setAnimated(boolean animated) {
        isAnimated = animated;
    }
}
