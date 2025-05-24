package divy.PizzaStore;

import divy.IngredientFactory.NewYorkIngredientFactory;
import divy.Pizza.CheesePizza;
import divy.Pizza.ClamPizza;
import divy.Pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {
    Pizza createPizza(String type, String size) {
        if(type.equalsIgnoreCase("cheese"))
            return new CheesePizza(new NewYorkIngredientFactory(),size);
        else if (type.equalsIgnoreCase("clam")) {
            return new ClamPizza(new NewYorkIngredientFactory(),size);
        }
        else return null;
    }
}
