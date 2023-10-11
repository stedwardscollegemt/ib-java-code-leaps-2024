package lesson11;

public class FlourCupsGramsConvert {
    
    private final double FLOUR_DENSITY = 0.762;
    private final double COEFFICIENT = 236.588;

    private int numberOfCups;

    public FlourCupsGramsConvert(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public double getNumberOfCups() {
        return this.numberOfCups;
    }

    public double getGrams() {
        return numberOfCups * COEFFICIENT * FLOUR_DENSITY;
    }
}
