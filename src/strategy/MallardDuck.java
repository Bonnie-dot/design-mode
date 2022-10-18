package strategy;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    public void setFlyBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.setFlyBehavior(new Squeak());
        mallardDuck.performQuack();
    }
}
