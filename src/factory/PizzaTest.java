package factory;

import factory.kinds.Pizza;

public class PizzaTest {
    public static void main(String[] args) {
        ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        Pizza cheesePizza = chicagoStylePizzaStore.createPizza("cheese");
        System.out.println(cheesePizza.getName());
        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        Pizza unknownPizza = nyStylePizzaStore.createPizza("sss");
        System.out.println(unknownPizza.getName()  );
    }
}
