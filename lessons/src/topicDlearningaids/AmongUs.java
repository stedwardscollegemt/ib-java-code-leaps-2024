package topicDlearningaids;

import java.util.Random;

/**
 * Define static
 */
public class AmongUs {

    /**
     * - static means *no state* and does not 
     * - static attributes do not describe the state of an object instance
     * - static attributes can be accessed directly using the class
     */
    public static final String[] WARDROBE = {
        "Red", "Blue", "Green", 
        "Pink", "Orange", "Yellow", 
        "Black", "White", "Purple", 
        "Brown", "Cyan", "Lime", 
        "Maroon", "Rose", "Banana", 
        "Gray", "Tan", "Coral"
    }; // 18 colours

    // TODO: Declare a static final array with all the roles allowed

    private static boolean[] AVAILABLE_COLOURS = {
        true, true, true,
        true, true, true,
        true, true, true,
        true, true, true,
        true, true, true,
        true, true, true,
    };

    // TODO: Declare a static boolean array with all the roles taken

    private String colour;

    private String role;

    /**
     * --- Unparameterised Constructor --------------------------------------------
     * @param colour
     */
    public AmongUs() {
        setRandomColour();
        // TODO: continue to initialise the state
    }

    /**
     * --- Parameterised Constructor ----------------------------------------------
     * 
     * @param colour
     */
    public AmongUs(String colour) {
        // TODO: initialise the state
    }

    /**
     * --- Methods That Change State ----------------------------------------------
     * 
     */

    /**
     * Gives this instance a random colour
     */
    public void setRandomColour() {
        Random r = new Random();
        int select = 0;
        do {
          // get a random number between 0 and WARDROBE.length - 1
          // https://stackoverflow.com/questions/2444019/how-do-i-generate-a-random-integer-between-min-and-max-in-java
          select = r.nextInt(WARDROBE.length - 1); 
        } while(AVAILABLE_COLOURS[select] == false);
        this.colour = WARDROBE[select];
        AVAILABLE_COLOURS[select] = false;
    }

    /**
     * Gives this instance a random role
     */
    public void setRandmomRole() {

    }

    /**
     * @Override
     * 
     * @return
     */
    public String __toString() {
        // TODO: provide a pretty way to display this character
        // TODO: Use String.format()
        // TODO: https://dzone.com/articles/how-to-format-a-string-clarified
        return "";
    }
}
