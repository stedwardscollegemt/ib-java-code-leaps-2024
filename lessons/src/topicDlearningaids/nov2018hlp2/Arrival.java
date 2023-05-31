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

    public int compareWith(String flightId) {
        if(this.myFlight.getId().equals(flightId)) {
            return 0;
        }
        return 1;
    }

    public int compareWith(Arrival anotherArrival) {

    }
}
