package divy.Command;

public class MacroCommand implements Command {
    public Command[] commands;
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        System.out.println("\n--------Party On---------\n");
        for (Command command : commands) {
            command.execute();
        }
    }
    @Override
    public void undo() {
        System.out.println("\n--------Party Off---------\n");
        for(int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}
