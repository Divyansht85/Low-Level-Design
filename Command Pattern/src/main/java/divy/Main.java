package divy;

import divy.Command.*;
import divy.Receiver.Fan;
import divy.Receiver.Light;
import divy.Remote.RemoteControl;

public class Main {
    public static void main(String[] args) {
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");
        Fan bedroomFan = new Fan("Bedroom");
        Fan kitchenFan = new Fan("Kitchen");
        Command bedroomLightOn = new LightsOnCommand(bedroomLight);
        Command bedroomLightOff = new LightsOffCommand(bedroomLight);
        Command kitchenLightOn = new LightsOnCommand(kitchenLight);
        Command kitchenLightOff = new LightsOffCommand(kitchenLight);
        Command bedroomFanOn = new FanOnCommand(bedroomFan);
        Command bedroomFanOff = new FanOffCommand(bedroomFan);
        Command kitchenFanOn = new FanOnCommand(kitchenFan);
        Command kitchenFanOff = new FanOffCommand(kitchenFan);
        Command[] partyCommands = {bedroomLightOn, kitchenLightOn, bedroomFanOn, kitchenFanOn};
        MacroCommand partyOn = new MacroCommand(partyCommands);
        MacroOffCommand partyOff = new MacroOffCommand(partyCommands);
        RemoteControl remote = new RemoteControl(6);
        remote.setCommand(0, bedroomLightOn, bedroomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, bedroomFanOn, bedroomFanOff);
        remote.setCommand(3, kitchenFanOn, kitchenFanOff);
        remote.setCommand(4, partyOn, partyOff);
        System.out.println(remote.toString());
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.undoButtonPressed();
        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
        remote.onButtonPressed(3);
        remote.offButtonPressed(3);
        remote.onButtonPressed(4);
        remote.offButtonPressed(4);
        remote.undoButtonPressed();
        remote.onButtonPressed(5);
        remote.offButtonPressed(5);
    }
}