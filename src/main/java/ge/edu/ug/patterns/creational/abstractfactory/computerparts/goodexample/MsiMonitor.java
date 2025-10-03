package ge.edu.ug.patterns.creational.abstractfactory.computerparts.goodexample;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi Monitor...");
    }
}
