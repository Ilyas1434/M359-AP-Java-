package Unit4;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randNum = (int) (Math.random() * 10) + 1;
        boolean hasNotGuessedNumber = true;
        int count = 0;
        while(hasNotGuessedNumber) {
            count++;
            System.out.println("Guess a number from 1-10");
            int guessedNum = input.nextInt();
            if(guessedNum == randNum) {
                System.out.println("Congrats! You guessed the number " + randNum + " in " + count);
                hasNotGuessedNumber = false;
            }
            else if(guessedNum > randNum) {
                System.out.println("Your guess is too high");
            }
            else {
                System.out.println("Your guess is too low");
            }
        }
    }
}
