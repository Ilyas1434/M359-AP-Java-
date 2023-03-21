package Unit9.Lab;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDriver {
    private static Movie[] movieList = new Movie[7];
    public static void main(String[] args) {
        //Movie generalMovie1 = new Movie("Back to the Future", 2, 50, 8.9,"PG-13",
           //     false);
        //System.out.println(generalMovie1);
        //Movie comedyMovie = new Comedy("Jumanji", 2, 45, 7.6, "PG-13", false,
              //  "Kevin Hart", false, 24, 3,false);

       movieList[0] = new Movie("Rocky", 1, 59, 8.1, "PG", false);
       movieList[1] = new Action("Uncharted", 1, 56, 6.3, "PG-13", false, "Nathan Drake", "Atoq Navarro", 15, true);
       movieList[2] = new Action("The Hunger Games", 2, 22, 7.2, "PG-13", false, "Katniss Everdeen", "Coriolanus Snow", 24, true);
       movieList[3] = new Comedy("Central Intelligence", 1, 54, 6.3, "PG-13", false, "Kevin Hart", true, 57, 17, false);
       movieList[4] = new Comedy("Frozen", 1, 48, 7.4, "PG", true, "Olaf", false, 29, 8, true);
       movieList[5] = new Superhero("Avengers: Infinity War", 2, 29, 8.4, "PG-13", false, "Iron Man", "Thanos", 12, false, true, false, "Nano tech");
       movieList[6] = new Superhero("The Batman", 2, 56, 7.8, "PG-13", false, "Batman", "The Riddler", 16, true, false, true, "Money");
        Scanner input = new Scanner(System.in);
        displayMovies();
        while(true) {
            System.out.println("\n\n\nEnter the number corresponding to a movie above to view more options:");
            int userInput = getInput(input);
            printRecommendation(userInput);
        }
    }
    // function where all movies are displayed to user, and user can select which one they want to see and view recs

    /**
     * Displays the movies
     * @return
     */
    public static void displayMovies() {
        for(int i = 0; i < movieList.length; i++) {
            System.out.println("\033[0;1m" + "Option " + (i+1) + ":" +"\033[0;0m" );
            System.out.println(movieList[i] + "\n");
        }
    }

    /**
     * gets input (1-7),
     * @return
     */
    public static int getInput(Scanner input) {
        while(true) {
            try {
                int num = input.nextInt();
                if(num > 7 || num < 1) {
                    System.out.println("Please enter an integer between 1 and 7 please (inclusive)");
                }
                else {
                    return num;
                }
            }
            catch (Exception x) {
                System.out.println("Please try again, that was not an integer");
                input.nextLine();
            }
        }
    }
    public static void printRecommendation(int input) {
        Movie selected = movieList[input - 1];
        String str = selected.recommender();
        System.out.println(str);

    }




}
