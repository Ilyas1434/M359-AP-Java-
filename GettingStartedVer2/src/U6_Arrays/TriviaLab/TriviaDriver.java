package U6_Arrays.TriviaLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        TriviaGame game = new TriviaGame();
        beginGame();
        String name = input.nextLine();
        game.setPlayerName(name);
        System.out.println("Let's begin, " + game.getPlayerName());
        displayQuestion(game);

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
    public void checkAnswer(TriviaGame a) {
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        if(response.equals(a.getCurrentQuestion().getAnswer() == response) {
            System.out.println("You got it!");
        }
        else{
            System.out.println("Unfortunately, that's not it");
        }
    }

}
