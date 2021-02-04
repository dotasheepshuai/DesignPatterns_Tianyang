package FactoryPattern.Factory;

public interface PizzaIngredientFactory {
    String createDough();
    String createSauce();
    String createCheese();
}
