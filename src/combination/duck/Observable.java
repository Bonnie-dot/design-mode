package combination.duck;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

    ArrayList<Observer> observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observable = (Observer) iterator.next();
            observable.update(duck);
        }
    }

}