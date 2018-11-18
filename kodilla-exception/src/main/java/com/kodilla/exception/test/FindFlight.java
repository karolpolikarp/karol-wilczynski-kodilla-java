package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public final void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportAvabilityChecker = new HashMap<>();
        airportAvabilityChecker.put("Berlin", true);
        airportAvabilityChecker.put("Paris", true);
        airportAvabilityChecker.put("Haiti", false);
        airportAvabilityChecker.put("London", true);
        airportAvabilityChecker.put("Honolulu", false);


}