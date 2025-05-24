package divy.pizzaBase;

import divy.Pizza;

public class CheeseCrust extends Pizza {
    public CheeseCrust() {
        description = "Cheese Crust";
    }
    @Override
    public int cost(){
        return 150;
    }
}
