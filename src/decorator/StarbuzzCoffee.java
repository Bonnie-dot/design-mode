package decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        //order houseBlend
        //carefully:this's one-to-one relationship about size and kinds
        Beverage beverage = new HouseBlend();
        beverage=new Mocha(beverage);
        beverage = new Soy(beverage);
    }
}
