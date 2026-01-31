package org.skypro.flights;

import org.skypro.filter.FlightFilter;
import org.skypro.flight.Flight;

public class ArrivalBeforeDepartureFilter implements FlightFilter {

    @Override
    public boolean test(Flight flight) {
        return flight.getSegments().stream()
                .anyMatch(s -> s.getArrivalDate().isBefore(s.getDepartureDate()));
    }
}