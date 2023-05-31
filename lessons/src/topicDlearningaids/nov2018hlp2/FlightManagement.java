package topicDlearningaids.nov2018hlp2;

import java.util.Iterator;
import java.util.LinkedList;

public class FlightManagement {
    
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
}
