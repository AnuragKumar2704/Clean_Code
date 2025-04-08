package org.example.basic;

import java.time.LocalDate;
import java.util.List;

public class FlightScheduler {
    public String transform(List<LocalDate> arrivalDates) {
        StringBuilder result = new StringBuilder();

        for (LocalDate arrivalDate : arrivalDates) {
            if (arrivalDate.isAfter(LocalDate.now())) {
                result.append(arrivalDate).append("\n");
            } else {
                result.append("Delayed\n");
            }
        }
        return result.toString();
    }
}
