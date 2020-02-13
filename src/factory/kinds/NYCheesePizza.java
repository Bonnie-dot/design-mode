package factory.kinds;

import factory.ingredient.PizzaIngredientFactory;

public class NYCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name="NYCheesePizza";
        pizzaIngredientFactory=pizzaIngredientFactory;

    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createCheese();
    }
}
