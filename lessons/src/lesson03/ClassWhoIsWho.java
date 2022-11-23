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
                } else {
                    System.out.println("Is the hair parted exactly in the middle?");
                    hasFeature = Keyboard.readBoolean();
                    if (hasFeature) {
                        System.out.println("Then it is Fried T, Ms C and Fried T are still working things out...");
                    } else {
                        System.out.println("Is his mouth open like he is laughing at Ms Cs lack of social skills?");
                        hasFeature = Keyboard.readBoolean();
                        if (hasFeature) {
                            System.out.println("It is Simon, he finds her blunders amusing!");
                        } else {
                            System.out.println("Wait, hold on, does he have green hair?");
                            hasFeature = Keyboard.readBoolean();
                            if (hasFeature) {
                                System.out.println("It is Joshua, he is super nice!");
                            } else {
                                System.out.println("Oh dear, perhaps his eyes are squinted and is he smiley?");
                                hasFeature = Keyboard.readBoolean();
                                if (hasFeature) {
                                    System.out.println("Then it is Kailu, he is very well mannered and travelled the world!");
                                } else {
                                    System.out.println("Run! It is Benedek and he will trash you in Tetris!");
                                }
                            }
                        }
                    }
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
