package topicDlearningaids;

import java.util.Random;

/**
 * Define static
 */
public class AmongUs {

    /**
     * - static means *no state* and does not belong to one instance
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

    // Declare a static final array with all the roles allowed
    public static final String[] ROLES = {
        "Crew", "Ghost", "Scientist", "Engineer", "Imposter",
        "Shapeshifter", "Guardian Angel"
    };

    public static final int CREW_MAX = 10;

    public static final int IMPOSTER_MAX = 2;

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
    public AmongUs(String colour, String role) {
        // setting the state as the developer wanted
        this.colour = colour;
        this.role = role;
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
