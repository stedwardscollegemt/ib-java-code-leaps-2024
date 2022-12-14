package topic05learningaids;

import helpers.Keyboard;

public class PerfectSquareSequence {

    public static void main(String[] args) {
        System.out.println("*** Perfect Square Sequence ***");
       System.out.println("********************************");

       // 
       System.out.println("Please enter a number between 1 and 6:");
       int squareN = Keyboard.readInt();
       System.out.println("--------------------------------------");
    
       // 
       for (int i = 1; i <= squareN; i++) {
            System.out.print(square(i, 1) + ", ");
       }
       
       System.out.println("");
    }

    // square number from first principles using recursion
    public static int square(int n, int blocks) {
        if (n == 1) {
            return blocks;
        }
        return square(n-1, blocks) + ((2*n) - 1);
    }
}
