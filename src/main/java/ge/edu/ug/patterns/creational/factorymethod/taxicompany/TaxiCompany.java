package ge.edu.ug.patterns.creational.factorymethod.taxicompany;

public class TaxiCompany {

    public void getTaxi(int passengers) {
        Taxi taxi;
        SmallTaxiFactory smallTaxiFactory = new SmallTaxiFactory();
        MiniVanTaxiFactory miniVanTaxiFactory = new MiniVanTaxiFactory();
        if(passengers < 4){
            taxi = smallTaxiFactory.getTaxi(passengers);
        } else {
            taxi = miniVanTaxiFactory.getTaxi(passengers);
        }
        taxi.transport();
    }
}
