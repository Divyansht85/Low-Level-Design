package divy.Toppings;

import divy.Pizza;

public class ExtraCheese extends ToppingsDecorator{
    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }
    @Override
    public int cost(){
        return pizza.cost() + 50;
    }
}
