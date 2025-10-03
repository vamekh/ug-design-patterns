package ge.edu.ug.patterns.creational.factorymethod.taxicompany;

public class MiniVan implements Taxi{
    @Override
    public void transport(){
        System.out.println("Transporting minivan");
    }
}
