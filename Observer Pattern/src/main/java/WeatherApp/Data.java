package WeatherApp;

public class Data {
    public String name;
    public int val;
    public Data(String name, int val) {
        this.name = name;
        this.val = val;
    }
    @Override
    public String toString() {
        return name + ": " + val;
    }
}
