package divy.PizzaStore;

import divy.IngredientFactory.ChicagoIngredientFactory;
import divy.IngredientFactory.NewYorkIngredientFactory;
import divy.Pizza.CheesePizza;
import divy.Pizza.ClamPizza;
import divy.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type, String size) {
        if(type.equalsIgnoreCase("cheese"))
            return new CheesePizza(new ChicagoIngredientFactory(),size);
        else if (type.equalsIgnoreCase("clam")) {
            return new ClamPizza(new ChicagoIngredientFactory(),size);
        }
        else return null;
    }
}
