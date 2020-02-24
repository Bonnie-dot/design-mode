package composite;

public class WaitressTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce,and a slice of sourdough bread",
                true, 3.89));
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with flakey crust,topped with vanilla ice cream"
                , true, 1.59));
        cafeMenu.add(new MenuItem("cafe", "this is black cafe", false, 20));
        dessertMenu.add(new MenuItem("dessert", "this is delicious dessert", false, 40));
        Waitress waitress = new Waitress(allMenus);
//        waitress.print();

//        CompositeIterator compositeIterator = new CompositeIterator(dessertMenu.createIterator());
//        System.out.println(compositeIterator.next());
//        System.out.println(compositeIterator.next());
//        System.out.println(compositeIterator.next());
        waitress.printVegetarianMenu();
    }
}
