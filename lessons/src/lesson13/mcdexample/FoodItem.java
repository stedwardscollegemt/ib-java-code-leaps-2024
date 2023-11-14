package lesson13.mcdexample;

public abstract class FoodItem {
    
    protected String code; // "CHB MCH" "MCN"

    protected double price;

    // Method
    public FoodItem(String code, double price) {
        this.code = code;
        this.price = price;
    }

    /** Accessor */
    protected void setPrice(double price) {
        this.price = price;
    } 
    
    public double getPrice() {
        return this.price;
    }
}
