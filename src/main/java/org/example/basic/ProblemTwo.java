package org.example.basic;

import java.time.LocalDate;
import java.util.List;

public class ProblemTwo {
    public String transform(List<LocalDate> s)
    {String d = null;
        for (LocalDate kc:s // arrival times
        )
        {if (kc.isAfter(LocalDate.now())) { d = d + kc + "\n";}
        else {
            d = d + "Delayed\n";
        } // flight is delayed
        }
        return d;
    }
}
