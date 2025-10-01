package ge.edu.ug.solid.lsp.bills.badexample;

import java.util.ArrayList;
import java.util.List;

public class BillHelper {
    List<Bill> bills = new ArrayList<>();

    public void addUser(Bill user){
        bills.add(user);
    }

    public void showPreviousPayments() {
        for (Bill bill : bills) {
            bill.previousBills();
            System.out.println("-----------------------");
        }
    }

    public void showNewBills() {
        for (Bill payment : bills) {
            payment.currentBill();
            System.out.println("-----------------------");
        }
    }
}
