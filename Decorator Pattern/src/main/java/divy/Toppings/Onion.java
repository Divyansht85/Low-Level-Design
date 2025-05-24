package divy.Toppings;

import divy.Pizza;

public class Onion extends ToppingsDecorator{
    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+ ", Onion";
    }
    @Override
    public int cost(){
        return pizza.cost()+20;
    }
}
