package singleton;

public class ChocolateBoilerThird implements Runnable{

    private volatile static ChocolateBoilerThird chocolateBoiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerThird() {
        this.empty = true;
        this.boiled = false;
    }

    public synchronized static ChocolateBoilerThird getInstance(){
        synchronized (ChocolateBoilerThird.class){
            if(chocolateBoiler ==null){
                chocolateBoiler=new ChocolateBoilerThird();
            }
            return chocolateBoiler;
        }

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
        ChocolateBoilerThird instance = ChocolateBoilerThird.getInstance();
        instance.fill();
        new Thread(ChocolateBoilerThird.getInstance()).start();
    }
}
