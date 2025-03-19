package org.example.discussion.magicliterals;

public class BankRefactored {

    private static final int STATUS_ACTIVE = 1;

    private static final int MINIMUM_BALANCE = 10000;

    public static class User {
        int status;
        int balance;
    }

    public static void main(String[] args) {
        User user = new User();
        if (user.status == STATUS_ACTIVE && user.balance < MINIMUM_BALANCE) {
            // throw error
        }

        validate(user);
    }


    /**
     * Better solution
     * **/
    static void validate(User user) {
        if (isAllowedToWithdraw(user)) {
            // throw error
        }
    }

    private static boolean isAllowedToWithdraw(User user) {
        return (user.status == STATUS_ACTIVE && user.balance < MINIMUM_BALANCE);
    }
}
