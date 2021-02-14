package TemplateMethodPattern;

class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea\n");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon\n");
    }

    @Override
    void hook() {
        System.out.println("Hook tea\n");
    }
}
