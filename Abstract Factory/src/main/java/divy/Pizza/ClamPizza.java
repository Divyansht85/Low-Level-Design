package divy.Pizza;

import divy.IngredientFactory.IngredientFactory;

public class ClamPizza extends Pizza {
    public ClamPizza(IngredientFactory ingredientFactory, String size) {
        this.ingredientFactory = ingredientFactory;
        name = "Clam Pizza";
        this.size = size;
    }
    public void prepare(){
        System.out.println( "Preparing " + name);
        dough=ingredientFactory.createDough(size);
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
        clam=ingredientFactory.createClams();
    }
}
