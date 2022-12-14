package lesson05;

import helpers.Keyboard;

public class MathPalChallengeTeamB {
    public static void main(String[] args) {
        // TODO: On board the user with a welcoming message 
        
        // TODO: Declare a boolean variable isPlay and set it to true

        // TODO: Use isPlay in the while loop
        while(true) {
            System.out.println("1. Counting");
            System.out.println("2. Add");
            System.out.println("3. Subtract");
            System.out.println("4. Multiply");
            System.out.println("5. Divide");

            System.out.println("What to you want to try?");
            String function = Keyboard.readString();

            System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();

            int output = -1;

            if (function.equals("Add")) {
                output = calc(n1, n2, '+');
                System.out.println(n1 + " * " + n2 + " = " + output);
                explainer();
            } else if (function.equals("Multiply"))
                output = calc(n1, n2 , '*');
                System.out.println(n1 + " * " + n2 + " = " + output);
                explainer();
            } // TODO: continue if statements for the rest of the functions...
        }

        /**
         * A method that performs a calculation of two numbers based on an operator
         * @param n1
         * @param n2
         * @param operator
         * @return
         */
        public static int calc(int n1, int n2, char operator) {
            // TODO: use a switch case statement to switch between operator
            // in each case, return the appropriate result e.g., n1 + n2
            return 5; 
        
        }

        // TODO: Have separate explainer() that accept appropriate parameters to keep the main() clean
        // and easy to read e.g., addExplainer(int n1, int n2) { ... }. The methods do not return anything (void)
        // and should output the explainer using the inputs
        public static void explainer() {
            System.out.println("output explainer");
        }
}
