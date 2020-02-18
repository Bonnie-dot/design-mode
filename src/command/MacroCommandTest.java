package command;

public class MacroCommandTest {

    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command[] partyOn={lightOnCommand,garageDoorOnCommand,ceilingFanHighCommand};
        Command[] partyOff={lightOffCommand,garageDoorOffCommand,ceilingFanOffCommand};

        MacroCommand macroOnCommand = new MacroCommand(partyOn);
        MacroCommand macroOffCommand = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(0,macroOnCommand,macroOffCommand);
        System.out.println("-----pushing macro on-----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("-----pushing macro off-----");
        remoteControl.offButtonWasPushed(0);
        System.out.println("-----pushing macro undo-----");
        remoteControl.undoButtonWasPushed();
    }
}
