package iterator;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator{

    MenuItem[] menuItems;
    int position=0;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar rightNow = Calendar.getInstance();
        position=rightNow.get(Calendar.DAY_OF_WEEK);
    }

    @Override
    public boolean hasNext() {
        if (position>=menuItems.length||menuItems[position]==null){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position=position+2;
        return menuItem;
    }
}
