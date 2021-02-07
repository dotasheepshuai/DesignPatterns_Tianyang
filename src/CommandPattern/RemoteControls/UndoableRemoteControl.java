package CommandPattern.RemoteControls;

import CommandPattern.Commands.Command;
import CommandPattern.Commands.NoCommand;

import java.util.Stack;

public class UndoableRemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commandsToUndo;

    public UndoableRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();

        // init all commands as NoCommand
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        commandsToUndo = new Stack<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onCommandWasPushed(int slot) {
        final Command pushed = onCommands[slot];
        pushed.execute();
        commandsToUndo.push(pushed);
    }

    public void offCommandWasPushed(int slot) {
        final Command pushed = offCommands[slot];
        pushed.execute();
        commandsToUndo.push(pushed);
    }

    public void undoCommand() {
        if (commandsToUndo.empty()) {
            System.out.println("Nothing to undo!");
        } else {
            final Command commandToUndo = commandsToUndo.pop();
            commandToUndo.undo();
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("\n------ Remote Control ------\n");
        for(int i = 0; i < 7; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getCanonicalName() + "   " + offCommands[i].getClass().getCanonicalName() + "\n");
        }
        return sb.toString();
    }
}
