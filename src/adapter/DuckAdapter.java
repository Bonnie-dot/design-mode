package adapter;

public class DuckAdapter implements Turkey {

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }

    public static void main(String[] args) {

        DuckAdapter duckAdapter = new DuckAdapter(new MallardDuck());
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
