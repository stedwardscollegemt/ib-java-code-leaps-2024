package lesson03;

import helpers.Keyboard;

public class Selection2 {
    public static void main(String[] args) {
        // Declare a variable to store the age
        int age;

        System.out.println("Please enter an age between 5 and 100 inclusive: ");
        age = Keyboard.readInt();

        if (age >= 60) {
            // This code will run if and only if age is greater or equal to 60
            System.out.println("Enjoy your golden years!");
        } else if (age >= 21) {
            // This code will run if age is less than 60 AND age is greater or equal to 21
            System.out.println("You can drink and drive (not at the same time)!");
        } else if (age >= 18) {
            // This code will run if age is less than 21 but greater or equal to 18
            System.out.println("Congratulations, you are a legal adult!");
        } else if (age >= 17) {
            // This code will run if age is less than 21 but greater or equal to 18
            System.out.println("You can party!");
        }
    }
}
