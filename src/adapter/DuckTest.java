package adapter;

public class DuckTest {
    public static void main(String[] args) {
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
