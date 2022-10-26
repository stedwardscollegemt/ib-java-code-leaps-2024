package lesson03;

import helpers.Keyboard;

public class Selection {
    public static void main(String[] args) {
        // Declare a variable to store the age
        int age;

        System.out.println("Please enter an age between 5 and 100 inclusive: ");
        age = Keyboard.readInt();

        // Milestone activities to show you reached a certain age
        if (age >= 60) {
            // This code will run if and only if age is greater or equal to 60
            System.out.println("Enjoy your golden years!");
        }
        if (age < 60 && age >= 21) {
            // This code will run if age is less than 60 AND age is greater or equal to 21
            System.out.println("You can drink and drive (not at the same time)!");
        }
    }
}
