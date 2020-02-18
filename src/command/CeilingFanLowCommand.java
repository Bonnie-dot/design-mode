package command;

public class CeilingFanLowCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan=ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        ceilingFan.callMethod(prevSpeed);
    }
}
