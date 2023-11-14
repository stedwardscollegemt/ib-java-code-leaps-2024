package lesson13.mcdexample;

public class Sandwich extends FoodItem {

    // Data (Attributes) --------------------------------
    private static final double PREMIUM_PRICE = 7.25;
    private static final double STANDARD_PRICE = 6.25;

    private final String NO_TOMATOES = "NT";
    
    String[] grillOrder = new String[3];

    boolean isPremium;

    // Constructor
    public Sandwich(String code, boolean isPremium) {
        super(code, STANDARD_PRICE);

        if(isPremium) {
            super.setPrice(PREMIUM_PRICE);
        }  
    }

    // Behaviour (Methods) ------------------------------
    public void printKitchenOrder() {
        String order = this.code + ": ";
        for (int i = 0; i < grillOrder.length; i++) {
            if(grillOrder[i] == null) {
                return;
            } else {
                order = order + grillOrder[i] + " ";
            }
        }
    }
}
