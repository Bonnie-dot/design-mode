package decorator;

import java.util.Map;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    Map sizeMapPrice;
    public Mocha(Beverage b) {
        description="Mocha";
        beverage=b;
        sizeMapPrice=Map.ofEntries(Map.entry(beverage.sizes[0],0.2),Map.entry(beverage.sizes[1],0.3)
                ,Map.entry(beverage.sizes[2],0.4));
    }

    @Override
    public String getDescription() {
        return description+beverage.description;
    }

    @Override
    public String getSize() {
       return beverage.getSize();
    }

    @Override
    public double cost() {
        Object sizePrice=sizeMapPrice.get(getSize());
        return .20+beverage.cost()+Double.valueOf(sizePrice.toString());
    }
}
