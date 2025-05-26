package LLD;

import LLD.Equipments.*;

public class Main {
    public static void main(String[] args) {
        Amplifier amp=new Amplifier();
        Tuner tuner=new Tuner();
        StreamingPlayer streamingPlayer=new StreamingPlayer();
        Projector projector=new Projector();
        Screen screen=new Screen();
        TheaterLights lights=new TheaterLights();
        PopcornPopper popper=new PopcornPopper();
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(amp,tuner,streamingPlayer,projector,screen,lights,popper);
        homeTheaterFacade.WatchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}