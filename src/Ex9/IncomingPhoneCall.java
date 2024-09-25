package Ex9;

public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(0.02);
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void displayInformation() {
        System.out.println("Incoming Phone Call");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate: $" + getPrice() + " per call");
        System.out.println("Price: $" + getPrice());
    }
}

