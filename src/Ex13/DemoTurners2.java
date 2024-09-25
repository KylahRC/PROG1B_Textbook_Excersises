package Ex13;

import java.util.Scanner;

public class DemoTurners2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Runner runner;

        System.out.println("Enter the type of runner (Machine, Athlete, PoliticalCandidate, Fan, Wheel):");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "machine":
                runner = new Machine();
                break;
            case "athlete":
                runner = new Athlete();
                break;
            case "politicalcandidate":
                runner = new PoliticalCandidate();
                break;
            case "fan":
                runner = new Fan();
                break;
            case "wheel":
                runner = new Wheel();
                break;
            default:
                System.out.println("Invalid type. Defaulting to Machine.");
                runner = new Machine();
                break;
        }

        runner.run();
        scanner.close();
    }
}
