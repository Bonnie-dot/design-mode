package factory.kinds;

import factory.ingredient.*;

// interface has no state,so if you need to use state,please use abstract class.
public abstract class Pizza {
    public String name="unknown type";
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;
    public void setName(String name){
        name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void prepare();
    public void bake(){};
    public void cut(){};
    public void box(){};
}
