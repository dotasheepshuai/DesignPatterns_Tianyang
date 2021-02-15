package IteratorCompositePattern.Iterator;

import IteratorCompositePattern.Composite.MenuItem;

import java.util.Iterator;

public interface MenuInterface {
    public Iterator<MenuItem> createIterator();
}
