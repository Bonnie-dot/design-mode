package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommands(1,garageDoorOnCommand,garageDoorOffCommand);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        String s = remoteControl.toString();
        System.out.println(s);
    }
}
