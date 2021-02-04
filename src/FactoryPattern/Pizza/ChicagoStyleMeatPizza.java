package FactoryPattern.Pizza;

import FactoryPattern.Factory.PizzaIngredientFactory;

public class ChicagoStyleMeatPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStyleMeatPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        name = "Chicago Style Meat Pizza";
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        toppings.add(pizzaIngredientFactory.createCheese());
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
