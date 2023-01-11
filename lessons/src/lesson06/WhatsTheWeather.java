package lesson06;

import helpers.Keyboard;

public class WhatsTheWeather {
    
    public static void main(String[] args) {

        // let us agree on a number chart
        final int SUNNY = 0;
        final int CLOUDY = 1;
        final int RAINY = 2;
        final int SNOWY = 3;
        final int THUNDER = 4;

        // declare all the arrays we need
        char[] weekDays = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};
        float[] temperatures = new float[7];
        int[] humidity = new int[7];
        int[] conditions = new int[7];

        // record all temperature data for each day of the week
        for (int i = 0; i <= 6; i++) {
            System.out.println("Record the temperature data for " + weekDays[i]);
            System.out.println("--------------------------------------------");

            // ask user to input temperature of the day
            System.out.print("Enter temperature value:  ");
            temperatures[i] = Keyboard.readFloat();
            System.out.println("");

            // ask user to input humidity of the day
            System.out.print("Enter humidity value:  ");
            humidity[i] = Keyboard.readInt();
            System.out.println("");

            // ask user to input conditions of the day
            System.out.println("Enter the condition value using the following code.  ");
            System.out.println("[0] Sunny; [1] Cloudy; [2] Rainy; [3] Snowy; [4] Thunder.");
            conditions[i] = Keyboard.readInt();
            System.out.println("");
        }

        // data entry is complete
        System.out.println("Thank you for recording the data.");
    }
}
