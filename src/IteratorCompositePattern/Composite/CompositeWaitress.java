package IteratorCompositePattern.Composite;

public class CompositeWaitress {
    private MenuComponent rootMenu;

    public CompositeWaitress(final MenuComponent rootMenu) {
        this.rootMenu = rootMenu;
    }

    public void printMenu() {
        rootMenu.print();
    }
}
