package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightBuilder {

    public static List<Flight> createFlights() {
        List<Flight> flights = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();

        //standard flight
        flights.add(new Flight(List.of(
                new Segment(now.plusHours(1), now.plusHours(3))
        )));

        //past flight
        flights.add(new Flight(List.of(
                new Segment(now.minusHours(1), now.plusHours(2))
        )));

        //arrival before departure
        flights.add(new Flight(List.of(
                new Segment(now.plusHours(2), now.plusHours(1))
        )));

        //less than two hours
        flights.add(new Flight(List.of(
                new Segment(now.plusHours(1), now.plusHours(3)),
                new Segment(now.plusHours(4), now.plusHours(6))
        )));

        //more than two hours
        flights.add(new Flight(List.of(
                new Segment(now.plusHours(1), now.plusHours(2)),
                new Segment(now.plusHours(5), now.plusHours(7))
        )));

        return flights;
    }
}