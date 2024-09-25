package Ex14;

import java.time.LocalDate;
import java.util.Scanner;

public class InventionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the description of the invention:");
        String description = scanner.nextLine();

        System.out.println("Enter the name of the inventor:");
        String name = scanner.nextLine();

        System.out.println("Enter the country of origin of the inventor:");
        String countryOfOrigin = scanner.nextLine();

        System.out.println("Enter the date of the invention (YYYY-MM-DD):");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString);

        Inventor inventor = new Inventor(name, countryOfOrigin);
        Invention invention = new Invention(description, inventor, date);

        System.out.println(invention);

        scanner.close();
    }
}
