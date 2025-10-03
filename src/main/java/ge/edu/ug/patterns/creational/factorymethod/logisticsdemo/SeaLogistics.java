package ge.edu.ug.patterns.creational.factorymethod.logisticsdemo;

public class SeaLogistics implements Logistics{
    @Override
    public Transport getTransport() {
        return new Ship();
    }
}
