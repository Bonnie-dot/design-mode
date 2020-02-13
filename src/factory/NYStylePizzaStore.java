package factory;

import factory.ingredient.NYPizzaIngredientFactory;
import factory.kinds.NYCheesePizza;
import factory.kinds.NYGreekPizza;
import factory.kinds.NYPepperonPizza;
import factory.kinds.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza;
        if(type.equals("cheese")){
            pizza=new NYCheesePizza(nyPizzaIngredientFactory);
        }else if(type.equals("greek")){
            pizza=new NYGreekPizza(nyPizzaIngredientFactory);
        }else{
            pizza=new NYPepperonPizza(nyPizzaIngredientFactory);
        }
        return pizza;
    }
}
