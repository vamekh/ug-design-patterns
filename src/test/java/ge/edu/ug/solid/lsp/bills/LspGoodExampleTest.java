package ge.edu.ug.solid.lsp.bills;

import ge.edu.ug.solid.lsp.bills.goodexample.GuestBill;
import ge.edu.ug.solid.lsp.bills.goodexample.PaymentHelper;
import ge.edu.ug.solid.lsp.bills.goodexample.UserBill;

import org.junit.jupiter.api.Test;

public class LspGoodExampleTest {
    @Test
    public void testLspGoodExample() {
        System.out.println("***A demo that follows the LSP.***\n");
        PaymentHelper paymentHelper = new PaymentHelper();
        UserBill gela = new UserBill("Robin");
        UserBill irakli = new UserBill("Irakli");
        GuestBill guest = new GuestBill();

        paymentHelper.addPreviousPayment(gela);
        paymentHelper.addPreviousPayment(irakli);

        paymentHelper.addNewPayment(gela);
        paymentHelper.addNewPayment(irakli);
        paymentHelper.addNewPayment(guest);

        paymentHelper.showPreviousPayments();
        paymentHelper.processNewPayments();
    }
}
