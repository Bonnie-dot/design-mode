### Head First 设计模式笔记
#### 设计模式入门
##### 设计原则
- 找出应用中可能需要改变之处，把它们独立出来，不要和那些不需要改变的代码混在一起
- 针对接口编程，而不是针对实现编程（这个理解起来有点绕，针对接口编程就是针对超类型编程，超类型主要是指
抽象类，或者接口，从而实现多态，从而实现弹性）
- 多用组合，少用继承（使用组合建立系统具有很大的弹性，可以在运行时动态改变行为，
可以提高代码的扩展性和可维护性）
- 为了交互对象之间的松耦合设计而努力，松耦合的设计之所以能让我们建立有弹性的OO系统
，能够应对变化，是因为把对象之间的互相依赖性降到了最低。
- 类应该对外开放，对修改关闭（遵循开放-关闭原则，通常会引入新的抽象层次，增加代码
的复杂度。你需要把注意力集中到**最有可能发生变化**的地方，然后应用开放-关闭原则。如果每个
地方都应用的话，会导致代码抽象度高，难以理解，也是一种浪费）
- 依赖倒置原则：要依赖抽象，不要依赖具体类。（不管高层组件还是低层组件都应该依赖于抽象）
> how to do（针对的是可变化的部分）
1. 变量不可以持有具体类的引用
2. 不要让类派生自具体类
3. 不要覆盖基类中已实现的方法
> 策略模式：定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化
独立于算法的客户。    
#### 观察者模式
> 观察者模式定义了对象之间的一对多的依赖，这样一来，当一个对象改变状态时，它的所有依赖
都会收到通知并自动更新
- 应用：java 中具体的体现Observable(遗弃)/swings/javaBeans（PropertyChangeListener）就
前端来说应该是事件监听、订阅等
#### 装饰者模式
> 动态地将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案
- 装饰者与被装饰者具有相同的超类型（这里是利用继承达到类型匹配，而不是利用继承获得行为）
- 你可以用一个或者多个装饰者包装对象
- 既然装饰者和被装饰者具有相同的超类型，所以在任何需要原始对象的场合，都是可以用装饰过的
对象替代它
- 装饰者可以在所委托被装饰者的行为之前或者之后，加上自己的行为，以达到特定的目的。
- 对象可以在任何时候被装饰，可以在运行时动态的添加。
- 装饰者会导致设计中出现许多小对象，如果过度使用，会让程序变得复杂。
在java 中文件输入和输出 采用的是装饰者模式，一般如下面代码这样：
```
        beverage = new Soy(new Mocha(new HouseBlend()));
```
#### 工厂方法模式
**所有的工厂都是用来封装对象的创建**
##### 工厂方法
>定义了一个创建对象的接口，但是由于子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。从而实现
使用和创建的解耦
- 简单工厂，就是把需要实例化的对象，放在一起集中处理，当需要修改的时候，直接修改就该类就可以了。也可以采用静态
方法来实现，但是有一个缺点就是无法通过extends来修改代码。
```
public static Pizza createPizza(String type){
        Pizza pizza;
        if(type.equals("cheese")){
            pizza=new ChicagoCheesePizza();
        }else if(type.equals("greek")){
            pizza=new NYGreekPizza();
        }else{
            pizza=new NYPepperonPizza();
        }
        return pizza;
    }
```
- 简单工厂 vs 工厂模式，简单工厂则是把所有实例化的逻辑，在一个地方处理完了；但是工厂方法是创建一个框架，
让子类决定要如何实现。
```
public abstract class PizzaStore {

    Pizza orderPizza(String type){
        Pizza pizza =createPizza(type);
        return pizza;
    }
    abstract Pizza createPizza(String type);// factory method
}
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese")){
            pizza=new NYCheesePizza();
        }else if(type.equals("greek")){
            pizza=new NYGreekPizza();
        }else{
            pizza=new NYPepperonPizza();
        }
        return pizza;
    }
}
```
##### 抽象工厂模式
> 提供一个接口，用于创建相关或者依赖对象的家族，而不需要明确指定的具体
类型。抽象工厂主要是负责创建一组产品的接口
```
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();

}
```
##### 工厂方法 vs 抽象工厂
###### 相同点：
都是负责创建对象，减少应用程序和具体类之间的依赖，实现松耦合。同时都是
针对抽象编程，而不是具体的类编程。

###### 不相同点：

- 工厂方法是使用继承，把对象的创建委托给子类，子类实现工厂方法创建对象。
适用于一个产品线。
- 抽象方法是使用对象组合，对象的创建被实现工厂接口所暴露出来的方法中。
适用于一个产品家族的抽象。
#### 单件模式（Singleton Pattern）
> 用来创建独一无二的，只能有一个实例的对象的入场券。 
单件模式确保程序中一个类最多只有一个实例，同时通过静态方法提供了全局访问点，
##### 在多线程中的单件模式
在多线程中， 单件模式可能会造成一个问题，会造成多个线程共用一个实例的情况，为了避免，可以采用如下方法(感觉这块更多线程交互较多，
第一和第三不是太理解)：
- 在静态方法上添加synchronized字段，可以迫使每个线程在进入这个方法之前，要等候别的线程离开这个方法，也是说两个线程
不会同时进入这个方法。但是这个方法会导致性能下降。(ChocolateBoilerFirst）
- 初始化时直接创建单件实例,可以保证线程安全，而没有延迟初始化（ChocolateBoilerTwo）
- 使用双重检查锁，减少使用同步。(ChocolateBoilerThird)
##### 命令模式
> 将请求封装层对象，这可以让你使用不同的请求、队列，或者日志请求来参数化其他对象，命令模式也可以支持撤销操作。
- 命令模式将发出请求的对象和执行请求的对象解耦。
- 在被解耦的两者之间是通过命令对象进行沟通的，命令对象封装了接收者和一个或者一组动作。
- 宏命令是命令的一种简单的延伸，允许调用多个命令。
- 适用于队列请求、日志请求。
 

