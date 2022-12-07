package lesson05;

public class CleanHouse {
    public static void main(String[] args) {
        
    }

    public static void sweepTheFloor(String supply1) {
        System.out.println("I am sweeping the floor with:  " + supply1);
    }

    public static void declutter() {
        
    }

    public static void cleanTerrace(String[] supplies) {
        sweepTheFloor("broom");
    }

    public static void cleanOffice(String[] supplies) {
        sweepTheFloor("broom");
    }

    public static void cleanBedroom(String[] supplies) {
        sweepTheFloor();
    }

    public static void cleanBathroom(String[] supplies) {
        sweepTheFloor();
    }

    
}
