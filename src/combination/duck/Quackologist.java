package combination.duck;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quackologist:"+quackObservable.getClass().getName()+"just quacked.");
    }
}
