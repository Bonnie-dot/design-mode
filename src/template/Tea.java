package template;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("steep tea bag");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }
}
