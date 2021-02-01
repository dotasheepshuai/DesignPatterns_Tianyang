package DecoratorPattern.Beverages;

import DecoratorPattern.Beverage;

public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "Decaf, " + getSize();
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}
