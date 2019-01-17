package com.kodilla.good.patterns.challenges.airlines;

import java.util.List;
import java.util.stream.Collectors;

public final class FlightSearch {

    //    public List<String> getFlightsFrom(String from) {
//        List<String> flightsFrom = FlightDb.getFlightDb().stream()
//                .filter(flight -> flight.getDepartureAirport().equals(from))
//                .map(flight -> flight.getArrivalAirport())
//                .collect(Collectors.toList());
//        return flightsFrom;
//    }
//    public List<String> getFlightsTo(String to) {
//        List<String> flightsTo = FlightDb.getFlightDb().stream()
//                .filter(flight -> flight.getArrivalAirport().equals(to))
//                .map(flight -> flight.getDepartureAirport())
//                .collect(Collectors.toList());
//        return flightsTo;
//    }
    public void getFlightsFrom(String from) {
        List<Flight> flightsFrom = FlightDb.getFlightDb().stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
//                .map(flight -> flight.getArrivalAirport())
                .collect(Collectors.toList());
//        return flightsFrom;
    }

    public void getFlightsTo(String to) {
        List<Flight> flightsTo = FlightDb.getFlightDb().stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
//                .map(flight -> flight.getDepartureAirport())
                .collect(Collectors.toList());
//        return flightsTo;
    }
}