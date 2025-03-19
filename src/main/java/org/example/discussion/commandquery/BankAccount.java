package org.example.discussion.commandquery;

/**
 * withdraw is now only a command: It modifies the state but doesn’t return any value.
 * getBalance is only a query: It retrieves information without modifying the state.
 * */
public class BankAccount {
    private double balance;
    // Command: Changes the state by withdrawing money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
    }
    // Query: Retrieves the current balance without modifying it
    public double getBalance() {
        return balance;
    }
}
