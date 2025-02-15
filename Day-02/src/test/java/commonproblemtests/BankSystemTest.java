package commonproblemtests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import commonproblems.implementabankingsystem.*;
public class BankSystemTest {
    @Test
    void testCreateAccount() {
        ImplementBankingSystem.addAccount(102, 500);

        assertEquals(500, ImplementBankingSystem.addAccount(102, 500));
    }


    @Test
    void testRequestAndProcessWithdrawal() {
        ImplementBankingSystem.requestWithdrawal(102);
        ImplementBankingSystem.requestWithdrawal(101);

        ImplementBankingSystem.requestWithdrawal( 100);

        ImplementBankingSystem.processWithdrawals();

        assertEquals(600, ImplementBankingSystem.displaySortedAccounts());
    }

    @Test
    void testProcessWithdrawalInsufficientBalance() {
        ImplementBankingSystem.requestWithdrawal(102);

        ImplementBankingSystem.processWithdrawals();

        assertEquals(50, ImplementBankingSystem.displaySortedAccounts());
    }


    @Test
    void testWithdrawWithoutAnyRequest() {
       ImplementBankingSystem.processWithdrawals();
    }

}
