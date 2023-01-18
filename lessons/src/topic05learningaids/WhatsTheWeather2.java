package topic05learningaids;

public class WhatsTheWeather2 {
    
    public static void main() {
        
        // declare all the arrays we need
        char[] weekDays = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};
        
        /**
         * All the arrays have a size of 7 by 24 (7 rows and 24 columns)
         * The rows represent the weekdays.
         * The columns represent each hour of every day
         */
        float[][] temperatures = new float[7][24];
        int[][] humidity = new int[7][24];
        int[][] conditions = new int[7][24];

        // Practice inserting data for a particular day and hour...
        // Right now it is Wednesday 09:11
        // Index for our row is 2
        // Index for the hour between 09:00 and 10:00 is 10
        temperatures[2][10] = 17.0f; // According to Google right now :)
    }
}
