package org.skypro.service;

import org.skypro.filter.FlightFilter;
import org.skypro.flight.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    public List<Flight> filter(List<Flight> flights, FlightFilter filter) {
        return flights.stream()
                .filter(filter::test)
                .collect(Collectors.toList());
    }
}