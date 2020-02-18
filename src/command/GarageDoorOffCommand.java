package command;

public class GarageDoorOffCommand implements Command {

    GarageDoor garageDoor;
    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor=garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
    }
}
