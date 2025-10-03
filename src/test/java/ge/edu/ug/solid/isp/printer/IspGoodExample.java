package ge.edu.ug.solid.isp.printer;

import ge.edu.ug.solid.isp.printer.goodexample.AdvancedPrinter;
import ge.edu.ug.solid.isp.printer.goodexample.BasicPrinter;
import ge.edu.ug.solid.isp.printer.goodexample.FaxDevice;
import ge.edu.ug.solid.isp.printer.goodexample.Printer;
import org.junit.jupiter.api.Test;

public class IspGoodExample {
    @Test
    public void testIspGoodExample() {
        System.out.println("***A demo that follows ISP.***");
        Printer printer = new BasicPrinter();
        printer.print();
        printer = new AdvancedPrinter();
        printer.print();
        FaxDevice faxDevice = new AdvancedPrinter();
        faxDevice.sendFax();
    }
}
