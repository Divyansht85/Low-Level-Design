package divy.PizzaStore;

import divy.Pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type, String size){
        Pizza pizza;
        pizza=createPizza(type,size);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type,String size);
}
