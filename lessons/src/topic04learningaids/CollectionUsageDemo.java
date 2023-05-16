package topic04learningaids;

import java.util.ArrayList;
import java.util.Random;

import helpers.CollectionHelper;

public class CollectionUsageDemo {
    
    public static void main(String[] args) {
        
        // 1. Create a new ArrayList collection
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(); 

        // 2. Add items to the collection
        Random rand = new Random(); 
        for (int i = 0; i < 6; i++) {
            integerArrayList.add(rand.nextInt(10));
        }

        // 3. Use the collection helpers sum()
        int sum = CollectionHelper.sum(integerArrayList);

        // 4. Output the result
        System.out.println("Sum of my collection is: " + sum);
    }
}
