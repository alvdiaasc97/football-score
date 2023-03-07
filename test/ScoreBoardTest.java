import java.util.List;

import model.ScoreBoard;

public class ScoreBoardTest {
    public static void main(String[] args) {

        //Initialise the Board
        ScoreBoard scoreBoard = new ScoreBoard();

        //Add the first game
        scoreBoard.startGame("Mexico", "Canada");

        //Update the live score
        scoreBoard.updateScore("Mexico", "Canada", 0, 5);


        scoreBoard.startGame("Spain", "Brazil");
        scoreBoard.updateScore("Spain", "Brazil", 10, 2);
        scoreBoard.startGame("Germany", "France");
        scoreBoard.updateScore("Germany", "France", 2, 2);
        scoreBoard.startGame("Uruguay", "Italy");
        scoreBoard.updateScore("Uruguay", "Italy", 6, 6);
        scoreBoard.startGame("Argentina", "Australia");
        scoreBoard.updateScore("Argentina", "Australia", 3, 1);
        scoreBoard.finishGame("Mexico", "Canada");

        // Print all the results
        List<String> summary = scoreBoard.getSummary();
        for (String game : summary) {
            System.out.println(game);
        }
    }
}