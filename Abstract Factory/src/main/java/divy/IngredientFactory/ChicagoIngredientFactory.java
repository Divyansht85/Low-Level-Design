package divy.IngredientFactory;

import divy.Ingredients.*;

public class ChicagoIngredientFactory implements IngredientFactory{
    public Dough createDough(String size) {
        return new ThickCrustDough(size);
    }
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    public Clams createClams() {
        return new FrozenClams();
    }
}
