package ge.edu.ug.patterns.prototype.cars;

import ge.edu.ug.patterns.creational.prototype.cars.goodexample.Bus;
import ge.edu.ug.patterns.creational.prototype.cars.goodexample.Car;
import ge.edu.ug.patterns.creational.prototype.cars.goodexample.Vehicle;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GoodExampleTest {
    @Test
    public void testPrototype() {
        List<Vehicle> vehicles = List.of(
                new Car("BMW", "M3", "Red", "Electric", 300),
                new Bus("Ikarus", "Dragon", "Red", "Diesel", 50)
        );
        List<Vehicle> duplicates = this.duplicate(vehicles);
        duplicates.forEach(System.out::println);
    }

    public List<Vehicle> duplicate(List<Vehicle> vehicles) {
        return vehicles.stream().map(Vehicle::clone).toList();
    }
}
