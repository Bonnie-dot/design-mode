package decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description="HouseBlend";
        super.setSize("tall");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
