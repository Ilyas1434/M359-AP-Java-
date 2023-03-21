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

    /**
     * Formats a string based off of the attributes of the generic Movie superclass
     * @return A string of text containing information about the following atributes:
     * title, hours, minutes, ageRating, and isAnimated
     */
    public String toString() {
        String str = "The name of this film is " + title + ", and is " + hours + ":" + minutes + " long\n";
        str += "It's age rating is " + ageRating;
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

    // Recommender method: below or above 7 for google rating

    /**
     * Creates a string with suggestions to watch or not watch based off of the Movie class' attribute googleRating
     * @return a string recommending the movie to the user if googleRating is greater than/equal to 8.0,
     * a string cautiously recommending the user if it is above 6.0 and below 8.0, and a string warning the user
     * if it is below 6.0
     */
    public String recommender() {
        String str;
        if(googleRating >= 8.0) {
            str="This movie is a blockbuster with a very high audience rating, so chances are you'll like this film!";
        }
        else if((googleRating>= 6.0) && (googleRating<8.0)) {
            str="This movie has a mediocre audience rating, so you might not enjoy this film :(";
        }
        else {
            str="This movie is has a very low audience rating and is likely to be a flop, so we do not recommend this film.";
        }
        return str;
    }
}
