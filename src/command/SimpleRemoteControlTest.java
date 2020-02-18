package command;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOnCommand garageDoorCommand = new GarageDoorOnCommand(garageDoor);
        simpleRemoteControl.setCommand(garageDoorCommand);
        simpleRemoteControl.buttonWasPressed();

    }
}
