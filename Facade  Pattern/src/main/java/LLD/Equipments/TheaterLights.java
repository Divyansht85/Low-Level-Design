package LLD.Equipments;

public class TheaterLights {
    public void on(){
        System.out.println("Theater Lights are on");
    }
    public void off(){
        System.out.println("Theater Lights are off");
    }
    public void dim(int percentage){
        System.out.println("Theater Lights are dimmed to " + percentage);
    }
    public void brighten(int percentage){
        System.out.println("Theater Lights are brightened to " + percentage);
    }
    @Override
    public String toString() {
        return "Theater Lights";
    }
}
