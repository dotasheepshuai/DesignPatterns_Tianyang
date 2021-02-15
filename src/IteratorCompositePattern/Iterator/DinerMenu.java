package IteratorCompositePattern.Iterator;

import IteratorCompositePattern.Composite.MenuItem;

import java.util.Iterator;

public class DinerMenu implements MenuInterface {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hot dog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(final String name, final String description, final boolean vegetarian, final double price) {
        final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems > MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
