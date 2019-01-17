package com.kodilla.good.patterns.challenges.airlines;

import java.util.List;


public class FlightInformation {
    FlightSearch flightSearch = new FlightSearch();
    String message = "Thanks for using Flight Information System!";

    public void printFlightsFrom(String from) {
        List<Flight> s = flightSearch.getFlightsFrom(from);
        System.out.println(message);
//        System.out.println("From " + from + " you can book a flight to " + s + "!");
        System.out.println(s);
    }

    public void printFlightsTo(String to) {
        List<Flight> s = flightSearch.getFlightsTo(to);
        System.out.println(message);
//        System.out.println("To " + to + " you can book a flight from " + s + "!");
        System.out.println(s);
    }
    public void printFlightsVia(String from, String via, String to) {
        List<Flight> s = flightSearch.getInterconnectingFlights(from, via, to);
        System.out.println(s);
    }
}
