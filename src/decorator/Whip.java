package decorator;

import java.util.Map;

public class Whip extends CondimentDecorator {

    Beverage beverage;
    Map sizeMapPrice;
    public Whip(Beverage b) {
        description="Whip";
        this.beverage=b;
        sizeMapPrice=Map.ofEntries(Map.entry(beverage.sizes[0],0.1),Map.entry(beverage.sizes[1],0.1)
                ,Map.entry(beverage.sizes[2],0.1));
    }

    @Override
    public String getDescription() {
        return description+beverage.description;
    }

    @Override
    public double cost() {
        Object sizePrice=sizeMapPrice.get(beverage.getSize());
        return .50+beverage.cost()+Double.valueOf(sizePrice.toString());
    }
}
