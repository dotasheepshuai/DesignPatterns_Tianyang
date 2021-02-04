package FactoryPattern.Pizza;

import FactoryPattern.Factory.PizzaIngredientFactory;

public class NYStyleMeatPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleMeatPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        name = "NY Style Meat Pizza";
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        toppings.add(pizzaIngredientFactory.createCheese());
    }
}
