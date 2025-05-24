package divy;

import divy.Toppings.ExtraCheese;
import divy.Toppings.Onion;
import divy.pizzaBase.ThinCrust;

public class Main {
    public static void main(String[] args) {
        Pizza myPizza=new Onion(new ExtraCheese(new ThinCrust()));
        System.out.println(myPizza.getDescription());
        System.out.println(myPizza.cost());
    }
}