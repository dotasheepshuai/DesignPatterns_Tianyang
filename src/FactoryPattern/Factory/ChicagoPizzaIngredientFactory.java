package FactoryPattern.Factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "ExtraThickCrustDough";
    }

    @Override
    public String createSauce() {
        return "PlumTomatoSauce";
    }

    @Override
    public String createCheese() {
        return "ShreddedMozzarellaCheese";
    }
}
