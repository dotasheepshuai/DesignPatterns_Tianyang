package IteratorCompositePattern.Iterator;

import IteratorCompositePattern.Composite.MenuItem;

import java.util.Iterator;
import java.util.List;

public class IteratorWaitress {
    private List<MenuInterface> menus;

    public IteratorWaitress(final List<MenuInterface> menus) {
        this.menus = menus;
    }

    public void printMenu() {
       final Iterator<MenuInterface> menuIterator = menus.iterator();
       while(menuIterator.hasNext()) {
           final MenuInterface menu = menuIterator.next();
           printMenu(menu.createIterator());
       }
    }

    public void printMenu(Iterator<MenuItem> menuItemIterator) {
        while(menuItemIterator.hasNext()) {
            final MenuItem menuItem = menuItemIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
