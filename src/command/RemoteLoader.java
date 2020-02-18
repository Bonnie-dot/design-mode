package command;

public class RemoteLoader {
    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(0,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControl.setCommands(1,ceilingFanLowCommand,ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();;
    }
}
