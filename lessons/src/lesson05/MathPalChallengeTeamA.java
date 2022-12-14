package lesson05;

import helpers.Keyboard;

public class MathPalChallengeTeamA {
    public static void main(String[] args) {
        
        System.out.println("Are you ready to do some math?");
        
        // TODO: Prompt the user to press Enter to continue...

        char isReady = 'y';
        
        while(isReady == 'y') {
            
            System.out.println("1. Counting");
            System.out.println("2. Add");
            System.out.println("3. Subtract");
            System.out.println("4. Multiply");
            System.out.println("4. Divide");

            System.out.println("What to you want to try?");
            String function = Keyboard.readString();

            System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();

            String output = operationFunction(function, n1, n2);
            System.out.println(output); // TODO: Make the output more user friendly

            System.out.println("Do you want an explainer? (true/false)");
            boolean expl = Keyboard.readBoolean();

            // TODO: This requires a bit more planning
            // Why not have separate functions for explainers to keep it clean?
            // or perhaps make use of operationFunction to include the explainer.
            if (expl) {
                System.out.println("Output explanation");
            }

            System.out.println("Wanna have another go? (y/n)");
            isReady = Keyboard.readChar();
        }

        // TODO: Say "Bye bye then. See you next time!"
    }

    public static String operationFunction(String function, int n1, int n2) {
        // TODO: use a switch case statement to switch between function
        // in each case, return the appropriate result e.g., n1 + n2
        // you should change the method signature to return a numeric type
        return "Assume I did the function yay";
    }
}
