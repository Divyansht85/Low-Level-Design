package divy.Command;

import divy.Receiver.Light;

public class LightsOffCommand implements Command {
    private Light light;
    public LightsOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
    @Override
    public void undo() {
        light.on();
    }
}
