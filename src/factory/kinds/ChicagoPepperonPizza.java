package factory.kinds;

import factory.ingredient.PizzaIngredientFactory;

public class ChicagoPepperonPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;
    public ChicagoPepperonPizza(PizzaIngredientFactory pizzaIngredientFactory) {
       name="ChicagoPepperonPizza";
        pizzaIngredientFactory=pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createPepperoni();
    }
}
