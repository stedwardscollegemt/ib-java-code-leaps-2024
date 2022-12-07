package lesson05;

public class CleanHouse {
    public static void main(String[] args) {
        
    }

    public static void sweepTheFloor(String broom) {
        System.out.println("I am sweeping the floor with:  " + broom);
    }

    public static void declutter() {
        System.out.println("I am decluttering with my hands.");
    }

    public static void rearrange() {
        System.out.println("I am rearranging with my hands.");
    }

    public static void cleanTerrace(String[] supplies) {
        sweepTheFloor("Outside Broom");
    }

    public static void cleanOffice(String[] supplies) {
        declutter();
        sweepTheFloor("Inside Broom");
        rearrange();
    }

    public static void cleanBedroom(String[] supplies) {
        declutter();
        sweepTheFloor("Inside Broom"); 
        rearrange();
    }

    public static void cleanBathroom(String[] supplies) {
        declutter();
        sweepTheFloor("Inside Broom");
    }
}
