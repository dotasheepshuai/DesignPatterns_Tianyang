package TemplateMethodPattern;

abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water\n");
    }

    void pourInCup() {
        System.out.println("Pouring into cup\n");
    }

    void hook() {

    }
}
