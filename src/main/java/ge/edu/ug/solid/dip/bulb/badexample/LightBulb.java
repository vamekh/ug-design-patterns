package ge.edu.ug.solid.dip.bulb.badexample;

public class LightBulb implements Switchable {
    @Override
    public void flip(boolean on) {
        System.out.println("Bulb is " + (on ? "on" : "off"));
    }
}
