package singleton;

public class ChocolateBoilerTwo implements Runnable{

    private static ChocolateBoilerTwo chocolateBoiler = new ChocolateBoilerTwo();
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerTwo() {
        this.empty = true;
        this.boiled = false;
    }

    public synchronized static ChocolateBoilerTwo getInstance(){
        return chocolateBoiler;
    }
    public void fill(){
        if (isEmpty()){
            empty=false;
            boiled=false;
        }
    }

    public void drain(){
        if(!isEmpty()&&isBoiled()){
            empty=true;
        }
    }

    public void boil(){
        if(!isEmpty()&&!isBoiled()){
            boiled=true;
        }
    }
    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }

    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        ChocolateBoilerTwo instance = ChocolateBoilerTwo.getInstance();
        instance.fill();
        new Thread(ChocolateBoilerTwo.getInstance()).start();
    }
}
