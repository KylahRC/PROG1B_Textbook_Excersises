package Ex12;

import java.util.Scanner;

public class DemoTurners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turner turner;

        System.out.println("Enter the type of turner (Leaf, Page, Pancake):");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "leaf":
                turner = new Leaf();
                break;
            case "page":
                turner = new Page();
                break;
            case "pancake":
                turner = new Pancake();
                break;
            default:
                System.out.println("Invalid type. Defaulting to Leaf.");
                turner = new Leaf();
                break;
        }

        turner.turn();
        scanner.close();
    }
}

