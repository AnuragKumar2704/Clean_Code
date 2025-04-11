package org.example.basic;

import java.time.LocalDate;
import java.util.List;

public class FlightScheduler {

    private static final String STATUS_DELAYED = "Delayed";

    public String getFlightStatuses(List<LocalDate> flightDates) {
        StringBuilder statusReport = new StringBuilder();
        LocalDate currentDate = LocalDate.now();

        for (LocalDate flightDate : flightDates) {
            if (flightDate.isAfter(currentDate)) {
                statusReport.append(flightDate).append("\n");
            } else {
                statusReport.append(STATUS_DELAYED).append("\n");
            }
        }

        return statusReport.toString();
    }
}
