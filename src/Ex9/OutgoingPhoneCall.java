package Ex9;

public class OutgoingPhoneCall extends PhoneCall {
    private int callTime; // in minutes

    public OutgoingPhoneCall(String phoneNumber, int callTime) {
        super(phoneNumber);
        this.callTime = callTime;
        setPrice(0.04 * callTime);
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getCallTime() {
        return callTime;
    }

    @Override
    public void displayInformation() {
        System.out.println("Outgoing Phone Call");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate: $0.04 per minute");
        System.out.println("Call Time: " + getCallTime() + " minutes");
        System.out.println("Price: $" + getPrice());
    }
}

