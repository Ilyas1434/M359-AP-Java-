package U6_Arrays.TriviaLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    private static boolean keepPlaying = true;
    private boolean previousWas = true;
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame game = new TriviaGame();
        Scanner input = new Scanner(System.in);
        beginGame();
        String name = input.nextLine();
        game.setPlayerName(name);
        System.out.println("Let's begin, " + game.getPlayerName());
        while(keepPlaying = true) {
            if(game.isAllEqual()) {
                printFinalStats(game);
                System.exit(1);
            }
            displayQuestion(game);
            String response = input.nextLine();
            checkAnswer(game, response);
            printStats(game);
            System.out.println("Wanna continue? (y or n)");
            String res = input.nextLine();
            if (res.equalsIgnoreCase("y")) {
                keepPlaying = true;
            }
            else {
                printFinalStats(game);
                System.exit(1);
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
        boolean repeat = true;
        int repeatCount = 0;
        while(repeat) {
            a.setRandNum((int)(Math.random() * 12));
            if (!(qArray[a.getRandNum()] == null)) {
                System.out.println(qArray[a.getRandNum()]);
                repeat = false;
            }
        }
        a.setCurrentQuestion(qArray[a.getRandNum()]);
        System.out.println("Enter the letter of the answer");
    }
    public static void checkAnswer(TriviaGame a, String response) {
        if(response.equalsIgnoreCase(a.getCurrentQuestion().getAnswer())) {
            System.out.println("You got it! " + a.getCurrentQuestion().getExplanation());
            a.setCorrectAnswers(a.getCorrectAnswers() + 1);
            String temp = a.getCurrentQuestion().getPointAmount();
            int points = Integer.parseInt(temp);
            a.setTotalPoints(a.getTotalPoints() + points);
            a.setCorrectStreak(a.getCorrectStreak() + 1);
        }
        else{
            System.out.println("Unfortunately, that's not it. " + a.getCurrentQuestion().getExplanation());
            a.setIncorrectAnswers(a.getIncorrectAnswers() + 1);
            a.setCorrectStreak(0);
        }
        Question[] array = a.getQuestionArray();
        int rNum = a.getRandNum();
        array[rNum] = null;
        a.setQuestionArray(array);

    }
    public static void printStats(TriviaGame a) {
        System.out.println("Total points: " + a.getTotalPoints());
        System.out.println("Amount correct: " + a.getCorrectAnswers());
        System.out.println("Amount wrong: " + a.getIncorrectAnswers());
        System.out.println("Current Streak: " + a.getCorrectStreak());
    }
    public static void printFinalStats(TriviaGame a) {
        System.out.println("Total points: " + a.getTotalPoints());
        System.out.println("Amount correct: " + a.getCorrectAnswers());
        System.out.println("Amount incorrect: " + a.getIncorrectAnswers());
        double percent = 1.0 * a.getCorrectAnswers() / (a.getCorrectAnswers() + a.getIncorrectAnswers());
        System.out.println("Percentage answered correctly: " + percent*100 + "%");
    }



}
