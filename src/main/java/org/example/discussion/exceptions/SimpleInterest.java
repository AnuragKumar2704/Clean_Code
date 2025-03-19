package org.example.discussion.exceptions;

public class SimpleInterest {
    int interest(int principle, int rate, int time) {
        if (principle < 0) {
            return -1;
        } else {
            return (principle * rate * time) / 100;
        }
    }
}
