package combination.duck;

public class DuckSimulators {

    public static void main(String[] args) {
        DuckSimulators duckSimulators = new DuckSimulators();
        duckSimulators.init();
    }
    void init(){

        Flock fucks = new Flock();
        DuckFactory duckFactory = new DuckFactory();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable gooseAdapter = duckFactory.createGooseAdapter();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        fucks.add(duckCall);
        fucks.add(gooseAdapter);
        fucks.add(mallardDuck);
        fucks.add(redHeadDuck);
        fucks.add(rubberDuck);
        simulates(fucks);
    }
    void simulates(Flock flock){
        System.out.println("\n Duck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);
        simulate(flock);
    }
    void simulate(Quackable duck){
        duck.quack();
    }

}
