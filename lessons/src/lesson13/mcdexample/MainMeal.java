package lesson13.mcdexample;

public class MainMeal extends FoodItem {
    
    final double PRICE_MARKUP = 0.26;

    Sandwich sandwich;

    DrinkItem drink;

    public MainMeal(Sandwich sandwich) {
        super(sandwich.code, sandwich.price);
        this.drink = new DrinkItem("Coca Cola");
    }

    @Override
    public double getPrice() {
        this.price = this.sandwich.price + (this.sandwich.price * PRICE_MARKUP);
        return this.price;
    }
}
