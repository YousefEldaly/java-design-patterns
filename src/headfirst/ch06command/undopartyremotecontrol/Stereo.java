package headfirst.ch06command.undopartyremotecontrol;

public class Stereo {
    String location;
    String inputType;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
        inputType = "CD";
    }

    public void setDVD() {
        System.out.println(location + " stereo is set for DVD input");
        inputType = "DVD";
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for Radio");
        inputType = "Radio";
    }

    public String getInputType() {
        return inputType;
    }

    public void setVolume(int volume) {
        System.out.println(location + " stereo volume set to " + volume);
    }
}
