package template;

public abstract class CaffeineBeverage {
    abstract void brew();
    abstract void addCondiments();
     final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    boolean customerWantsCondiments() {
         return true;
    }

    ;
    void boilWater() {
        System.out.println("boil water");
    }
    void pourInCup() {
        System.out.println("pour in cup");
    }
}
