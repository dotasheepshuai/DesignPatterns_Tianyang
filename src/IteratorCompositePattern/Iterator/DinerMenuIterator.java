package IteratorCompositePattern.Iterator;

import java.util.Iterator;

public class DinerMenuIterator<MenuItem> implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(final MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return (position <= items.length) && (items[position] != null);
    }

    @Override
    public Object next() {
        final MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
