package Ex6;

public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String deliveryAddress;

    public DeliveryPizza(String[] toppings, String deliveryAddress, int numberOfToppings) {
        super(toppings, numberOfToppings);
        this.deliveryAddress = deliveryAddress;
        if (super.toString().contains("Price: $") && Double.parseDouble(super.toString().split("\\$")[1]) > 18) {
            this.deliveryFee = 3;
        } else {
            this.deliveryFee = 5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Delivery fee: $" + deliveryFee + " | Delivery address: " + deliveryAddress;
    }
}

