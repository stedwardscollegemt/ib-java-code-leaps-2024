package lesson04;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import helpers.Keyboard;

/**
 * Can you read your teacher's code?
 * Run the code, experiment with input, and fill in the // with your explainers.
 * Filling in the comments is not optional so do not ask whether you can not do it *eye roll*.
 */
public class AlexaSkillGuessTheNumber {
    public static void main(String[] args) {
        //
        System.out.println("Hello there, let's play: Guess The Number.");
        System.out.println("Are you ready?");
        String response = Keyboard.readString();

        //
        if (response.equals("yes") || response.equals("y")) {
            System.out.println("Hmm... all right let me think of a number...");

            //
            int number = (new Random()).nextInt(10);
            
            //
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.println("");

            //
            int triesLeft = 3;
            System.out.println("Ok. You have 3 tries left. Have a go at your first guess.");
            int guess = Keyboard.readInt();
            
            //
            while (guess != number && triesLeft > 0) {
                if (guess < number) { //
                    System.out.println("You are not correct! The number I am thinking of, is larger. Take another guess...");
                } else { // 
                    System.out.println("You are not correct! The number I am thinking of, is smaller. Take another guess...");
                }
                //
                guess = Keyboard.readInt();
                triesLeft = triesLeft - 1;
            }
               
            //
            if (triesLeft > 0 && guess == number) { //
                System.out.println("Well done, you guessed. That was a good round.");
            } else { //
                System.out.println("You lost! The number I thought of was: " + number);
                System.out.println("Better luck next time.");
            }

        } else { //
            System.out.println("That is all right. Maybe some other time...");
            System.out.println("Have a great day!");
        }
    }

    //
    //
    //
    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}