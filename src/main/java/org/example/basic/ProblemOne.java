package org.example.basic;

import java.time.LocalDate;

public class ProblemOne {

    private LocalDate expirationDate;
    private Boolean approvedForConsumption;
    private Integer inspectorId;

    public ProblemOne(LocalDate expirationDate, Boolean approvedForConsumption, Integer inspectorId) {
        this.expirationDate = expirationDate;
        this.approvedForConsumption = approvedForConsumption;
        this.inspectorId = inspectorId;
    }

    public boolean isEdible()
    {
        if (this.expirationDate.isAfter(LocalDate.now()) &&
                this.approvedForConsumption == true &&
                this.inspectorId != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
