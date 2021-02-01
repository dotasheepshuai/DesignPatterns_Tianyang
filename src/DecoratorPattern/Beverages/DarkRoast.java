package DecoratorPattern.Beverages;

import DecoratorPattern.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        setSize(size);
    }

    @Override
    public String getDescription() {
        return "DarkRoast, " + getSize();
    }

    @Override
    public double getCost() {
        if (getSize() == Size.TALL) {
            return 2.0;
        } else if(getSize() == Size.GRANDE) {
            return 2.5;
        } else if(getSize() == Size.VENTI) {
            return 3.0;
        }
        return 0;
    }
}
