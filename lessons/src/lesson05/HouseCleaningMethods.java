package lesson05;

public class HouseCleaningMethods {
    
    /**
     * The main() is called automatically when we click on Run.
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("Here is a process of cleaning the house.");

        // we need to call a method we defined for it to run
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
        System.out.println("I am sweeping the floor with:  " + broom);
    }

    public static void declutter() {
        System.out.println("I am decluttering with my hands.");
    }

    public static void rearrange() {
        System.out.println("I am rearranging with my hands.");
    }

    /**
     * ---- Methods For Cleaning Zones ---------------------------------------------
     */
    public static void cleanTerrace() {
        System.out.println("Cleaning Terrace:");
        sweepTheFloor("Outside Broom");
    }

    public static void cleanOffice() {
        System.out.println("Cleaning Office:");
        declutter(); // a method call within a method is possible
        sweepTheFloor("Inside Broom");
        rearrange();
    }

    public static void cleanBedroom() {
        System.out.println("Cleaning Bedroom");
        declutter();
        sweepTheFloor("Inside Broom"); 
        rearrange();
    }

    public static void cleanBathroom() {
        System.out.println("Cleaning Bathroom");
        declutter();
        sweepTheFloor("Inside Broom");
        rearrange();
    }

    public static void cleanKitchen() {
        System.out.println("Cleaning Kitchen");
        declutter();
        sweepTheFloor("Inside Broom");
        rearrange();
    }

    public static void cleanLivingRoom() {
        System.out.println("Cleaning Living Room");
        declutter();
        sweepTheFloor("Inside Broom");
        rearrange();
    }
}
