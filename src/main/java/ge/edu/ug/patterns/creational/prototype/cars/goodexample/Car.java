package ge.edu.ug.patterns.creational.prototype.cars.goodexample;

public class Car extends Vehicle{
    private int topSpeed;
    // TODO: 2025-10-02 add GPS

    public Car(String brand, String model, String color, String engine, int topSpeed) {
        super(brand, model, color, engine);
        this.topSpeed = topSpeed;
    }

    public Car(Car car){
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return String.format("Car: %s Top speed: %d", super.toString(), topSpeed);
    }
}
