package iterator;

public class DinerMenuIterator implements Iterator {

    private final MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.length && menuItems[position] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}