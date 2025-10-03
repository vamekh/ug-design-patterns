package ge.edu.ug.patterns.creational.factorymethod.logisticsdemo;

public class Truck implements Transport {
    @Override
    public void deliver(String destination, String cargo){
        System.out.printf("Delivering %s by truck to %s...", cargo, destination);
    }
}
