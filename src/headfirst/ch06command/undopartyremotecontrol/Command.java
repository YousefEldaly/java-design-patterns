package headfirst.ch06command.undopartyremotecontrol;

public interface Command {
    public void execute();
    public void undo();
}
