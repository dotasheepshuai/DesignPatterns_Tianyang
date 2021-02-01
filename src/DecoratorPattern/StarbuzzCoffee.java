package DecoratorPattern;

import DecoratorPattern.Beverages.DarkRoast;
import DecoratorPattern.Beverages.Decaf;
import DecoratorPattern.Beverages.Espresso;
import DecoratorPattern.Beverages.HouseBlend;
import DecoratorPattern.Decorators.Milk;
import DecoratorPattern.Decorators.Mocha;
import DecoratorPattern.Decorators.Soy;
import DecoratorPattern.Decorators.Whip;

/**
 * Decorator - Attach additional responsibilities to an object dynamically. Decorators provide a
 * flexible alternative to subclassing for extending functionality
 *
 * Design Principle 5: Classes should be open for extension, but closed for modification
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        Beverage beverage1 = new Milk(new Whip(new Mocha(new DarkRoast(Beverage.Size.TALL))));
        System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());

        Beverage beverage1_1 = new Milk(new Whip(new Mocha(new DarkRoast(Beverage.Size.VENTI))));
        System.out.println(beverage1_1.getDescription() + " $" + beverage1_1.getCost());

        Beverage beverage2 = new Milk(new Milk(new Soy(new HouseBlend())));
        System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());

        Beverage beverage3 = new Milk(new Soy(new Decaf()));
        System.out.println(beverage3.getDescription() + " $" + beverage3.getCost());
    }
}
