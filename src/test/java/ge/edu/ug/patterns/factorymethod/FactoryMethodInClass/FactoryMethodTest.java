package ge.edu.ug.patterns.factorymethod.FactoryMethodInClass;

import ge.edu.ug.patterns.creational.factorymethod.logisticsdemo.Logistics;
import ge.edu.ug.patterns.creational.factorymethod.logisticsdemo.SeaLogistics;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {
    @Test
    void testFactoryMethod(){
        Logistics logistics = new SeaLogistics();
        logistics.getTransport().deliver("Ordu", "Furniture");
    }
}
