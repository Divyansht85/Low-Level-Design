package LLD.Equipments;

public class Tuner {
    Amplifier amplifier;
    public void on(){
        System.out.println("Tuner is on");
    }
    public void off(){
        System.out.println("Tuner is off");
    }
    @Override
    public String toString() {
        return "Tuner";
    }
    public void setAmplifier(Amplifier amplifier){
        this.amplifier = amplifier;
    }
    public void setFrequency(int frequency){
        System.out.println("Setting frequency to " + frequency);
    }
    public void setAm(){
        System.out.println("Setting AM");
    }
    public void setFm(){
        System.out.println("Setting FM");
    }
}
