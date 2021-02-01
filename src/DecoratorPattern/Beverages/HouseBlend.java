package DecoratorPattern.Beverages;

import DecoratorPattern.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend, " + getSize();
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}
