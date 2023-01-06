package lesson06;

import helpers.ArrayHelper;

public class DemoArrayHelper {
    
    static void main(String[] args) {
        // declare one variable for one number
        // assign myNumber to 5
        int myNumber = 5;

        // declare an array for 100 numbers
        // assign memory locations
        int[] myNumbers = new int[100];

        // using array helpers
        ArrayHelper.fill(myNumbers, myNumber);

        boolean found = ArrayHelper.contains(myNumbers, myNumber);
        System.out.println(found); // we expect true
        
        boolean notFound = ArrayHelper.contains(myNumbers, 6);
        System.out.println(notFound); // we expect false
    }
}
