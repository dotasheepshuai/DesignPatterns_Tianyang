package FactoryPattern;

import FactoryPattern.Pizza.Pizza;
import FactoryPattern.PizzaStore.ChicagoStylePizzaStore;
import FactoryPattern.PizzaStore.NYStylePizzaStore;
import FactoryPattern.PizzaStore.PizzaStore;

/**
 * The Factory Method Pattern - defines an interface for creating an object, but lets subclasses
 * decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses
 *
 * Abstract Factory - provides an interface for creating a families of related or dependent objects
 * without specifying their concrete classes
 *
 * Design Principle 6: Depend upon abstractions. Do not depend upon concrete classes
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStylePizzaStore.orderPizza(PizzaStore.PizzaType.Cheese);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStylePizzaStore.orderPizza(PizzaStore.PizzaType.Meat);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
     }
}
