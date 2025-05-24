package divy.Receiver;

public class Light {
    public String location;
    public Light(String location) {
        this.location = location;
    }
    public void on(){
        System.out.println("Lights turned on at " + location);
    }
    public void off(){
        System.out.println("Lights turned off at " + location);
    }
}
