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
                explainer(n1, n2, '+');
            } else if (function.equals("Multiply")) {
                output = calc(n1, n2 , '*');
                System.out.println(n1 + " * " + n2 + " = " + output);
                explainer(n1, n2, '*');
            } else if (function.equals("Divide")) {
                output = calc(n1, n2 , '/');
                System.out.println(n1 + " / " + n2 + " = " + output);
                explainer(n1, n2, '/');
            } else if (function.equals("Subtract")) {
                output = calc(n1, n2 , '-');
                System.out.println(n1 + " - " + n2 + " = " + output);
                explainer(n1, n2, '-');
            } else {

            }
        }
    }

    /**
     * A method that performs a calculation of two numbers based on an operator
     * @param n1
    * @param n2
    * @param operator
    * @return
    */
    public static int calc(int n1, int n2, char operator) {
        int result = -1;
        switch(operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '/':
                result = (int) (n1 / n2); // 
                break;
            case '*':
                result = n1 * n2;
                break;
            default:
                System.out.println("ERR: I cannot recognise this operator: " + operator);
            }   
        return result;
    }

    public static void explainer(int n1, int n2, char operator) {
        switch(operator) {
            case '+':
                System.out.println("Start counting from n1: " + n1);
                System.out.println("Keep counting for n2 (" + n2 + ") times.");
                System.out.println("Example...");
                for (int count = n1; count <= (count + n2); count++) {
                System.out.println(count);
                }
                break;
            case '-':
                System.out.println("Start counting from n1: " + n1);
                System.out.println("Keep counting for n2 (" + n2 + ") times but backwards.");
                System.out.println("Example...");
                for (int count = n1; count >= (count - n2); count--) {
                    System.out.println(count);
                }
                break;
            case '/':
                System.out.println("Imagine you are sharing toys equally among children.");
                System.out.println("If you have 5 toys but 2 children... each child will get...");
                System.out.println("Each child gets 2 whole toys, and a broken toy...");
                break;
            case '*':
                System.out.println("You are on your own kid, do this by heart!");
                break;
            default:
                System.out.println("ERR: I cannot recognise this operator: " + operator);
        }
    }
}