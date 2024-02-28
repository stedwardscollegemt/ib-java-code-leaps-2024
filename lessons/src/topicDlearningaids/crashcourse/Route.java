package topicDlearningaids.crashcourse;

import java.util.ArrayList;

public class Route {

    /**
     * Define static:
     * Static is a special modifier in Java that indicates that a variable or method
     * is not tied to a particular instance, but rather the class as a type. So anything
     * marked as such can be accessed directly using the class name. An application of this
     * is keeping track of the number of instances created.
     **/
    private static int count;

    /**
     * ArrayLists are a type of collection (Topic 4) in Java.
     * It manages a group of arrays, where each array stores String values.
     */
    private ArrayList<String> stops = new ArrayList<String>();

    // Variable for the route number
    private int number;

    // Variable for the route name
    private String name;

    private String currentStop;

    // Constructor
    public Route(int number, String name) {
        this.number = number;
        this.name = name;
        Route.count = Route.count + 1;
    }

    // Accessor methods
    public static int getCount() {
        return Route.count;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    // Construct a method to calculate the fair for each stop.
    // The method will accept as parameters getOn, getOff stops.
    // The method will give back the total fair, each stop is 50c.
    public double calculateFair(String getOn, String getOff) {
        
        // local variables
        double pricePerStop = 0.5;
        double priceForJourney = 0;
        int numberOfStops = 0;
        boolean count = false;
       
        // looping through a collection
        for(String stop : stops) {
            // decision statements
            if (stop.equals(getOn)) {
                count = true;
            }
            if (count == true) {
                numberOfStops = numberOfStops + 1;
            }
            if (stop.equals(getOff)) {
                count = false;
            }
        }

        // simple calculations
        priceForJourney = numberOfStops * pricePerStop;
        
        // spit out a value
        return priceForJourney;
    }

    public String getCurrentStop() {
        return this.currentStop;
    }
}
