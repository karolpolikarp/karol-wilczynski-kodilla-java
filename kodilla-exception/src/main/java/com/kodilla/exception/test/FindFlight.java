package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public final void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportAvailabilityChecker = new HashMap<>();
        airportAvailabilityChecker.put("Berlin", true);
        airportAvailabilityChecker.put("Paris", true);
        airportAvailabilityChecker.put("Haiti", false);
        airportAvailabilityChecker.put("London", true);
        airportAvailabilityChecker.put("Honolulu", false);


}