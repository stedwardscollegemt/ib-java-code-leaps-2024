package lesson07;

/**
 * 
 */
public class Soldier {
    /**
     * ------------- Attributes -------------------------------------
     * These are all the properties that describe the state.
     */
    int id;
    
    int health;

    String name;

    String hungerLevel = "Hamborgor";

    boolean isHungry;

    char gender;

    /**
     *  ------------- Coming Soon -----------------------------------
    */
    public Soldier() {} // default constructor

    public Soldier(char gender) { // parametised constructor to immediately get a desired state
        this.gender = gender;
    }

    /**
     * ------------- Behavioral Methods -----------------------------
     * The functions the object can use to update the state.
    */
    public void damage() {
        health = health - 1;
    }

    public void eat() {
        if (isHungry) {
            switch(hungerLevel) {
                case "Hamborgor": {
                    // todo give him 10 hamburgers
                }
                case "Hamburger": {
                    // todo give him 0 hamburger
                }
            }
            isHungry = false;
        }
    }
}
