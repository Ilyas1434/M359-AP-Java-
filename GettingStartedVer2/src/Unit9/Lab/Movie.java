package Unit9.Lab;

public class Movie {
    private String title;
    private int hours;
    private int minutes;
    private double googleRating;
    private String ageRating;

    private boolean isAnimated;

    public Movie(String title, int hours, int minutes, double googleRating, String ageRating) {
        this.title = title;
        this.hours = hours;
        this.minutes = minutes;
        this.googleRating = googleRating;
        this.ageRating = ageRating;
    }
}
