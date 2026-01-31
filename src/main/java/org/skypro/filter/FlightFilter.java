package org.skypro.filter;

import org.skypro.flight.Flight;

public interface FlightFilter {
    boolean test(Flight flight);
}
