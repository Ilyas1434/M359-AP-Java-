package U6_Arrays.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    public static int getRandNum() {
        return randNum;
    }

    public static void setRandNum(int randNum) {
        TriviaGame.randNum = randNum;
    }

    public static Question getPreviousQuestion() {
        return previousQuestion;
    }

    public static void setPreviousQuestion(Question previousQuestion) {
        TriviaGame.previousQuestion = previousQuestion;
    }

    private static int randNum;
    private static Question previousQuestion;
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

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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

    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(Question currentQuestion) {
        this.currentQuestion = currentQuestion;
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
    public boolean isAllEqual() {
        int count = 0;
        for (int i = 1; i < questionArray.length; i++) {
            if (questionArray[0] != null) {
                return false;
            }
        }
      return true;
    }




    
}
