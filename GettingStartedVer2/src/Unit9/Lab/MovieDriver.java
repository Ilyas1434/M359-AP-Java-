package Unit9.Lab;

public class MovieDriver {
    public static void main(String[] args) {
        Movie generalMovie1 = new Movie("Back to the Future", 2, 50, 8.9,"PG-13",
                false);
        System.out.println(generalMovie1);
        Comedy comedyMovie = new Comedy("Jumanji", 2, 45, 7.6, "PG-13", false,
                "Kevin Hart", false, 24, 3,false);

    }
    // function where all movies are displayed to user, and user can select which one they want to see and view recs
}
