package Ex2;

import java.util.Scanner;

public class DemoCandles
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Create a Candle object
        Candle candle = new Candle();

        System.out.print("Enter color for the Candle: ");
        candle.setColor(scanner.nextLine());

        System.out.print("Enter height for the Candle (in inches): ");
        candle.setHeight(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        // Create a ScentedCandle object
        ScentedCandle scentedCandle = new ScentedCandle();
        System.out.print("Enter color for the ScentedCandle: ");
        scentedCandle.setColor(scanner.nextLine());

        System.out.print("Enter height for the ScentedCandle (in inches): ");
        scentedCandle.setHeight(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        System.out.print("Enter scent for the ScentedCandle (e.g., gardenia, lavender, vanilla, rose): ");
        scentedCandle.setScent(scanner.nextLine());

        // Display details for each Candle
        System.out.println("\nCandle Details:");
        System.out.println("Color: " + candle.getColor());
        System.out.println("Height: " + candle.getHeight() + " inches");
        System.out.println("Price: $" + candle.getPrice());
        System.out.println("\nScentedCandle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());
    }
}

//import java.util.Scanner;
//
//public class DemoCandles
//{
//    public static void main(String[] args)
//    {
//        Candle candleObj = new Candle();
//        ScentedCandle scentedCandleObj = new ScentedCandle();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter desired colour: ");
//        candleObj.colour = scanner.nextLine();
//
//        System.out.println("Enter desired height: ");
//        candleObj.height = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Choose a scent (Gardenia, Rose, Daisy, Lavender): ");
//        scentedCandleObj.scent = scanner.nextLine();
//
//
//        System.out.println("Colour: " + candleObj.getColour());
//        System.out.println("Height: " + candleObj.getHeight());
//        System.out.println("Price (Candle.java): " + candleObj.getPrice());
//        System.out.println("Scent: " + scentedCandleObj.getScent());
//        System.out.println("Price (ScentedCandle.java): " + scentedCandleObj.he);
//    }
//}
