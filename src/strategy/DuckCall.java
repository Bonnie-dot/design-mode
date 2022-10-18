package strategy;

public class DuckCall extends Duck {
    public DuckCall() {
        quackBehavior =new MockQuack();
        flyBehavior = new FlyNoWay();
    }

    public static void main(String[] args) {
        DuckCall duckCall=new DuckCall();
        duckCall.performFly();
        duckCall.performQuack();
    }
}
