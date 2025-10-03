package ge.edu.ug.solid.isp.printer.goodexample;

public class AdvancedPrinter implements Printer, FaxDevice {
    @Override
    public void print() {
        System.out.println("The advanced printer prints a document.");
    }

    @Override
    public void sendFax() {
        System.out.println("The advanced printer sends a fax.");
    }
}
