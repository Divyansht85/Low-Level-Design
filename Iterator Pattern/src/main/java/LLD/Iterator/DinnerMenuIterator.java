package LLD.Iterator;

import LLD.MenuItem;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position=0;
    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    @Override
    public MenuItem next() {
        MenuItem menuItem=items[position];
        position++;
        return menuItem;
    }
    @Override
    public boolean hasNext() {
        return position<items.length && items[position]!=null;
    }
}
