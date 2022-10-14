package lesson02;

/**
 * I created this class called BuildingBlocks to learn about simple data types in Java.
 * We need various data types in our programs to store various kinds of data such as numbers, text, and logic.
 */
public class BuildingBlocks {

    public static void main(String[] args) {
        /**
         * 2.5
         */
        //TODO: Declare and assign a constant for NO_OF_WEEK_DAYS

        /**
         * 2.2, 2.3, 2.4, 2.6
         * The following data types are also referred to as "primitive data types"
         */
        // Declaring a variable of data type integer and assigning a value
        double appleUnitPrice = 0.55; // price in dollars
        // Display "Apple Unit Price: $<appleUnitPrice>"
        System.out.println("Apple Unit Price: $" + appleUnitPrice);

        int appleQty = 10; 
        // Display "Qty: 10"
        System.out.println("Qty: " + appleQty);
        // Declare a variable named amountDue and assign it to appleUnitPrice * appleQty
        double amountDue = appleUnitPrice * appleQty;
        // Display "Amount due: $<amountDue>"
        System.out.println("Amount Due: $" + amountDue);
        System.out.println("------------------------------------------------------------------------------------------");

        // Declaring a variable of data type float and assigning a value
        float temperature = 2.4f;
        // Increase the temperature by 5.7 degrees celcius
        temperature = temperature + 5.7f;
        // Display "Temperature: <temperature> degrees celcius"
        System.out.println("Temperature: " + temperature + " degrees celcius");
        System.out.println("------------------------------------------------------------------------------------------");

        // Declaring a variable of data type double and assigning a value
        double balance = 100.40;
        // TODO: Decrease the balance by 4.95 dollars
        // TODO: Display "Account Balance: 95.45"
        System.out.println("------------------------------------------------------------------------------------------");

        // Declaring a variable of data type char and assigning a value
        char scrabbleTile = 'E';

        // Declaring a variable of data type boolean and assigning a value
        boolean isHungry = true;
    }  
}
