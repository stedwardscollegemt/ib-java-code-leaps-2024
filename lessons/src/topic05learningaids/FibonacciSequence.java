package topic05learningaids;

import helpers.Keyboard;

/**
 * Thinking Recursively
 * P - Predict. Write or draw what you think the program will output.
 * R - Run. Run the code and compare the actual result with your prediction.
 * I - Investigate. Work with someone to fill in the // with explainers of what the code is doing.
 * M - Modify. Make one small change, does not have to be spectacular.
 * M - Make. Create a new class to print out the Perfect Square Series from first principles. ==> (https://brilliant.org/courses/math-fundamentals/intro-to-math-fundamentals/)
 */
public class FibonacciSequence {
    
    public static void main(String[] args) {
       System.out.println("*** Fibonacci Sequence ***");
       System.out.println("**************************");

       // 
       System.out.println("Please enter a number between 0 and 6:");
       int fiboN = Keyboard.readInt();
       System.out.println("--------------------------------------");
    
       // 
       for (int i = 1; i <= fiboN; i++) {
            System.out.print(fibonacci(i) + ", ");
       }
       System.out.println("");
    }

    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n-1) + fibonacci(n-2);
        } else {
            return n;
        }
    }
}
