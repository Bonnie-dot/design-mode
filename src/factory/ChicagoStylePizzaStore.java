package factory;

import factory.ingredient.ChicagoPizzaIngredientFactory;
import factory.kinds.ChicagoCheesePizza;
import factory.kinds.ChicagoGreekPizza;
import factory.kinds.ChicagoPepperonPizza;
import factory.kinds.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza;
        if(type.equals("cheese")){
            pizza=new ChicagoCheesePizza(chicagoPizzaIngredientFactory);
        }else if(type.equals("greek")){
            pizza=new ChicagoGreekPizza(chicagoPizzaIngredientFactory);
        }else{
            pizza=new ChicagoPepperonPizza(chicagoPizzaIngredientFactory);
        }
        return pizza;
    }
}
