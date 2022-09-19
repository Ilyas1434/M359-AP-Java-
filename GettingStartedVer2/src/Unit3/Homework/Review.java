package Unit3.Homework;

public class Review {
    private String reviewer;
    private String business;
    private int rating;

    public Review(String reviewer, String business, int rating) {
        this.reviewer = reviewer;
        this.business = business;
        this.rating = rating;
    }

    public String toString() {
        String str = reviewer + ", " + business + ", " + rating;
        if(rating == 5) {
            str += "\n\t**Highly Recommended";
        }
        if(rating == 1) {
            str += "\n\t**Strongly Discouraged";
        }
        return str;
    }
}
