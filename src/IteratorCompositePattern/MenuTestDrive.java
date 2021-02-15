package IteratorCompositePattern;

import IteratorCompositePattern.Composite.CompositeWaitress;
import IteratorCompositePattern.Composite.Menu;
import IteratorCompositePattern.Composite.MenuComponent;
import IteratorCompositePattern.Composite.MenuItem;
import IteratorCompositePattern.Iterator.*;
import IteratorCompositePattern.Iterator.IteratorWaitress;

import java.util.Arrays;
import java.util.List;

/**
 * The Iterator Pattern - provides a way to access the elements of an aggregated object sequentially without exposing
 * its underlying representation
 *
 * The Composite Pattern - allows you to compose objects into tree structures to represent part-whole hierarchies.
 * Composite lets clients treat individual objects and compositions of objects uniformly
 *
 * Design Principle - A class should have only one reason to change
 *
 */
public class MenuTestDrive {
    public static void main(String args[]) {
        /**
         * Iterator Pattern
         */
        System.out.println("--- Iterator Pattern ---\n");
        final MenuInterface iteratorPancakeHouseMenu = new PancakeHouseMenu();
        final MenuInterface iteratorDinerMenu = new DinerMenu();
        final MenuInterface iteratorCafeMenu = new CafeMenu();
        final List<MenuInterface> iteratorMenuList = Arrays.asList(iteratorPancakeHouseMenu, iteratorDinerMenu, iteratorCafeMenu);

        final IteratorWaitress iteratorWaitress = new IteratorWaitress(iteratorMenuList);
        iteratorWaitress.printMenu();

        /**
         * Composite Pattern
         */
        System.out.println("--- Composite Pattern ---\n");
        final MenuComponent compositePancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        final MenuComponent compositeDinerMenu = new Menu("DINER MENU", "Lunch");
        final MenuComponent compositeCafeMenu = new Menu("CAFE MENU", "Dinner");
        final MenuComponent compositeDessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        final MenuComponent compositeRootMenu = new Menu("ROOT MENU", "All menus combined");
        compositeRootMenu.add(compositePancakeHouseMenu);
        compositeRootMenu.add(compositeDinerMenu);
        compositeRootMenu.add(compositeCafeMenu);
        compositeDinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        compositeDinerMenu.add(compositeDessertMenu);
        compositeDessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

        final CompositeWaitress compositeWaitress = new CompositeWaitress(compositeRootMenu);
        compositeWaitress.printMenu();
    }
}
