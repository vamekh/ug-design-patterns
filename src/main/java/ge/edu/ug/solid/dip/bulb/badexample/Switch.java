package ge.edu.ug.solid.dip.bulb.badexample;

public class Switch {
    Switchable device;

    public Switch(Switchable bulb) {
        this.device = bulb;
    }

    public void flip(boolean onOrOff) {
        this.device.flip(onOrOff);
    }
}
