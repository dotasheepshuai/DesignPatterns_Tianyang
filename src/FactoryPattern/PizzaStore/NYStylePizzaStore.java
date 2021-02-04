package FactoryPattern.PizzaStore;

import FactoryPattern.Factory.NYPizzaIngredientFactory;
import FactoryPattern.Factory.PizzaIngredientFactory;
import FactoryPattern.Pizza.NYStyleCheesePizza;
import FactoryPattern.Pizza.NYStyleMeatPizza;
import FactoryPattern.Pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType pizzaType) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (pizzaType == PizzaType.Cheese) {
            return new NYStyleCheesePizza(pizzaIngredientFactory);
        } else if (pizzaType == PizzaType.Meat) {
            return new NYStyleMeatPizza(pizzaIngredientFactory);
        }
        return new NYStyleCheesePizza(pizzaIngredientFactory);
    }
}
