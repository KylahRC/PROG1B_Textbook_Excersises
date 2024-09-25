package Ex13;

import java.util.Scanner;

public class DemoRunners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Runner runner;

        System.out.println("Enter the type of runner (Machine, Athlete, PoliticalCandidate):");
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
            default:
                System.out.println("Invalid type. Defaulting to Machine.");
                runner = new Machine();
                break;
        }

        runner.run();
        scanner.close();
    }
}

