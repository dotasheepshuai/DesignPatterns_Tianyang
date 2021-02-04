package FactoryPattern.PizzaStore;

import FactoryPattern.Factory.ChicagoPizzaIngredientFactory;
import FactoryPattern.Factory.PizzaIngredientFactory;
import FactoryPattern.Pizza.ChicagoStyleCheesePizza;
import FactoryPattern.Pizza.ChicagoStyleMeatPizza;
import FactoryPattern.Pizza.Pizza;

public class ChicagoStylePizzaStore extends  PizzaStore {

    @Override
    Pizza createPizza(PizzaType pizzaType) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (pizzaType == PizzaType.Cheese) {
            return new ChicagoStyleCheesePizza(pizzaIngredientFactory);
        } else if (pizzaType == PizzaType.Meat) {
            return new ChicagoStyleMeatPizza(pizzaIngredientFactory);
        }
        return new ChicagoStyleCheesePizza(pizzaIngredientFactory);
    }
}
