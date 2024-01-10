package Interface.Banksysusing_Interfaces;

import java.util.ArrayList;
import java.util.List;

// Main.java
// Class Main

// Declare the Main class

// Declare the Bank class
class Bank {
    // Declare a private list to store accounts
    private List<Account> accounts;

    // Constructor for initializing the list of accounts
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the list of accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to remove an account from the list of accounts
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Method to deposit a specified amount into an account
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    // Method to withdraw a specified amount from an account
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    // Method to print the balances of all accounts in the bank
    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Bank class
        Bank bank = new Bank();

        // Create a SavingsAccount with an initial deposit and interest rate
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
        System.out.println("Savings Account:\nInitial Deposit: $1000.00\nInterest rate: 1.25%");

        // Create a CurrentAccount with an initial deposit and overdraft limit
        CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\nCurrent Account:\nInitial Deposit: $5000.00\nOverdraft Limit: $1000.00");

        // Add the SavingsAccount and CurrentAccount to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nNow deposit $100 to Savings Account.");
        // Deposit $100 into the SavingsAccount
        bank.deposit(savingsAccount, 100.0);
        System.out.println("Now deposit $500 to Current Account.");
        // Deposit $500 into the CurrentAccount
        bank.deposit(currentAccount, 500.0);

        System.out.println("Withdraw $150 from Savings Account.\n");
        // Withdraw $150 from the SavingsAccount
        bank.withdraw(savingsAccount, 150.0);
        System.out.println("\nSavings A/c and Current A/c.:");

        // Print the balances of all accounts in the bank
        bank.printAccountBalances();

        // Apply interest to the SavingsAccount
        savingsAccount.applyInterest();
        System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c.:");

        // Print the balances of all accounts in the bank after applying interest
        bank.printAccountBalances();
    }
}
