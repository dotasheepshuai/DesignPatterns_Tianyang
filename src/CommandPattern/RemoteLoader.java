package CommandPattern;

import CommandPattern.Appliances.Light;
import CommandPattern.Commands.Command;
import CommandPattern.Commands.LightOffCommand;
import CommandPattern.Commands.LightOnCommand;
import CommandPattern.Commands.MacroCommand;
import CommandPattern.RemoteControls.UndoableRemoteControl;

public class RemoteLoader {
    public static void main(String[] args) {
        final UndoableRemoteControl remoteControl = new UndoableRemoteControl();
        final Light roomLight = new Light("Room");
        final Light kitchenLight = new Light("Kitchen");

        final LightOnCommand roomLightOnCommand = new LightOnCommand(roomLight);
        final LightOffCommand roomLightOffCommand = new LightOffCommand(roomLight);
        final LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        final LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        final Command[] onCommands = { roomLightOnCommand, kitchenLightOnCommand };
        final MacroCommand onMacroCommand = new MacroCommand(onCommands);
        final Command[] offCommands = { roomLightOffCommand, kitchenLightOffCommand };
        final MacroCommand offMacroCommand = new MacroCommand(offCommands);

        remoteControl.setCommand(0, roomLightOnCommand, roomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, onMacroCommand, offMacroCommand);
        System.out.println(remoteControl);

        remoteControl.onCommandWasPushed(0);
        remoteControl.offCommandWasPushed(0);
        remoteControl.undoCommand();

        remoteControl.offCommandWasPushed(2);
        remoteControl.onCommandWasPushed(2);
        remoteControl.undoCommand();
        remoteControl.undoCommand();
        remoteControl.undoCommand();
        remoteControl.undoCommand();
    }
}
