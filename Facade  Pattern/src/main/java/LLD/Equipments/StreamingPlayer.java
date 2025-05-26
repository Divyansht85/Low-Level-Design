package LLD.Equipments;

public class StreamingPlayer {
    Amplifier amplifier;
    public void on(){
        System.out.println("Streaming Player is on");
    }
    public void off(){
        System.out.println("Streaming Player is off");
    }
    @Override
    public String toString() {
        return "Streaming Player";
    }
    public void setAmplifier(Amplifier amplifier){
        this.amplifier = amplifier;
    }
    public void play(String movie){
        System.out.println("Streaming player playing movie " + movie);
    }
    public void pause(){
        System.out.println("Streaming player paused");
    }
    public void stop(){
        System.out.println("Streaming player stopped");
    }
    public void setSurroundSound(){
        System.out.println("Streaming player set surround sound");
    }
    public void setTwoChannelAudio(){
        System.out.println("Streaming player set two channel audio");
    }
}
