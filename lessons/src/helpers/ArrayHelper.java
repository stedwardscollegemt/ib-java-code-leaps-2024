package helpers;

/**
 * This helper class was created by the Year 12s of the year 2021/22 to help
 * people learn about arrays.
 */
public class ArrayHelper {
    /**
     * Fill an array with the same value.
     * E.g. { , , , } -1 ==> { -1, -1, -1, -1} 
     * @param arr
     * @param value
     * @return arr
     */
    public static int[] fill(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    /**
     * Replace instances of find value with a replacement value starting at a fromIndex.
     * E.g. {3, 4, 5, 5, 2, 1} 5  9 ==> {1, 4, 5, 9, 2, 1}
     * @param arr
     * @param find
     * @param replace
     * @param fromIndex
     * @return arr
     */
    public static int[] replace(int[] arr, int find, int replace, int fromIndex) {
        for(int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == find) {
                arr[i] = replace;
            }
        }
        return arr;
    }
    
    /**
     * Insert a value at a particular index in an array
     * E.g. {5, 6, 7} 2 0 ==> {2, 6, 7}
     * @param arr
     * @param index
     * @return arr
     */
    public static int[] insertAt(int[] arr, int value, int index) throws IndexOutOfBoundsException {
        arr[index] = value;
        return arr;
    }
    
    /**
     * Daniil
     * Test whether an array contains a specific value.
     * E.g. {1, 4, 6} 6 ==> true | 7 ==> false
     * @param arr
     * @param value
     * @return if value in arr ==> true else ==> false
     */
    public static boolean contains(int[] arr, int value) {
        boolean flag = false;
        int position = find(arr, value);
        if (position != -1) {
            flag = true;
        }
        return flag;
    }

    /**
     * Bill
     * Calculate average value of array elements.
     * E.g. {1, 2, 3} ==> 3
     * @param arr
     * @return average
     */
    public static int average(int[] arr) {
        int average = sum(arr) / arr.length;
        return average;
    }

    /**
     * Bill
     * Calculate the total sum of array elements.
     * E.g. {1, 2, 3} => 6
     * @param arr
     * @return sum
     */
    public static int sum(int[] arr) {
        int sum = 0;
        // Using special for loop by Java because I don't need to know the index
        for (int i : arr) {
           sum = sum + i;
        }
        return sum;
    }

    /**
     * Mike
     * Find the target in the array
     * E.g. {1, 5, 6, 7} 7 ==> 3, 8 ==> -1
     * @param arr
     * @return found? target index | -1
     */
    public static int find(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                return index; // breaks loop
            }
        }
        return index;
    }

    /**
     * Finn
     * Get the largest value in the array.
     * @param arr
     * @return max
     */
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Finn
     * Get the smallest value in the array.
     * @param arr
     * @return min
     */
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)  {  
            if (arr[i] < min) {
                min = arr[i];
            }
        }  
        return min;
    }

    /**
     * Truncate an array at a cut off index.
     * E.g. {1, 2, 3, -1, -1, -1} 2 ==> {1, 2, 3}
     * @param arr
     * @param cutOffIndex
     * @return
     */
    public static int[] truncate(int[] arr, int cutOffIndex) {
        int size = cutOffIndex + 1;
        int[] truncated = new int[size];
        for(int i = 0; i < size; i++) {
            truncated[i] = arr[i];
        }
        return truncated;
    }

    /**
     * Anirudh
     * Remove duplicate elements in an array.
     * E.g. {1, 3, 1, 7, 9} ==> {1, 3, 7, 9}
     * @param arr
     * @return
     */
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int cutOffIndex = -1;
        int size =  arr.length;
        for(int i = 0; i < size; i++) {
            boolean flag = contains(temp, arr[i]);
            if(flag == false) {
                cutOffIndex++;
                temp[cutOffIndex] = arr[i];
            }
        }
        return truncate(temp, cutOffIndex);
    }

    /**
     * Very important to study
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        int iterations = 1;
        while (iterations < arr.length) {
            int j = 0;
            while (j <= (arr.length - 2)) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            iterations++;
            printElements(arr);
        }
        return arr;
    }

    public static void printElements(int[] arr) {
        for(int e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public static void printElements(double[] arr) {
        for(double e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    /**
     * You need to use this for your Banking App assignment
     * @param arr
     */
    public static void printElements(String[] arr) {
        for(String e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }
}