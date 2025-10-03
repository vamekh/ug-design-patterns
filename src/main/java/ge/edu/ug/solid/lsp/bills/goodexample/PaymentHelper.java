package ge.edu.ug.solid.lsp.bills.goodexample;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {
    List<PreviousPayment> previousPayments = new ArrayList<>();
    List<NewBill> newBills = new ArrayList<>();

    public void addPreviousPayment(PreviousPayment previousPayment) {
        previousPayments.add(previousPayment);
    }

    public void addNewPayment(NewBill newBillRequest) {
        newBills.add(newBillRequest);
    }

    public void showPreviousPayments() {
        for (PreviousPayment payment : previousPayments) {
            payment.previousPaymentInfo();
            System.out.println("------");
        }
    }

    public void processNewPayments() {
        for (NewBill payment : newBills) {
            payment.newPayment();
            System.out.println("***********");
        }
    }
}
