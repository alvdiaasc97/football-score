import java.util.*;

public class ScoreBoard {
    private Map<String, Integer[]> scores;
    private List<String> summary;

    public ScoreBoard() {
        scores = new HashMap<>();
        summary = new ArrayList<>();
    }

    // Number of games
    public int getNumGames() {
        return scores.size();
    }

    //Create game.
    public void startGame(String homeTeam, String awayTeam) {
        scores.put(homeTeam + "-" + awayTeam, new Integer[] { 0, 0 });
    }

    // Finish the game and remove it.
    public void finishGame(String homeTeam, String awayTeam) {
        scores.remove(homeTeam + "-" + awayTeam);
    }


    //Update the game score.
    public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        Integer[] score = scores.get(homeTeam + "-" + awayTeam);
        score[0] = homeScore;
        score[1] = awayScore;
    }
    // Return the summary of all the games.
    public List<String> getSummary() {
        summary.clear();
        Map<Integer, List<String>> totalScoreMap = new TreeMap<>(Collections.reverseOrder());
        for (String teams : scores.keySet()) {
            String[] team = teams.split("-");
            int totalScore = scores.get(teams)[0] + scores.get(teams)[1];
            if (!totalScoreMap.containsKey(totalScore)) {
                totalScoreMap.put(totalScore, new ArrayList<>());
            }
            totalScoreMap.get(totalScore)
                    .add(team[0] + " " + scores.get(teams)[0] + " - " + team[1] + " " + scores.get(teams)[1]);
        }
        for (Integer totalScore : totalScoreMap.keySet()) {
            List<String> games = totalScoreMap.get(totalScore);
            Collections.sort(games);
            for (String game : games) {
                summary.add(game);
            }
        }
        return summary;
    }


}
