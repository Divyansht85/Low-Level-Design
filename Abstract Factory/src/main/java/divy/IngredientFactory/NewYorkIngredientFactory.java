package divy.IngredientFactory;

import divy.Ingredients.*;


public class NewYorkIngredientFactory implements IngredientFactory{
    public Dough createDough(String size) {
        return new ThinCrustDough(size);
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Clams createClams() {
        return new FreshClams();
    }
}
