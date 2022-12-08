package U6_Arrays.TriviaLab;

import java.io.FileNotFoundException;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame game = new TriviaGame();
        game.startGame();
        game.displayQuestion();
        game.checkAnswer();
    }
}
