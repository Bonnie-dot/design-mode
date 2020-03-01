package combination.duck;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulator();
    }

    void simulator(){
        Quackable mallardDuck = new QuackCounterDecorator(new MallardDuck());
        Quackable redheadDuck = new QuackCounterDecorator(new RedheadDuck());
        Quackable duckCall = new QuackCounterDecorator(new DuckCall());
        Quackable rubberDuck = new QuackCounterDecorator(new RubberDuck());
        Quackable gooseAdapter = new QuackCounterDecorator(new GooseAdapter(new Goose()));

        System.out.println("\nDuck Simulator");

        Quackologist quackologist = new Quackologist();
        mallardDuck.registerObserver(quackologist);
        redheadDuck.registerObserver(quackologist);
        duckCall.registerObserver(quackologist);
        rubberDuck.registerObserver(quackologist);
        gooseAdapter.registerObserver(quackologist);
        System.out.println("\n Duck Simulator: With Observer");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(rubberDuck);
        simulate(rubberDuck);
        simulate(gooseAdapter);

    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
