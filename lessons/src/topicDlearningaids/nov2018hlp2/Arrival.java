package topicDlearningaids.nov2018hlp2;

public class Arrival {
    
    // -------- Attributes (Data) ----------------------------------------------------

    // The use of the private keyword is data-hiding which is related to *encapsulation*
    private Flight myFlight;
    private String sta; // Scheduled Time of Arrival hh:mm e.g. 01:10
    private int runway;
    private String gate;
    private int delay;
    private boolean landed;

    // -------- Methods ---------------------------------------------------------------

    public String getETA() {
        // assume there is code
        return "01:10"; // todo: obviously this is just an example
    }

    public int compareWith(String flightId) {
        if(this.myFlight.getId().equals(flightId)) {
            return 0;
        }
        return 1;
    }

    /**
     * compareTo is an out of the box method in the String class
     * provided by Java.
     * @param anotherArrival
     * @return
     */
    public int compareWith(Arrival anotherArrival) { // parameters are input part
        int result = this.getETA().compareTo(anotherArrival.getETA()); // process part
        return result; // output part
    }
}
