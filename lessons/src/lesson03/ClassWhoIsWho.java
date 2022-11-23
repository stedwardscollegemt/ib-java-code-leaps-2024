package lesson03;

import java.security.Key;

import helpers.Keyboard;

public class ClassWhoIsWho {
    public static void main(String[] args) {
        System.out.println("Welcome to our game of Who is Who, Year 12 Edition.");        
        System.out.println("This program is a decision tree of the class room. You can identify any member by asking questions about their features.");
        System.out.println("");

        // This variable will enable us to move down a complex decision tree
        boolean hasFeature;

        // The first feature is about height...
        System.out.println("Is the member you are looking for extremely tall? (true/false)");
        hasFeature = Keyboard.readBoolean();
        if (hasFeature) {
            System.out.println("You are definitely looking for Fried M.");
        } else {
            System.out.println("Are you looking for a female?");
            hasFeature = Keyboard.readBoolean();
            if (hasFeature) {
                System.out.println("Does she have dark plain hair with glasses?");
                hasFeature = Keyboard.readBoolean();
                if (hasFeature) {
                    System.out.println("Oh, you are looking for Ms. C, she is really nice.");
                } else {
                    System.out.println("Caitlyn is your girl, she is very cool!");
                }
            } else {
                System.out.println("Ok, is he wearing glasses and a blue scarf?");
                hasFeature = Keyboard.readBoolean();
                if (hasFeature) {
                    System.out.println("It is Dmitrii then!");
                }
            }
        }
        // is the person very tall?


        
        // brown hair

        // black hair

        // blue hair

        // red hair

        // green hair
    }
}
