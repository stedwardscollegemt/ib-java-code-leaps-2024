package topicDlearningaids.nov2018p2;

import java.util.Iterator;
import java.util.LinkedList;

public class FlightManagement {

    private static Arrival[] inbound = new Arrival[200];
    
    public static void main(String[] args) {

        // ** Outline the advantage of using a library **
        // - We do not have to replicate standard functionality
        // - Even if we want to, using the library is probably better anyway because they are probably tested
        // - It only took me a quick google search and ten seconds to have a robust collection of Arrival (an object I created)
        LinkedList<Arrival> runway1 = new LinkedList<Arrival>();

        
    }

    public static LinkedList<Arrival> mergeLists(LinkedList<Arrival> r1, LinkedList<Arrival> r2) {
        Iterator<Arrival> iterator = r2.iterator();
        while(iterator.hasNext()) {
            Arrival current = iterator.next();
            r1.add(current);
        }
        return r1;
    }

    public static void showDelayed(String t) {
        // arrays love for loops
        // for each Arrival in array
        for(int i = 0; i < inbound.length; i++) {
            // Revision to Topic 4 - array access
            Arrival arrival = inbound[i];
            // if arrival has not landed AND arrival.getETA() is less than t
            // then output
        }
    }

    private static int search(String flightID)
    { 
        int index = 0; 
        // loop through all Arrival objects in inbound
        while (inbound[index].compareWith(flightID) != 0) {
            // get the next instance of Arrival
            index++;
        }
        // returns the index of the Arrival object with flightID
        return index;        
    }
}
