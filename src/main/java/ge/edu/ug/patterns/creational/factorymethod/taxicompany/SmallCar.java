package ge.edu.ug.patterns.creational.factorymethod.taxicompany;

public class SmallCar implements Taxi{
    @Override
    public void transport(){
        System.out.println("Transporting small car");
    }
}
