package ge.edu.ug.solid.lsp.bills.goodexample;

import java.util.Random;

public class UserBill implements NewBill, PreviousPayment {
    String username;

    public UserBill(String username) {
        this.username = username;
    }

    @Override
    public void previousPaymentInfo() {
        System.out.println("Previous payments for " + username);
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            System.out.printf("$%.2f\n", random.nextDouble() * 2000);
        }
    }

    @Override
    public void newPayment() {
        System.out.printf("Processing new payment ($%.2f) for %s", new Random().nextDouble() * 2000, username);
    }
}
