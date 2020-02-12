package decorator;

import java.util.Arrays;

public abstract class Beverage {
    String description="Unknown Beverage";
    String size="Unknown size";
    String[] sizes={"tall","grande","venti"};

    public String getDescription(){
        return description;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String s){
        if(Arrays.asList(sizes).contains(s)){
            size=s;
        }
    }
    public abstract double cost();
}
