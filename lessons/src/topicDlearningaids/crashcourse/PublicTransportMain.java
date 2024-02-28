package topicDlearningaids.crashcourse;

public class PublicTransportMain {
    
    public static void main(String[] args) {

        // Define instance: A particular object in memory which was created using the new keyword and the constructor.
        //                  An instance has a state unique to it, and has behaviour to change its state.
        // TransportCard myCard = new TransportCard();

        Route r1 = new Route(72, "South Valletta");
        System.out.println(Route.getCount()); // prints out 1
        Route r2 = new Route(72, "North Valletta");
        System.out.println(Route.getCount()); // prints out 2


    }
}
