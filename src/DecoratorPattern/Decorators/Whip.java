package DecoratorPattern.Decorators;

import DecoratorPattern.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.40;
    }
}
