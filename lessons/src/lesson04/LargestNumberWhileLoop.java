package lesson04;

import helpers.Keyboard;

public class LargestNumberWhileLoop {
    public static void main(String[] args) {
        int n1, n2;

        // Step 1. Ask for the user to input n1
        System.out.println("Please enter a number:");
        n1 = Keyboard.readInt();

        // 
        int counter = 0;
        while (counter < 5) {
            // Ask for the user to input n2
            System.out.println("Please enter another number:");
            n2 = Keyboard.readInt();
            
            int result = compare(n1, n2);
            if (result == 1) {
                n1 = n2;
            }
            
            counter = counter + 1; // we made a comparison
        }

        // Step 4. Display the largest number
        System.out.println("Largest number is " + n1);
    }

    public static int compare(int n1, int n2) {

        if(n1 == n2) {
            return 0; // equal
        }
        
        if (n1 < n2) {
            return 1; // n2 is larger
        }
        
        // this means that n1 is larger
        return 2;
    }
}
