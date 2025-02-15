package commonproblems.implementabankingsystem;
import java.util.*;

public class ImplementBankingSystem {
    //creating maps
    private static Map<Integer, Double> accounts = new HashMap<>(); // Stores account balances (unordered)
    private static TreeMap<Double, Integer> sortedAccounts = new TreeMap<>(); // Sorts by balance
    private static Queue<Integer> withdrawalQueue = new LinkedList<>(); // Processes withdrawals

    public static void main(String[] args) {
        ImplementBankingSystem bank = new ImplementBankingSystem();

        // Adding customer accounts
        bank.addAccount(101, 5000);
        bank.addAccount(102, 10000);
        bank.addAccount(103, 2000);
        bank.addAccount(104, 8000);

        // Depositing money
        bank.deposit(101, 2000);
        bank.deposit(103, 3000);

        // Requesting withdrawals
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(104);

        // Displaying details
        bank.displayAccounts();
        bank.displaySortedAccounts();

        // Processing withdrawal requests
        bank.processWithdrawals();
    }

    // Method to add a new customer account
    public static short addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
        return 0;
    }

    // Method to deposit money
    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            sortedAccounts.remove(accounts.get(accountNumber)); // Remove old balance
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber); // Add new balance
            System.out.println("Deposited ₹" + amount + " to Account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Method to request a withdrawal (adds to queue)
    public static void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
            System.out.println("Withdrawal requested for Account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Process withdrawal requests
    public static void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processed withdrawal for Account " + accountNumber);
        }
    }

    // Display all accounts (unordered)
    public static void displayAccounts() {
        System.out.println("\nAll Accounts (Unordered):");
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("Account " + entry.getKey() + " -> ₹" + entry.getValue());
        }
    }

    // Display accounts sorted by balance
    public static short displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " -> ₹" + entry.getKey());
        }
        return 0;
    }
}

