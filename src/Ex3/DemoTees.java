package Ex3;

import java.util.Scanner;

public class DemoTees
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        TeeShirt teeShirtObj1 = new TeeShirt();
        TeeShirt teeShirtObj2 = new TeeShirt();
        CustomTee customTeeObj1 =new CustomTee();
        CustomTee customTeeObj2 =new CustomTee();

//        I discovered that you can use {} to make sections of your code collapsable
//        This is the input an output for the first regular tee
        {
            System.out.println("(Regular tee 1) Enter your order number: ");
            teeShirtObj1.setOrderNumber(scanner.nextInt());
            scanner.nextLine();

            System.out.println("(Regular tee 1) Enter size: ");
            teeShirtObj1.setSize(scanner.nextLine());

            System.out.println("(Regular tee 1) Enter colour: ");
            teeShirtObj1.setColour(scanner.nextLine());

            System.out.println("Order number: " + teeShirtObj1.getOrderNumber());
            System.out.println("Size: " + teeShirtObj1.getSize());
            System.out.println("Colour: " + teeShirtObj1.getColour());
            System.out.println("Price: " + teeShirtObj1.getPrice());
        }

//        This is the input an output for the second regular tee
        {
            System.out.println("(Regular tee 2) Enter your order number: ");
            teeShirtObj2.setOrderNumber(scanner.nextInt());
            scanner.nextLine();

            System.out.println("(Regular tee 2) Enter size: ");
            teeShirtObj2.setSize(scanner.nextLine());

            System.out.println("(Regular tee 2) Enter colour: ");
            teeShirtObj2.setColour(scanner.nextLine());

            System.out.println("Order number: " + teeShirtObj2.getOrderNumber());
            System.out.println("Size: " + teeShirtObj2.getSize());
            System.out.println("Colour: " + teeShirtObj2.getColour());
            System.out.println("Price: " + teeShirtObj2.getPrice());
        }

//        This is the input an output for the first slogan tee
        {
            System.out.println("(Slogan tee 1) Enter your order number: ");
            teeShirtObj1.setOrderNumber(scanner.nextInt());
            scanner.nextLine();

            System.out.println("(Slogan tee 1) Enter size: ");
            teeShirtObj1.setSize(scanner.nextLine());

            System.out.println("(Slogan tee 1) Enter colour: ");
            teeShirtObj1.setColour(scanner.nextLine());

            System.out.println("(Slogan tee 1) Enter slogan: ");
            customTeeObj1.setSlogan(scanner.nextLine());

            System.out.println("Order number: " + teeShirtObj1.getOrderNumber());
            System.out.println("Size: " + teeShirtObj1.getSize());
            System.out.println("Colour: " + teeShirtObj1.getColour());
            System.out.println("Price: " + teeShirtObj1.getPrice());
            System.out.println("Slogan: " + customTeeObj1.getSlogan());
        }

//        This is the input an output for the second slogan tee
        {
            System.out.println("(Slogan tee 2) Enter your order number: ");
            teeShirtObj2.setOrderNumber(scanner.nextInt());
            scanner.nextLine();

            System.out.println("(Slogan tee 2) Enter size: ");
            teeShirtObj2.setSize(scanner.nextLine());

            System.out.println("(Slogan tee 2) Enter colour: ");
            teeShirtObj2.setColour(scanner.nextLine());

            System.out.println("(Slogan tee 2) Enter slogan: ");
            customTeeObj2.setSlogan(scanner.nextLine());

            System.out.println("Order number: " + teeShirtObj1.getOrderNumber());
            System.out.println("Size: " + teeShirtObj1.getSize());
            System.out.println("Colour: " + teeShirtObj1.getColour());
            System.out.println("Price: " + teeShirtObj1.getPrice());
            System.out.println("Slogan: " + customTeeObj2.getSlogan());
        }
    }
}
