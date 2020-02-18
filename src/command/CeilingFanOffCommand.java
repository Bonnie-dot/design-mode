package command;

public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan=ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.callMethod(prevSpeed);
    }
}
