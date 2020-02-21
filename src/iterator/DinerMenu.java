package iterator;

public class DinerMenu implements Menu {
    static final int MAX_TEAMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_TEAMS];
        addItems("Vegetarian BLT1", "Fakin with lettuce", true, 23.3);
        addItems("Vegetarian BLT2", "Fakin with lettuce", true, 23.3);
        addItems("Vegetarian BLT3", "Fakin with lettuce", true, 23.3);
    }

    public void addItems(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_TEAMS) {
            System.out.println("Sorry,menu is full!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }


    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
