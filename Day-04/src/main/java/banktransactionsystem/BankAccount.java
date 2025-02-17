package banktransactionsystem;

public class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    // method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            // throw exception for negative withdrawal amount
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            // throw exception if withdrawal amount exceeds balance
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
