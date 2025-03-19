package org.example.discussion.commandquery;

public class BankAccountV2 {
    private double balance;

    // This method acts as both a query and a command
    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Command: changes the state
            return amount; // Query: returns the withdrawn amount
        }
        return 0; // Fails silently (also problematic)
    }
}
