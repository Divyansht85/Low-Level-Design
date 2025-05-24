package divy;

import divy.Pizza.Pizza;
import divy.PizzaStore.ChicagoPizzaStore;
import divy.PizzaStore.NewYorkPizzaStore;
import divy.PizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        Pizza pizza=pizzaStore.orderPizza("cheese","Large");
        System.out.println(pizza.toString());
    }
}