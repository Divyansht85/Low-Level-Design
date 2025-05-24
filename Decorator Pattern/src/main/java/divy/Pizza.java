package divy;

public abstract class Pizza {
    public String description="Unknown Pizza";
    public abstract int cost();
    public String getDescription() {
        return description;
    }
}
