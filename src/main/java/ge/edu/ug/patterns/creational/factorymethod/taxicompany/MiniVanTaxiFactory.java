package ge.edu.ug.patterns.creational.factorymethod.taxicompany;

public class MiniVanTaxiFactory implements TaxiFactory{
    @Override
    public Taxi getTaxi(int passengers) {
        return new MiniVan();
    }
}
