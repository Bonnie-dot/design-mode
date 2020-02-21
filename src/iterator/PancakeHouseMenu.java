package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B Pancake Breakfast1", "Pancake with scrambled egg,and toast", true, 2.99);
        addItem("K&B Pancake Breakfast2", "Pancake with scrambled egg,and toast", true, 2.99);
        addItem("K&B Pancake Breakfast3", "Pancake with scrambled egg,and toast", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return getMenuItems().iterator();
    }
}
