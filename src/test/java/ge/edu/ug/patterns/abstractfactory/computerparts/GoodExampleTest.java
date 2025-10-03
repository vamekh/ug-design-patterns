package ge.edu.ug.patterns.abstractfactory.computerparts;

import ge.edu.ug.patterns.creational.abstractfactory.computerparts.goodexample.*;
import org.junit.jupiter.api.Test;

public class GoodExampleTest {
    @Test
    public void testAbstractFactory(){
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();
    }
}
