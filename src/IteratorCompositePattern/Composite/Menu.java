package IteratorCompositePattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    public void add(final MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(final MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(final int i) {
        return menuComponents.get(i);
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("------------------------");
        for (final MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
