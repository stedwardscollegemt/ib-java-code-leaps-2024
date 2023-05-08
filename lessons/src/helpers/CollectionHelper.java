package helpers;

import java.util.Collection;
import java.util.Iterator;

/**
 * 4.3.11 Construct algorithms using the access methods of a collection
 */
public class CollectionHelper {
    
    /**
     * Practice the running total
     * 
     * @param col
     * @return
     */
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

    /**
     * Practice the linear search using collections
     * @param col
     * @param target
     * @return
     */
    public static int findPositionOf(Collection<Integer> col, int target) {
        // get the iterator from the collection
        Iterator<Integer> iterator = col.iterator();
        
        int position = -1;
        while(iterator.hasNext()) {
            Integer nextInt = iterator.next();
            position = position + 1;
            if (nextInt == target) {
                return position;
            }
        }

        return -1; // if we reach here it means we did not find
    }
}
