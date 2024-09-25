package Ex11;

import java.util.Scanner;

public class DemoBlankets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Blanket blanket = new Blanket();
        System.out.println("Initial Blanket: " + blanket);

        while (true) {
            System.out.println("Enter blanket material (type 'QUIT' to stop):");
            String material = scanner.nextLine();
            if (material.equalsIgnoreCase("QUIT")) {
                break;
            }
            blanket.setMaterial(material);
            System.out.println("Updated Blanket: " + blanket);

            System.out.println("Enter blanket size (type 'QUIT' to stop):");
            String size = scanner.nextLine();
            if (size.equalsIgnoreCase("QUIT")) {
                break;
            }
            blanket.setSize(size);
            System.out.println("Updated Blanket: " + blanket);
        }

        ElectricBlanket electricBlanket = new ElectricBlanket();
        System.out.println("Initial Electric Blanket: " + electricBlanket);

        while (true) {
            System.out.println("Enter blanket material (type 'QUIT' to stop):");
            String material = scanner.nextLine();
            if (material.equalsIgnoreCase("QUIT")) {
                break;
            }
            electricBlanket.setMaterial(material);
            System.out.println("Updated Electric Blanket: " + electricBlanket);

            System.out.println("Enter blanket size (type 'QUIT' to stop):");
            String size = scanner.nextLine();
            if (size.equalsIgnoreCase("QUIT")) {
                break;
            }
            electricBlanket.setSize(size);
            System.out.println("Updated Electric Blanket: " + electricBlanket);

            System.out.println("Enter number of heat settings (type 'QUIT' to stop):");
            int heatSettings = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            electricBlanket.setHeatSettings(heatSettings);
            System.out.println("Updated Electric Blanket: " + electricBlanket);

            System.out.println("Does the blanket have automatic shutoff? (true/false, type 'QUIT' to stop):");
            boolean hasAutoShutoff = scanner.nextBoolean();
            scanner.nextLine(); // Consume newline
            electricBlanket.setHasAutoShutoff(hasAutoShutoff);
            System.out.println("Updated Electric Blanket: " + electricBlanket);
        }

        scanner.close();
    }
}

