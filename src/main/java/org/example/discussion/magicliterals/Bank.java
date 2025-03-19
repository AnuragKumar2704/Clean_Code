package org.example.discussion.magicliterals;

public class Bank {

    public static class User {
        int status;
        int balance;
    }

    public static void main(String[] args) {
        User user = new User();
        if (user.status == 1 && user.balance < 10000) {
            // throw error
        }
    }
}
