package org.skypro.flights;

import org.skypro.filter.FlightFilter;
import org.skypro.flight.Flight;
import java.time.LocalDateTime;

public class DepartureBeforeNowFilter implements FlightFilter {

    @Override
    public boolean test(Flight flight) {
        return flight.getSegments().get(0)
                .getDepartureDate()
                .isBefore(LocalDateTime.now());
    }
}