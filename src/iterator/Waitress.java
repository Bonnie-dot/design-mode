package iterator;

import java.util.Iterator;

public class Waitress {
    Menu dinerMenu;
    Menu PancakeHouseMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        PancakeHouseMenu = pancakeHouseMenu;
    }

    void printMenu() {
        iteratorMenu(this.dinerMenu.createIterator());
        iteratorMenu(this.PancakeHouseMenu.createIterator());

    }

    void iteratorMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem == null) {
                return;
            }
            System.out.println("name:" + menuItem.getName() + ",description:" + menuItem.getDescription() + ",price:" + menuItem.getPrice());
        }
    }
}
