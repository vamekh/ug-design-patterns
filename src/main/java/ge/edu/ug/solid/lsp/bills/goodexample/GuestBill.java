package ge.edu.ug.solid.lsp.bills.goodexample;

import java.util.Random;

public class GuestBill implements NewBill {
    String name;

    public GuestBill() {
        name = "Guest";
    }

    @Override
    public void newPayment() {
        System.out.printf("Processing %s's new payment ($%.2f) for %s", name, new Random().nextDouble() * 500);
    }
}
