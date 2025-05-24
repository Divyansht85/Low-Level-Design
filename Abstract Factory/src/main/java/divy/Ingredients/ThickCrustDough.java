package divy.Ingredients;

public class ThickCrustDough extends Dough {
    public ThickCrustDough(String size) {
        name =size + " Thick Crust Dough";
        this.size=size;
        switch (size) {
            case "Small" -> cost = 50;
            case "Medium" -> cost = 100;
            case "Large" -> cost = 150;
        }
    }

}
