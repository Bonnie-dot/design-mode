package iterator;

import java.util.ArrayList;

public class WaitressTest {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList menus=new ArrayList();
        menus.add(dinerMenu);
        menus.add(pancakeHouseMenu);
        menus.add(cafeMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
