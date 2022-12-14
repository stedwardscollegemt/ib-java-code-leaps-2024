package lesson05;

/**
 * Topic 4 Slides (Thinking Procedurally)
 * This program is meant to describe an efficient way of cleaning a small
 * apartment using a divide and conquer approach.
 */
public class HouseCleaningMethods {
    
    /**
     * The main() is called automatically when we click on Run.
     */
    public static void main(String[] args) {
        
        // welcome message
        System.out.println("*** Clean House Process***");
        System.out.println("--------------------------");
        System.out.println("");

        // we need to call all methods we defined for them to run
        cleanTerrace();   
        cleanOffice();      
        cleanBedroom();     
        cleanBathroom();     
        cleanKitchen();     
        cleanLivingRoom();
    }

    /**
     * ---- Methods For Individual Cleaning Tasks ---------------------------------------------
     */
    public static void sweepTheFloor(String broom) {
        System.out.println("  --Sweep Floor:  " + broom);
    }

    public static void declutter() {
        System.out.println("  --Declutter");
    }

    public static void rearrange() {
        System.out.println("  --Rearrange");
    }

    /**
     * ---- Methods For Cleaning Zones ---------------------------------------------
     */
    public static void cleanTerrace() {
        System.out.println("Terrace:");
        System.out.println("--------------------------");
        sweepTheFloor("Outside Broom");
        System.out.println("");
    }

    public static void cleanOffice() {
        System.out.println("Office:");
        System.out.println("--------------------------");
        declutter(); // a method call within a method is possible
        sweepTheFloor("Inside Broom");
        rearrange();
        System.out.println("");
    }

    public static void cleanBedroom() {
        System.out.println("Bedroom");
        System.out.println("--------------------------");
        declutter();
        sweepTheFloor("Inside Broom"); 
        rearrange();
        System.out.println("");
    }

    public static void cleanBathroom() {
        System.out.println("Bathroom");
        System.out.println("--------------------------");
        declutter();
        sweepTheFloor("Inside Broom");
        rearrange();
        System.out.println("");
    }

    public static void cleanKitchen() {
        System.out.println("Kitchen");
        System.out.println("--------------------------");
        declutter();
        sweepTheFloor("Inside Broom");
        rearrange();
        System.out.println("");
    }

    public static void cleanLivingRoom() {
        System.out.println("Living Room");
        System.out.println("--------------------------");
        declutter();
        sweepTheFloor("Inside Broom");
        rearrange();
        System.out.println("");
    }
}
