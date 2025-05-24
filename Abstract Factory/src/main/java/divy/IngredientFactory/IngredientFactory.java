package divy.IngredientFactory;

import divy.Ingredients.Cheese;
import divy.Ingredients.Clams;
import divy.Ingredients.Dough;
import divy.Ingredients.Sauce;

public interface IngredientFactory {
    public Dough createDough(String size);
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
}
