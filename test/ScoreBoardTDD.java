package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.ScoreBoard;

public class ScoreBoardTDD {

    private ScoreBoard scoreboard;

    @BeforeEach
    public void setUp() {
        scoreboard = new ScoreBoard();
    }


    @Test
    public void testAddGame() {
        scoreboard.startGame("Mexico", "Canada");
        scoreboard.startGame("Spain", "Brazil");
        scoreboard.startGame("Germany", "France");
        scoreboard.startGame("Uruguay", "Italy");
        scoreboard.startGame("Argentina", "Australia");

        assertEquals(5, scoreboard.getNumGames());
    }

    @Test
    public void testFinishGame() {
        scoreboard.startGame("Mexico", "Canada");
        scoreboard.startGame("Spain", "Brazil");
        scoreboard.finishGame("Mexico", "Canada");

        assertEquals(1, scoreboard.getNumGames());
    }


    @Test
    public void testUpdateScore() {
        scoreboard.startGame("Mexico", "Canada");
        scoreboard.updateScore("Mexico", "Canada", 2, 1);

        assertEquals(Arrays.asList("Mexico 2 - Canada 1"), scoreboard.getSummary());
    }

    @Test
    public void testGetSummaryByTotalScore() {
        scoreboard.startGame("Mexico", "Canada");
        scoreboard.startGame("Spain", "Brazil");
        scoreboard.startGame("Germany", "France");
        scoreboard.startGame("Uruguay", "Italy");
        scoreboard.startGame("Argentina", "Australia");

        scoreboard.updateScore("Mexico", "Canada", 0, 5);
        scoreboard.updateScore("Spain", "Brazil", 10, 2);
        scoreboard.updateScore("Germany", "France", 2, 2);
        scoreboard.updateScore("Uruguay", "Italy", 6, 6);
        scoreboard.updateScore("Argentina", "Australia", 3, 1);

        assertEquals(Arrays.asList(
                "Spain 10 - Brazil 2",
                "Uruguay 6 - Italy 6",
                "Mexico 0 - Canada 5",
                "Argentina 3 - Australia 1",
                "Germany 2 - France 2"
        ), scoreboard.getSummary());
    }

}