package TemplateMethodPattern;

/**
 * Template Method Pattern - defines the skeleton of an algorithm in a method, deferring some steps to
 * subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing
 * the algorithm's structure
 *
 * Design Principle: Don't call us, we'll call you
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        final Tea tea = new Tea();
        final Coffee coffee = new Coffee();

        System.out.println("\nPreparing tea...\n");
        tea.prepareRecipe();
        System.out.println("\nPreparing coffee...\n");
        coffee.prepareRecipe();
    }
}
