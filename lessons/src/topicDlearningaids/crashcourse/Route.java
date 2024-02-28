package topicDlearningaids.crashcourse;

import java.util.ArrayList;

public class Route {

    /**
     * ArrayLists are a type of collection (Topic 4) in Java.
     * It manages a group of arrays, where each array stores String values.
     */
    private ArrayList<String> stops = new ArrayList<String>();

    // Variable for the route number
    private int number;

    // Variable for the route name
    private String name;

    // Constructor
    public Route(int number, String name) {
        this.number = number;
        this.name = name;
    }

    // Accessor methods
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
}
