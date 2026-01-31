package org.skypro.flights;

import org.skypro.filter.FlightFilter;
import org.skypro.flight.Flight;
import org.skypro.flight.Segment;

import java.time.Duration;
import java.util.List;

public class MoreThanTwoHours implements FlightFilter {

    @Override
    public boolean test(Flight flight) {
        List<Segment> segments = flight.getSegments();
        long groundMinutes = 0;

        for (int i = 0; i < segments.size() - 1; i++) {
            Segment current = segments.get(i);
            Segment next = segments.get(i + 1);

            groundMinutes += Duration.between(
                    current.getArrivalDate(),
                    next.getDepartureDate()
            ).toMinutes();
        }

        return groundMinutes > 120;
    }
}