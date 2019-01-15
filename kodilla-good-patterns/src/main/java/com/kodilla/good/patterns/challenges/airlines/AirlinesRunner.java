package com.kodilla.good.patterns.challenges.airlines;

public class AirlinesRunner {
    public static void main(String[] args) {
        FlightInformation flightInformation = new FlightInformation();
        flightInformation.printFlightsFrom("Radom");
        flightInformation.printFlightsTo("Gdansk");
    }
}