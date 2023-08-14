package headfirst.ch06command.undopartyremotecontrol;


public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        if (stereo.getInputType() == null) {
            stereo.on();
        } else if (stereo.getInputType().equals("CD")) {
            stereo.setCD();
        } else if (stereo.getInputType().equals("DVD")) {
            stereo.setDVD();
        } else if (stereo.getInputType().equals("Radio")) {
            stereo.setRadio();
        }
        //stereo.setVolume(11);
    }
}
