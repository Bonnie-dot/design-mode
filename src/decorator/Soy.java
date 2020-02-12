package decorator;

import java.util.HashMap;
import java.util.Map;

public class Soy extends CondimentDecorator {


    Beverage beverage;
    Map sizeMapPrice;
    String size;

    public Soy(Beverage b) {
        description="Soy";
        this.beverage=b;
        sizeMapPrice=Map.ofEntries(Map.entry(beverage.sizes[0],0.1),Map.entry(beverage.sizes[1],0.1)
                ,Map.entry(beverage.sizes[2],0.1));
        size=b.getSize();
    }

    @Override
    public String getDescription() {
        return description+beverage.description;
    }

    @Override
    public void setSize(String s) {
        beverage.getSize();
    }

    @Override
    public double cost() {
        Object sizePrice=sizeMapPrice.get(beverage.getSize());
        return .50+beverage.cost()+Double.valueOf(sizePrice.toString());
    }
}
