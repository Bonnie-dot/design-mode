package duck;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    //because subclass have different behavior for quacking and swimming.
    //so if these behaviors implementation are put in superclass,it cause that subclass feature can't
    // not implement
//    void quack(){}
//    void swim(){}
    void display(){}
    void performQuack(){
        quackBehavior.Quack();
    }
    void performFly(){
        flyBehavior.fly();
    }
}
