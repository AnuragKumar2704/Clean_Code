package org.example.basic;

import java.time.LocalDate;

public class FoodInspection{

    private LocalDate expirationDate;
    private Boolean approvedForConsumption;
    private Integer inspectorId;

    public FoodInspection(LocalDate expirationDate, Boolean approvedForConsumption, Integer inspectorId) {
        this.expirationDate = expirationDate;
        this.approvedForConsumption = approvedForConsumption;
        this.inspectorId = inspectorId;
    }

    public boolean isEdible()
    {
        return (expirationDate.isAfter(LocalDate.now()) &&
                approvedForConsumption &&
                inspectorId != null);

    }
}
