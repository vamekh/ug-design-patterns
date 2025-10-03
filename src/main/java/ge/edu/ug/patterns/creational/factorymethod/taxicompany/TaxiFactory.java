package ge.edu.ug.patterns.creational.factorymethod.taxicompany;

public interface TaxiFactory {
    Taxi getTaxi(int passengers);
}
