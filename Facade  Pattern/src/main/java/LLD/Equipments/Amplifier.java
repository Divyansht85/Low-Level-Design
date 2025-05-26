package LLD.Equipments;

public class Amplifier {
    Tuner tuner;
    StreamingPlayer player;
    public void setTuner(Tuner tuner){
        this.tuner = tuner;
    }
    public void setStreamingPlayer(StreamingPlayer player){
        this.player = player;
    }
    public void on(){
        System.out.println("Amplifier is on");
    }
    public void off(){
        System.out.println("Amplifier is off");
    }
    @Override
    public String toString() {
        return "Amplifier";
    }
    public void setVolume(int volume){
        System.out.println("Setting volume to " + volume);
    }
    public void setStereoSound(){
        System.out.println("Setting stereo sound");
    }
    public void setSurroundSound(){
        System.out.println("Setting surround sound");
    }
}
