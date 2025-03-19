package org.example.discussion.functions;

import java.util.regex.Pattern;

public class UserEmailValidationRefactored {
    public class User {
    }

    public void registerUser(String email, String name) {
        checkEmail(email);
        User user = new User();
        register(user);
    }

    private void checkEmail(String email) {
        Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        if (!VALID_EMAIL_ADDRESS_REGEX.matcher(email).matches()) {
            throw new IllegalArgumentException("Email invalid");
        }
    }

    public void register(User user) {
    }
}
