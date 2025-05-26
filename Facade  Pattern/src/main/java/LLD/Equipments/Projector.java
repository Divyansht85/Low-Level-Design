package LLD.Equipments;

import java.util.stream.Stream;

public class Projector {
    StreamingPlayer player;
    public void on(){
        System.out.println("Projector is on");
    }
    public void off(){
        System.out.println("Projector is off");
    }
    public void setStreamingPlayer(StreamingPlayer player){
        this.player = player;
    }
    @Override
    public String toString() {
        return "Projector";
    }
    public void tvMode(){
        System.out.println("Projector is in TV Mode");
    }
    public void wideScreenMode(){
        System.out.println("Projector is in Wide Screen Mode");
    }
}
