package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        FlightService service = new FlightService();

        System.out.println("Departure until the current moment:");
        service.filter(flights, new DepartureBeforeNowFilter())
                .forEach(System.out::println);

        System.out.println("\nArrival before departure:");
        service.filter(flights, new ArrivalBeforeDepartureFilter())
                .forEach(System.out::println);

        System.out.println("\nThe time spent on earth is more than two hours:");
        service.filter(flights, new MoreThanTwoHours())
                .forEach(System.out::println);
    }
}

