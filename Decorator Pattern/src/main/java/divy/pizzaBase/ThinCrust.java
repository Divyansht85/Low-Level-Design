package divy.pizzaBase;

import divy.Pizza;

public class ThinCrust extends Pizza {
    public ThinCrust() {
        description = "Thin Crust";
    }
    @Override
    public int cost(){
        return 100;
    }
}
