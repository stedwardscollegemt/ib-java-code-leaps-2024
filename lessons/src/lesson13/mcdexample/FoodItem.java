package lesson13.mcdexample;

public class FoodItem {
    
    protected String code; // "CHB MCH" "MCN"

    protected double price;

    // Method
    public FoodItem(String code, double price) {
        
    }


    /** Accessor */
    protected void setPrice(double price) {
        this.price = price;
    } 
    
    public double getPrice() {
        return this.price;
    }
}
