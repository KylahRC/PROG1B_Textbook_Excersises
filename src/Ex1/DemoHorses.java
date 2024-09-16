package Ex1;

import java.util.Scanner;

class DemoHorses
{
    public static void main (String args[])
    {
        Horse horseObj = new Horse();
        RaceHorse raceObj = new RaceHorse();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter horse name: ");
        horseObj.name = scanner.nextLine();

        System.out.println("Enter horse colour: ");
        horseObj.colour = scanner.nextLine();

        System.out.println("Enter horse birthYear: ");
        horseObj.birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter races completed by horse (total): ");
        raceObj.racesCompleted = scanner.nextInt();
        scanner.nextLine();

//        test to see what the system will output
        System.out.println(horseObj.name);
        System.out.println(horseObj.colour);
        System.out.println(horseObj.birthYear);
        System.out.println(raceObj.racesCompleted);
    }
}
