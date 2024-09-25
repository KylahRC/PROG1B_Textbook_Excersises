package Ex9;

import java.util.Scanner;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneCall phoneCall;
        String callType;

        while (true) {
            System.out.println("Enter the type of call (I for Incoming, O for Outgoing, Q to Quit):");
            callType = scanner.nextLine().toUpperCase();

            if (callType.equals("Q")) {
                break;
            }

            System.out.println("Enter the phone number:");
            String phoneNumber = scanner.nextLine();

            if (callType.equals("I")) {
                phoneCall = new IncomingPhoneCall(phoneNumber);
            } else if (callType.equals("O")) {
                System.out.println("Enter the call time in minutes:");
                int callTime = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                phoneCall = new OutgoingPhoneCall(phoneNumber, callTime);
            } else {
                System.out.println("Invalid call type. Please enter I, O, or Q.");
                continue;
            }

            phoneCall.displayInformation();
        }

        scanner.close();
    }
}

