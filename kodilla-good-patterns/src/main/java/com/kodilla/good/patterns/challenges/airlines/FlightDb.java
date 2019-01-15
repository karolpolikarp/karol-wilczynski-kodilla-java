package com.kodilla.good.patterns.challenges.airlines;

import java.util.HashSet;
import java.util.Set;

public class FlightDb {

    private static Set<Flight> flightDb = new HashSet<>();
    static {
        flightDb.add(new Flight("Radom", "Warszawa"));
        flightDb.add(new Flight("Radom", "Krakow"));
        flightDb.add(new Flight("Radom", "Wroclaw"));
        flightDb.add(new Flight("Warszawa", "Radom"));
        flightDb.add(new Flight("Warszawa", "Poznan"));
        flightDb.add(new Flight("Warszawa", "Krakow"));
        flightDb.add(new Flight("Wroclaw", "Poznan"));
        flightDb.add(new Flight("Wroclaw", "Gdansk"));
        flightDb.add(new Flight("Poznan", "Warszawa"));
        flightDb.add(new Flight("Poznan", "Krakow"));
    }
    static Set<Flight> getFlightDb() {
        return new HashSet<>(flightDb);
    }

}