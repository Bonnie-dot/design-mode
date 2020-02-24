package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus=menus;
    }

    void printMenu() {
        Iterator iterator = menus.iterator();
        while (iterator.hasNext()){
            Menu menu = (Menu) iterator.next();
            iteratorMenu(menu.createIterator());
        }
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
