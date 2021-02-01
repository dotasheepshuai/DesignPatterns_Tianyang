package DecoratorPattern.Decorators;

import DecoratorPattern.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.30;
    }
}
