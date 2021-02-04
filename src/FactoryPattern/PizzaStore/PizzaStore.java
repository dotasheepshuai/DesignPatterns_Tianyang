package FactoryPattern.PizzaStore;

import FactoryPattern.Pizza.Pizza;

public abstract class PizzaStore {
    public enum PizzaType { Cheese, Meat }

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(PizzaType pizzaType);
}
