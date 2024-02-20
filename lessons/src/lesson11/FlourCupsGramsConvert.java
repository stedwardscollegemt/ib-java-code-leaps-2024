package lesson11;

public class FlourCupsGramsConvert {
    
    // ---- Data (State) ---------------------------------------------
    // source: https://www.webstaurantstore.com/blog/4372/how-to-measure-flour.html#:~:text=1%20Cup%20of%20Flour%20in,%3A%20360%20g%20(12.75%20oz)
    private final double GRAMS_PER_CUP = 120.00;

    private int numberOfCups;

    // ---- Constructor ---------------------------------------------
    public FlourCupsGramsConvert(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    // ---- Methods -------------------------------------------------
    public double getNumberOfCups() {
        return this.numberOfCups;
    }

    public double getGrams() {
        return numberOfCups * GRAMS_PER_CUP;
    }
}
