package org.example.discussion.functions;

public class RomanToDigit {

    public static String romanDigit(int n, String one, String five, String ten) {
        if (n >= 1) {
            if (n == 1) {
                return one;
            } else if (n == 2) {
                return one + one;
            } else if (n == 3) {
                return one + one + one;
            } else if (n == 4) {
                return one + five;
            } else if (n == 5) {
                return five;
            } else if (n == 6) {
                return five + one;
            } else if (n == 7) {
                return five + one + one;
            } else if (n == 8) {
                return five + one + one + one;
            } else if (n == 9) {
                return one + ten;
            }
        }
        return "";
    }
}
