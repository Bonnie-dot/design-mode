package factory.kinds;

import factory.ingredient.PizzaIngredientFactory;

public class ChicagoGreekPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoGreekPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name="ChicagoGreekPizza";
        pizzaIngredientFactory=pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createClams();
    }
}
