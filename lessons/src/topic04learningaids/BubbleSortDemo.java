package topic04learningaids;

import helpers.ArrayHelper;

public class BubbleSortDemo {
    public static void main(String[] args) {
        
        double[] myArray = {4.5, 6.7, 8.9, 1.2};

        myArray = ArrayHelper.bubbleSort2(myArray);

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + ", ");
        }
    }
}
