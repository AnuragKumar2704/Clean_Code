package org.example.discussion.functions;

import java.util.regex.Pattern;

public class UserEmailValidation {
    public class User {
    }

    public void registerUser(String email, String name) {
        Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        if (!VALID_EMAIL_ADDRESS_REGEX.matcher(email).matches()) {
            throw new IllegalArgumentException("Email invalid");
        }

        User user = new User();
        register(user);
    }

    public void register(User user) {

    }
}
