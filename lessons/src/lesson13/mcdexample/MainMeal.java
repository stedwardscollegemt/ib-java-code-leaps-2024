package lesson13.mcdexample;

public class MainMeal extends FoodItem {
    
    final double PRICE_MARKUP = 0.26;

    Sandwich sandwich;

    DrinkItem drink;

    @Override
    public double getPrice() {
        this.price = this.sandwich.price + (this.sandwich.price * PRICE_MARKUP);
        return this.price;
    }
}
