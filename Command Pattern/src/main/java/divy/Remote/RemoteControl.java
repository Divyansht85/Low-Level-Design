package divy.Remote;

import divy.Command.Command;
import divy.Command.NoCommand;

public class RemoteControl {
    Command previousCommand;
    int slots;
    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl(int slots){
        this.slots = slots;
        onCommands = new Command[slots];
        offCommands = new Command[slots];
        for(int i = 0; i < slots; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        previousCommand = new NoCommand();
    }
    public void setCommand(int slotNumber,Command onCommand, Command offCommand){
        if(slotNumber >= 0 && slotNumber < slots){
            onCommands[slotNumber] = onCommand;
            offCommands[slotNumber] = offCommand;
        }
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n ----------Remote Control---------- \n");
        for(int i = 0; i < slots; i++){
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
    public void onButtonPressed(int slotNumber){
        previousCommand=onCommands[slotNumber];
        onCommands[slotNumber].execute();
    }
    public void offButtonPressed(int slotNumber){
        previousCommand=offCommands[slotNumber];
        offCommands[slotNumber].execute();
    }
    public void undoButtonPressed(){
        previousCommand.undo();
    }
}
