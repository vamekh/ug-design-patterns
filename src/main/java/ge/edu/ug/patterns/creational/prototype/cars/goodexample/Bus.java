package ge.edu.ug.patterns.creational.prototype.cars.goodexample;

public class Bus extends Vehicle{
    private int seats;

    public Bus(String brand, String model, String color, String engine, int seats) {
        super(brand, model, color, engine);
        this.seats = seats;
    }

    public Bus(Bus bus){
        super(bus);
        this.seats = bus.seats;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }

    @Override
    public String toString() {
        return String.format("Bus: %s seats: %d", super.toString(), seats);
    }
}
