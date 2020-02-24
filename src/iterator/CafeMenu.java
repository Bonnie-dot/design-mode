package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("veggie Burger and Air Fries1", "Veggie burger on a whole wheat him", true, 3.99);
        addItem("veggie Burger and Air Fries2", "Veggie burger on a whole wheat him", true, 3.99);
        addItem("veggie Burger and Air Fries3", "Veggie burger on a whole wheat him", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
