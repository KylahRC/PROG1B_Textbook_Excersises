package Ex12;

import java.util.Scanner;

public class DemoTurners2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turner turner;

        System.out.println("Enter the type of turner (Leaf, Page, Pancake, Fan, Wheel):");
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
            case "fan":
                turner = new Fan();
                break;
            case "wheel":
                turner = new Wheel();
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

