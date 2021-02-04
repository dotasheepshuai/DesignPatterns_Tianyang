package FactoryPattern.Factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String createDough() {
        return "ThinCrustDough";
    }

    @Override
    public String createSauce() {
        return "MarinaraSauce";
    }

    @Override
    public String createCheese() {
        return "ReggianoCheese";
    }
}
