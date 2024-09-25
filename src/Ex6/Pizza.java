package Ex6;

public class Pizza {
    private String[] toppings;
    private int numberOfToppings;
    private double price;
    private String description;

    public Pizza(String[] toppings, int numberOfToppings) {
        this.toppings = new String[10];
        this.numberOfToppings = numberOfToppings;
        StringBuilder desc = new StringBuilder();
        for (int i = 0; i < numberOfToppings; i++) {
            this.toppings[i] = toppings[i];
            desc.append(toppings[i]);
            if (i < numberOfToppings - 1) {
                desc.append(", ");
            }
        }
        this.description = desc.toString();
        this.price = 14 + 2 * numberOfToppings;
    }

    @Override
    public String toString() {
        return "Pizza with toppings: " + description + " | Price: $" + price;
    }
}
