package divy.Command;

import divy.Receiver.Fan;

public class FanOnCommand implements Command {
    public Fan fan;
    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.on();
    }
    @Override
    public void undo() {
        fan.off();
    }
}
