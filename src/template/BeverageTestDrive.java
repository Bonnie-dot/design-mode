package template;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        System.out.println("----Make Tea----");
        tea.prepareRecipe();
        Coffee coffee = new Coffee();
        System.out.println("----Make Coffee----");
        coffee.prepareRecipe();
    }
}
