package com.kodilla.good.patterns.challenges.airlines;

import java.util.List;
import java.util.stream.Collectors;

public final class FlightSearch {

    public List<Flight> getFlightsFrom(String from) {
        List<Flight> flightsFrom = FlightDb.getFlightDb().stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public List<Flight> getFlightsTo(String to) {
        List<Flight> flightsTo = FlightDb.getFlightDb().stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toList());
        return flightsTo;
    }

    public List<Flight> getInterconnectingFlights (String from, String via, String to ) {
        List<Flight> flightsFrom = FlightDb.getFlightDb().stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .filter(flight -> flight.getArrivalAirport().equals(via))
                .collect(Collectors.toList());
        List<Flight> flightsTo = FlightDb.getFlightDb().stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .filter(flight -> flight.getDepartureAirport().equals(via))
                .collect(Collectors.toList());
        flightsFrom.addAll(flightsTo);
        return flightsFrom;
    }
}