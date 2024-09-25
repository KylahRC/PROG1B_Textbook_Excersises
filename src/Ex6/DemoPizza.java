package Ex6;

import java.util.Scanner;

public class DemoPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toppings = new String[10];
        int count = 0;

        System.out.println("Enter pizza toppings (type 'QUIT' to stop):");
        while (count < 10) {
            String topping = scanner.nextLine();
            if (topping.equalsIgnoreCase("QUIT")) {
                break;
            }
            toppings[count] = topping;
            count++;
        }

        System.out.println("Is the pizza to be delivered? (yes/no)");
        String delivery = scanner.nextLine();

        if (delivery.equalsIgnoreCase("yes")) {
            System.out.println("Enter delivery address:");
            String address = scanner.nextLine();
            DeliveryPizza deliveryPizza = new DeliveryPizza(toppings, address, count);
            System.out.println(deliveryPizza);
        } else {
            Pizza pizza = new Pizza(toppings, count);
            System.out.println(pizza);
        }

        scanner.close();
    }
}
