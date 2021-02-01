package DecoratorPattern.Decorators;

import DecoratorPattern.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.20;
    }
}
