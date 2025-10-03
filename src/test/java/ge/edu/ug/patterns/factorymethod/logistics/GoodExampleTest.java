package ge.edu.ug.patterns.factorymethod.logistics;

import ge.edu.ug.patterns.creational.factorymethod.logistics.goodexample.Logistics;
import ge.edu.ug.patterns.creational.factorymethod.logistics.goodexample.RoadLogistics;
import ge.edu.ug.patterns.creational.factorymethod.logistics.goodexample.Transport;
import org.junit.jupiter.api.Test;

public class GoodExampleTest {
    @Test
    public void testFactoryMethod() {
        Logistics logistics = new RoadLogistics();
        Transport transport = logistics.createTransport();
        transport.deliver("Mestia", "Furniture");
    }
}
