package combination.duck;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    Observable observable;
    ArrayList<Quackable> ducks = new ArrayList();

    public Flock() {
        this.observable = new Observable(this);
    }

    public void add(Quackable duck) {
        this.ducks.add(duck);
    }

    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
            notifyObservers();
        }
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
