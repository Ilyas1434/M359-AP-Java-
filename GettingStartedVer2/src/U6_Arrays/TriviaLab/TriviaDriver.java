package U6_Arrays.TriviaLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        boolean keepPlaying = true;
        while(keepPlaying = true) {
            Scanner input = new Scanner(System.in);
            TriviaGame game = new TriviaGame();
            beginGame();
            String name = input.nextLine();
            game.setPlayerName(name);
            System.out.println("Let's begin, " + game.getPlayerName());
            displayQuestion(game);
            String response = input.nextLine();
            checkAnswer(game, response);
            printStats(game);
            System.out.println("Wanna continue? (y or n)");
            String res = input.nextLine();
            if (!res.equals("y")) {
                keepPlaying = false;
            }
        }

    }
    public static void beginGame() {
        System.out.println("Welcome/Bienvenidos/Bienvenue to ULTIMATE WORLD LANGUAGE TRIVIA!");
        System.out.println("For each question answered correctly, you will recieve points ranging from 100-500");
        System.out.println("To begin, what is your name?");

    }
    public static void displayQuestion(TriviaGame a) {
        Question[] qArray = a.getQuestionArray();
        int randNum = (int) (Math.random() * 11) + 1;
        if(!(qArray[randNum] == null)) {
            System.out.println(qArray[randNum]);
        }
        a.setCurrentQuestion(qArray[randNum]);
        System.out.println("Enter the letter of the answer");
    }
    public static void checkAnswer(TriviaGame a, String response) {
        if(response.equals(a.getCurrentQuestion().getAnswer())) {
            System.out.println("You got it! " + a.getCurrentQuestion().getExplanation());
            a.setCorrectAnswers(a.getCorrectAnswers() + 1);
        }
        else{
            System.out.println("Unfortunately, that's not it. " + a.getCurrentQuestion().getExplanation());
            a.setIncorrectAnswers(a.getIncorrectAnswers() + 1);
        }
        a.setCurrentQuestion(null);
    }
    public static void printStats(TriviaGame a) {
        System.out.println("Total points: " + a.getTotalPoints());
        System.out.println("Amount correct: " + a.getCorrectAnswers());
        System.out.println("Amount wrong: " + a.getIncorrectAnswers());
        System.out.println("Current Streak: " + a.getCorrectStreak());
    }
}
