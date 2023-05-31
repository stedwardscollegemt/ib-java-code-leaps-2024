package lesson13.mcdexample;

public class MainMeal extends FoodItem {
    
    final double PRICE_MARKUP = 0.26;

    @Override
    public double getPrice() {
        return super.price + (super.price * PRICE_MARKUP);
    }
}
