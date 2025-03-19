package org.example.discussion.exceptions;

public class Interest {
    int interest(int principle, int rate, int time) {
        if (principle < 0) {
            throw new IllegalArgumentException("principle cannot be less than zero");
        } else {
            return (principle * rate * time) / 100;
        }
    }

}
