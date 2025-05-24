package divy.Ingredients;

public class ThinCrustDough extends Dough {
    public ThinCrustDough(String size) {
        name =size + " Thin Crust Dough";
        this.size=size;
        switch (size) {
            case "Small" -> cost = 40;
            case "Medium" -> cost = 90;
            case "Large" -> cost = 140;
        }
    }
}
