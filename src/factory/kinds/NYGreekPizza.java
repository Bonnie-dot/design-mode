package factory.kinds;

import factory.ingredient.PizzaIngredientFactory;

public class NYGreekPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYGreekPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name="NYGreekPizza";
        pizzaIngredientFactory=pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createClams();
    }
}
