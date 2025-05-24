package divy.Pizza;

import divy.IngredientFactory.IngredientFactory;
import divy.Ingredients.*;

public abstract class Pizza {
    public IngredientFactory ingredientFactory;
    public String name;
    public int price;
    public String ingredients;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Clams clam;
    public String size;
    abstract public void prepare();
    public void bake(){
        System.out.println("Baking pizza...");
    }
    public void cut(){
        System.out.println("Cutting pizza...");
    }
    public void box(){
        System.out.println("Boxing pizza...");
    }
    public void setPrice(){
        this.price = dough.cost+sauce.cost+cheese.cost;
        if(clam != null){
            this.price += clam.cost;
        }
    }
    public void setIngredients(){
        this.ingredients= "Ingredients: \n";
        this.ingredients+= dough.name + " " + dough.cost + "\n";
        this.ingredients+= sauce.name + " " + sauce.cost + "\n";
        this.ingredients+= cheese.name + " " + cheese.cost + "\n";
        if(clam != null){
            this.ingredients+= clam.name + " " + clam.cost + "\n";
        }
    }
    public String toString(){
        setPrice();
        setIngredients();
        return name + " Cost= " + price + "\n" + ingredients;
    }
}
