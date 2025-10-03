package ge.edu.ug.patterns.creational.prototype.cars.goodexample;

public abstract class Vehicle  {
    private String engineType;
    private String color;
    private String model;
    private String brand;

    public Vehicle(String brand, String model, String color, String engineType) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineType = engineType;
    }

    public Vehicle(Vehicle vehicle) {
        this.color = vehicle.color;
        this.model = vehicle.model;
        this.brand = vehicle.brand;
        this.engineType = vehicle.engineType;
    }

    public abstract Vehicle clone();

    @Override
    public String toString() {
        return String.format("Brand: %s; Model: %s; Color: %s; Engine: %s;", brand, model, color, engineType);
    }
}
