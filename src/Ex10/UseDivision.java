package Ex10;

import java.util.Scanner;

public class UseDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division;

        System.out.println("Enter the type of division (D for Domestic, I for International):");
        String divisionType = scanner.nextLine().toUpperCase();

        System.out.println("Enter the division name:");
        String divisionName = scanner.nextLine();

        System.out.println("Enter the account number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (divisionType.equals("D")) {
            System.out.println("Enter the state:");
            String state = scanner.nextLine();
            division = new DomesticDivision(divisionName, accountNumber, state);
        } else if (divisionType.equals("I")) {
            System.out.println("Enter the country:");
            String country = scanner.nextLine();
            System.out.println("Enter the language:");
            String language = scanner.nextLine();
            division = new InternationalDivision(divisionName, accountNumber, country, language);
        } else {
            System.out.println("Invalid division type. Creating a default Domestic Division.");
            division = new DomesticDivision(divisionName, accountNumber, "Unknown");
        }

        division.display();
        scanner.close();
    }
}

