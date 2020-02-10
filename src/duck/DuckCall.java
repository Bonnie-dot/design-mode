package duck;

public class DuckCall extends Duck {
    public DuckCall() {
        quackBehavior =new mockQuack();
        flyBehavior = new FlyNoWay();
    }

    public static void main(String[] args) {
        DuckCall duckCall=new DuckCall();
        duckCall.performFly();
        duckCall.performQuack();
    }
}
