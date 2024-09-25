package Ex5;

import java.util.Scanner;

public class DemoBaseballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseballGame game;

        System.out.println("Select game type: 1 for High School, 2 for Little League");
        int gameType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (gameType == 1) {
            game = new HighSchoolBaseballGame();
        } else {
            game = new LittleLeagueBaseballGame();
        }

        System.out.println("Enter team 1 name:");
        game.setTeam1(scanner.nextLine());
        System.out.println("Enter team 2 name:");
        game.setTeam2(scanner.nextLine());

        int innings = (gameType == 1) ? 7 : 6;

        for (int i = 0; i < innings; i++) {
            System.out.println("Enter score for " + game.getTeam1() + " in inning " + (i + 1) + ":");
            game.setScore(0, i, scanner.nextInt());
            System.out.println("Enter score for " + game.getTeam2() + " in inning " + (i + 1) + ":");
            game.setScore(1, i, scanner.nextInt());
        }

        int totalScore1 = 0;
        int totalScore2 = 0;
        for (int i = 0; i < innings; i++) {
            totalScore1 += game.getScore(0, i);
            totalScore2 += game.getScore(1, i);
        }

        System.out.println("Final Score:");
        System.out.println(game.getTeam1() + ": " + totalScore1);
        System.out.println(game.getTeam2() + ": " + totalScore2);

        if (totalScore1 > totalScore2) {
            System.out.println(game.getTeam1() + " wins!");
        } else if (totalScore2 > totalScore1) {
            System.out.println(game.getTeam2() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}

