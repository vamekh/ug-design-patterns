package ge.edu.ug.solid.lsp.bills;

import ge.edu.ug.solid.lsp.bills.badexample.BillHelper;
import ge.edu.ug.solid.lsp.bills.badexample.GuestBill;
import ge.edu.ug.solid.lsp.bills.badexample.UserBill;
import org.junit.jupiter.api.Test;

public class LspBadExampleTest {
    @Test
    void testLspBadExample() {
     BillHelper billHelper = new BillHelper();
     billHelper.addUser(new UserBill("Nikola"));
     billHelper.addUser(new UserBill("Albert"));
     billHelper.addUser(new GuestBill());
     billHelper.showPreviousPayments();
     billHelper.showNewBills();
    }
}
