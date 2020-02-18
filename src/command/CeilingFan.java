package command;

public class CeilingFan {
    public static final int HIGH=3;
    public static final int MEDIUM=2;
    public static final int LOW=1;
    public static final int OFF=0;
    int speed;

    public CeilingFan() {
        speed=OFF;
    }

    public void high(){
        speed=HIGH;
        System.out.println("high");
    }

    public void medium(){
        speed=MEDIUM;
    }

    public void low(){
        speed=LOW;
        System.out.println("low");
    }

    public void off(){
        speed=OFF;
        System.out.println("off");
    }

    public int getSpeed(){
        return speed;
    }

    public void callMethod(int type){
        if (type == CeilingFan.HIGH){
            this.high();
        }else if(type == CeilingFan.LOW){
            this.low();
        }else if(type == CeilingFan.MEDIUM){
            this.medium();
        }else if(type == CeilingFan.OFF){
            this.off();
        }
    }


}
