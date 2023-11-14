package lesson13.mcdexample;

public class SideItem extends FoodItem {
    
    // Allow our customers order fries without salt
    String comment;

    /**
     * Example of an overloaded constructor
     * @param code
     * @param price
     */
    public SideItem(String code, double price) {
        super(code, price);
        this.comment = "";
    }

    /**
     * Example of an overloaded constructor
     * @param code
     * @param price
     * @param comment
     */
    public SideItem(String code, double price, String comment) {
        super(code, price);
        this.comment = comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
