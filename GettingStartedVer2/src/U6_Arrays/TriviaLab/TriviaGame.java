package U6_Arrays.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] questionArray = new Question[12];
    private Question currentQuestion;
    private int totalPoints;
    private int correctAnswers;
    private int correctStreak;
    private int incorrectAnswers;
    private String playerName;

    public Question[] getQuestionArray() {
        return questionArray;
    }

    public void setQuestionArray(Question[] questionArray) {
        this.questionArray = questionArray;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int getCorrectStreak() {
        return correctStreak;
    }

    public void setCorrectStreak(int correctStreak) {
        this.correctStreak = correctStreak;
    }

    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(int incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }

    public TriviaGame() throws FileNotFoundException {
        createArray();
        totalPoints = 0;
        correctAnswers = 0;
        correctStreak = 0;
        incorrectAnswers = 0;
    }
    public void createArray() throws FileNotFoundException {
        File text = new File("C:\\Users\\ACH Lighting\\Desktop\\Sameer's stuff\\M359-AP-Java-\\GettingStartedVer2\\Questions.txt");
        Scanner inF = new Scanner(text);
        for (int i = 0; i < 12; i++) {
            String question = inF.nextLine();
            String choiceA = inF.nextLine();
            String choiceB = inF.nextLine();
            String choiceC = inF.nextLine();
            String choiceD = inF.nextLine();
            String answer = inF.nextLine();
            String explanation = inF.nextLine();
            String pointValue = inF.nextLine();
            Question q = new Question(question, choiceA, choiceB, choiceC, choiceD, answer, explanation, pointValue);
            questionArray[i] = q;
        }
    }
    public void startGame() {
        System.out.println("Welcome/Bienvenidos/Bienvenue to ULTIMATE WORLD LANGUAGE TRIVIA!");
        System.out.println("For each question answered correctly, you will recieve points ranging from 100-500");
        System.out.println("To begin, what is your name?");
        Scanner input = new Scanner(System.in);
        playerName = input.nextLine();
        System.out.println("Welcome, " + playerName + "." + "Let's get started.");
    }
    public void displayQuestion() {
        int randNum = (int) (Math.random() * 11) + 1;
        if(!(questionArray[randNum] == null)) {
            System.out.println(questionArray[randNum]);
        }
        currentQuestion = questionArray[randNum];
        System.out.println("Enter the letter of the answer");
    }
    public void checkAnswer() {
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        if(response.equals(currentQuestion.getAnswer())) {
            System.out.println("You got it!");
        }
        else{
            System.out.println("dam you suck lol");
        }
    }



    
}
