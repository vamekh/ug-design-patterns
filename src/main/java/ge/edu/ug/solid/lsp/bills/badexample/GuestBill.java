package ge.edu.ug.solid.lsp.bills.badexample;

import java.util.Random;

public class GuestBill implements Bill {

    @Override
    public void currentBill() {
        System.out.printf("Processing new payment ($%.2f)", new Random().nextDouble() * 500);
    }

    @Override
    public void previousBills() {
        throw new UnsupportedOperationException("Previous payments are not available for guests");
    }
}
