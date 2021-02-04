package FactoryPattern.Pizza;

import FactoryPattern.Factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        toppings.add(pizzaIngredientFactory.createCheese());
    }
}
