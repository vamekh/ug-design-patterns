package ge.edu.ug.patterns.creational.factorymethod.logistics.goodexample;

public class SeaLogistics implements Logistics {//Concrete Creator concept
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
