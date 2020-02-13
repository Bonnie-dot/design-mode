package factory.kinds;

import factory.ingredient.PizzaIngredientFactory;

public class ChicagoCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name="ChicagoCheesePizza";
        pizzaIngredientFactory=pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        pizzaIngredientFactory.createCheese();
    }
}
