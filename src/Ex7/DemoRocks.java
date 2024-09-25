package Ex7;

import java.util.Scanner;

public class DemoRocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rock rock;

        System.out.println("Enter the type of rock collected (U for Unclassified, I for Igneous, S for Sedimentary, M for Metamorphic):");
        String rockType = scanner.nextLine().toUpperCase();

        if (!rockType.equals("U") && !rockType.equals("I") && !rockType.equals("S") && !rockType.equals("M")) {
            rock = new Rock(0, 0);
        } else {
            System.out.println("Enter the sample number:");
            int sampleNumber = scanner.nextInt();
            System.out.println("Enter the weight in grams:");
            double weight = scanner.nextDouble();

            switch (rockType) {
                case "I":
                    rock = new IgneousRock(sampleNumber, weight);
                    break;
                case "S":
                    rock = new SedimentaryRock(sampleNumber, weight);
                    break;
                case "M":
                    rock = new MetamorphicRock(sampleNumber, weight);
                    break;
                default:
                    rock = new Rock(sampleNumber, weight);
                    break;
            }
        }

        displayRockDetails(rock);
        scanner.close();
    }

    public static void displayRockDetails(Rock rock) {
        System.out.println("Sample Number: " + rock.getSampleNumber());
        System.out.println("Description: " + rock.getDescription());
        System.out.println("Weight: " + rock.getWeight() + " grams");
    }
}

