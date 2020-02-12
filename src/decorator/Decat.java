package decorator;

public class Decat extends Beverage {
    public Decat() {
        description="Decat";
    }

    @Override
    public double cost() {
        return 5.89;
    }
}
