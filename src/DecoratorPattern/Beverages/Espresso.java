package DecoratorPattern.Beverages;

import DecoratorPattern.Beverage;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso, " + getSize();
    }

    @Override
    public double getCost() {
        return 2.5;
    }
}
