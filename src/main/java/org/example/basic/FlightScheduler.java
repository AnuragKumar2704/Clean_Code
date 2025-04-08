package org.example.basic;

import java.time.LocalDate;
import java.util.List;

public class FlightScheduler {
    public String transform(List<LocalDate> Dates) {
        StringBuilder result = new StringBuilder();

        for (LocalDate Date : Dates) {
            if (Date.isAfter(LocalDate.now())) {
                result.append(Date).append("\n");
            } else {
                result.append("Delayed\n");
            }
        }
        return result.toString();
    }
}
