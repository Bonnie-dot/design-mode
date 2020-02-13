package factory;

import factory.ingredient.NYPizzaIngredientFactory;
import factory.kinds.ChicagoCheesePizza;
import factory.kinds.NYGreekPizza;
import factory.kinds.NYPepperonPizza;
import factory.kinds.Pizza;

public class SimplePizzaFactory {
    //maybe have other way to need pizza's info
    // extract code as factor mode
    public static Pizza createPizza(String type){
        Pizza pizza;
        if(type.equals("cheese")){
            pizza=new ChicagoCheesePizza(new NYPizzaIngredientFactory());
        }else if(type.equals("greek")){
            pizza=new NYGreekPizza(new NYPizzaIngredientFactory());
        }else{
            pizza=new NYPepperonPizza(new NYPizzaIngredientFactory());
        }
        return pizza;
    }
}
