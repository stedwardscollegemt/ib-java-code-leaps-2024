package helpers;

import java.util.Collection;
import java.util.Iterator;

/**
 * 4.3.11 Construct algorithms using the access methods of a collection
 */
public class CollectionHelper {
    
    public static int sum(Collection<Integer> col) {
        Integer sum = 0;
        // get the iterator from the collection
        Iterator<Integer> iterator = col.iterator();

        while(iterator.hasNext()) {
            Integer nextInt = iterator.next();
            sum = sum + nextInt;
        }
        
        return (int) sum;
    }
}
