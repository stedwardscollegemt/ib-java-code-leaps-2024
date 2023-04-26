package topicDlearningaids.caitlin;

public class IdealGasEquation {
    
    /**
     * Data
     */
    public static final double R = 8.314; // the ideal gas constant

    public double v; // volume

    public double t; // temperature

    public double n; // number of moles

    public double p; // pressure

    public double result;

    /**
     * Constructors 
     */
    public IdealGasEquation(double v, double t, double n, double p) { // we pass param values to the cookie cutter, to create an equation with the correct state
        if (v >= 0) {
            v = v; // this means of the current member
        }
        // todo... update the rest of the properties
    }

    /**
     * Actions
     */
    public void calc() {
        // todo flowchart to determine how the formula will look
        // dependending on the values given, the formula changes shape
    }
}
