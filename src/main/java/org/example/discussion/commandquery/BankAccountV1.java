package org.example.discussion.commandquery;

public class BankAccountV1 {
    private double balance;

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return amount;
        }
        return 0;
    }
}
