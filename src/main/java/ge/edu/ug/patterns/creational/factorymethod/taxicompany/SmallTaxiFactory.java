package ge.edu.ug.patterns.creational.factorymethod.taxicompany;

public class SmallTaxiFactory implements TaxiFactory {
    @Override
    public Taxi getTaxi(int passengers) {
        return new SmallCar();
    }
}
