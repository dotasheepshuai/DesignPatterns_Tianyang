package FactoryPattern.Pizza;

import FactoryPattern.Factory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        toppings.add(pizzaIngredientFactory.createCheese());
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
