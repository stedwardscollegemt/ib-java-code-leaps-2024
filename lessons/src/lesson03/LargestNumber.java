package lesson03;

import helpers.Keyboard;

/**
 * TODO: Write a program that accepts three numbers as input from the user
 * and outputs the largest one.
 */
public class LargestNumber {
    public static void main(String[] args) {
        int largestNumber, n1, n2, n3;

        // Step 1. Ask for the user to input 3 numbers, n1, n2, n3
        System.out.println("Please enter 3 numbers:");
        n1 = Keyboard.readInt();
        n2 = Keyboard.readInt();
        n3 = Keyboard.readInt();

        // Step 2. If n1 > n2 then largestNumber = n1
        if (n1 > n2) {
            largestNumber = n1;
        } else {
            largestNumber = n2;
        }

        // Step 3. If n3 > largestNumber then largestNumber = n3 
        if (n3 > largestNumber) {
            largestNumber = n3;
        }

        // Step 4. Display the largest number
        System.out.println(largestNumber);
    }
}
