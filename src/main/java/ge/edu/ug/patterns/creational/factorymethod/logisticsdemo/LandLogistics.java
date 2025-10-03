package ge.edu.ug.patterns.creational.factorymethod.logisticsdemo;

public class LandLogistics implements Logistics{
    @Override
    public Transport getTransport() {
        return new Truck();
    }
}
