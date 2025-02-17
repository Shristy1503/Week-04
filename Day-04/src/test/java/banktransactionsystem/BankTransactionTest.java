package banktransactionsystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransactionTest {
    @Test
    void testWithdrawal() throws InsufficientBalanceException{
        BankAccount account = new BankAccount(1000);
        account.withdraw(200);
        assertEquals(800, account.getBalance());
    }
}
