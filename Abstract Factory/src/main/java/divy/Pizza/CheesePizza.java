package divy.Pizza;

import divy.IngredientFactory.IngredientFactory;

public class CheesePizza extends Pizza {
    public CheesePizza(IngredientFactory ingredientFactory,String size) {
        this.ingredientFactory = ingredientFactory;
        name = "Cheese Pizza";
        this.size = size;
    }
    public void prepare(){
        System.out.println( "Preparing " + name);
        dough=ingredientFactory.createDough(size);
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
    }
}
