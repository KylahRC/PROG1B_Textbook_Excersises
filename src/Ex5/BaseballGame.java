package Ex5;

public class BaseballGame {
    private String team1;
    private String team2;
     int[][] scores;
    public final int INNINGS = 9;

    public BaseballGame() {
        scores = new int[2][INNINGS];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < INNINGS; j++) {
                scores[i][j] = 0; // Initialize with dummy values
            }
        }
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public void setScore(int team, int inning, int score) {
        if (team >= 0 && team < 2 && inning >= 0 && inning < INNINGS) {
            scores[team][inning] = score;
        }
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getScore(int team, int inning) {
        if (team >= 0 && team < 2 && inning >= 0 && inning < INNINGS) {
            return scores[team][inning];
        }
        return -1; // Invalid input
    }
}
