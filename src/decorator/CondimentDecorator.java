package decorator;

// to get the same type for Beverage,so extends it
public abstract class CondimentDecorator extends Beverage {
    @Override
    public  abstract String getDescription();

    @Override
    public abstract double cost();
}
