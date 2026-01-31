package com.gridnine.testing;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    public List<Flight> filter(List<Flight> flights, FlightFilter filter) {
        return flights.stream()
                .filter(filter::test)
                .collect(Collectors.toList());
    }
}