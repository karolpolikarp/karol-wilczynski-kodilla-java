package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public static boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportAvailabilityChecker = new HashMap<>();
        airportAvailabilityChecker.put("BERLIN", true);
        airportAvailabilityChecker.put("PARIS", true);
        airportAvailabilityChecker.put("HAITI", false);
        airportAvailabilityChecker.put("LONDON", true);
        airportAvailabilityChecker.put("HONOLULU", false);

        if(airportAvailabilityChecker.containsKey(flight.getArrivalAirport().toUpperCase())) {
            return airportAvailabilityChecker.get(flight.getArrivalAirport().toUpperCase());
        } else {
            throw new RouteNotFoundException("Airport " + flight.getArrivalAirport() + " not found");
        }
    }
}