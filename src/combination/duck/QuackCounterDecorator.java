package combination.duck;

public class QuackCounterDecorator implements Quackable {

    Observable observable;
    Quackable duck;
    int numberOfQuack = 1;

    public QuackCounterDecorator(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println(numberOfQuack);
        duck.quack();
        numberOfQuack++;
        notifyObservers();
    }

    public int getNumberOfQuack() {
        return numberOfQuack;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
