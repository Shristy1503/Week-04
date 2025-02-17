package banktransactionsystem;

public class BankTransactionSystem {
    public static void main(String[] args) {
        // creating a bank account 
        BankAccount account = new BankAccount(2000);

        // try to withdraw an amount 
        withdrawMoney(account, 1500);
    }

    // method to perform withdrawal 
    public static void withdrawMoney(BankAccount account, double amount) {
        try {
            //withdraw money
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            // handle insufficient balance exception
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // handle invalid amount exception
            System.out.println(e.getMessage());
        }
    }
}
