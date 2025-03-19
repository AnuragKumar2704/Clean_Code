package org.example.discussion.functions;

import java.beans.Visibility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MonadicFunctions {

    public InputStream fileOpen(String fileName) throws FileNotFoundException {
        return new FileInputStream(fileName);
    }

    public static void main(String[] args) {
        String myFile = "MyFile";
        boolean ifExists = fileExists(myFile);
    }

    static boolean fileExists(String fileName) {
        return false;
    }

    static void onPasswordAttemptsFailed(int attempts) {
    }

    private static class Visibility {

        public static void main(String[] args) {

            boolean isVisible = true;
            if (isVisible) {
                onVisibile();
            } else {
                onInvisibile();
            }

            setVisiblity(isVisible);

        }

        static void setVisiblity(boolean visible) {
            if (visible) {
                System.out.println("You are visible");
            } else {
                System.out.println("You are invisible");
            }
        }

        static void onVisibile() {
            System.out.println("You are visible");
        }

        static void onInvisibile() {
            System.out.println("You are invisible");
        }
    }


}
