package lesson07;

import helpers.Keyboard;

public class WorkingWithStrings {
    public static void main(String[] args) {
        
        String myString = new String();
        boolean endWith = myString.endsWith("s");

        // Declaration and assignment of strings
        String paymentTypeCard = new String("Card");
        String paymentTypeCash = "Cash"; // you will use this method most

        // Ask for the payment type as input
        System.out.println("Enter your payment type (Cash/Card)");
        String userPaymentType = Keyboard.readString();

        // Compare userPaymentType with existing paymentTypes
        if (userPaymentType.equals(paymentTypeCard)) { // we cannot use == because Java will check for the memory location, not compare state
            System.out.println("You are paying by card.");
        }

        if (userPaymentType.equals(paymentTypeCash)) {
            System.out.println("You are paying by cash.");
        }
    }
}
