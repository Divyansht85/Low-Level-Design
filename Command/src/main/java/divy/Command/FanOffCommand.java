package divy.Command;

import divy.Receiver.Fan;

public class FanOffCommand implements Command {
    public Fan fan;
    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.off();
    }
    @Override
    public void undo() {
        fan.on();
    }
}
