package ge.edu.ug.patterns.creational.factorymethod.logistics.goodexample;

public class RoadLogistics implements Logistics{//Concrete Creator concept
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
