package topic04learningaids;

/**
 * 4.2.1 Describe the characteristics of standard 1D array algorithms
 * 4.3.11 Construct algorithms that use arrays and access methods
 */
public class LinearSearch {
    
    /**
     * 
     * @param numarr
     * @param target
     * @return
     */
    public static int search(int[] numarr, int target) {
        // TODO: implement the following pseudocode
        // loop for index from 0 to numarr.length
        //    if target is equal to numarr[index] then
        //       return index
        //    end if
        // end loop
        return -1; // not found because -1 is not an index that exists
    }

    public static int search(String[] strarr, String target) {
        return -1;
    }

    /**
     * HL Extension Only
     * 
     * @param numarr
     * @param target
     * @return
     */
    public static int[] search2D(int[][] numarr, int target) {
        int[] position = {-1, -1};
        for(int i = 0; i < numarr.length; i++) {
            for(int j = 0; j < numarr[0].length; j++) {
                if (numarr[i][j] == target) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

    /**
     * HL Extension Only
     * @param strarr
     * @param target
     * @return
     */
    public static int[] search2D(String[][] strarr, String target) {
        int[] position = {-1, -1};
        for(int i = 0; i < strarr.length; i++) {
            for(int j = 0; j < strarr[0].length; j++) {
                if (strarr[i][j].equals(target)) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }
}
