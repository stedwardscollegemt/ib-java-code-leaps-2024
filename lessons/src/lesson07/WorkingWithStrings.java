package lesson07;

import helpers.Keyboard;

public class WorkingWithStrings {
    public static void main(String[] args) {
        
        // How to create an (object) instance of any class
        // The action of pressing the cookie cutter (class) against the dough (memory)
        // to have a single shaped cookie (object instance) that is ready for baking and decorating (state and behaviour)
        String myString = new String();
        boolean endWith = myString.endsWith("s");
        System.out.println("myString ends with 's'? " + endWith);

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

        /**
         * ------- Helpful String Behaviour Methods  ------------------------------------------------------------------
         */
        // splitting a string 


    }
}
