package singleton;

public class ChocolateBoilerFirst implements Runnable{

    private static ChocolateBoilerFirst chocolateBoiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerFirst() {
        this.empty = true;
        this.boiled = false;
    }

    public synchronized static ChocolateBoilerFirst getInstance(){
        if(chocolateBoiler ==null){
            chocolateBoiler = new ChocolateBoilerFirst();
        }
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
        ChocolateBoilerFirst instance = ChocolateBoilerFirst.getInstance();
        instance.fill();
        new Thread(ChocolateBoilerFirst.getInstance()).start();
    }
}
