package factory.kinds;

import factory.ingredient.PizzaIngredientFactory;

public class NYPepperonPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;
    public NYPepperonPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        pizzaIngredientFactory=pizzaIngredientFactory;
        name="NYPepperonPizza";
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createPepperoni();
    }
}
