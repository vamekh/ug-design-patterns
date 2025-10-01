package ge.edu.ug.solid.isp.printer;

import ge.edu.ug.solid.isp.printer.badexample.AdvancedPrinter;
import ge.edu.ug.solid.isp.printer.badexample.BasicPrinter;
import ge.edu.ug.solid.isp.printer.badexample.Printer;
import org.junit.jupiter.api.Test;

public class IspBadExampleTest {
    @Test
    public void testBadExample() {
        System.out.println("***A demo without ISP.***");
        Printer printer = new AdvancedPrinter();
        printer.print();
        printer.sendFax();
        printer = new BasicPrinter();
        printer.print();
        printer.sendFax(); // Will throw error
    }
}
