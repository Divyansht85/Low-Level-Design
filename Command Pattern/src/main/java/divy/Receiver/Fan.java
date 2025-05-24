package divy.Receiver;

public class Fan {
    public String location;
    public Fan(String location) {
        this.location = location;
    }
    public void on(){
        System.out.println("Fan turned on at " + location);
    }
    public void off(){
        System.out.println("Fan turned off at " + location);
    }
}
