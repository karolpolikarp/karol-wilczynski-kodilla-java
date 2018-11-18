package com.kodilla.exception.test;

import java.util.Scanner;

public class FindFlightRunner {

    public static void main(String[] args) throws RouteNotFoundException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter airport: ");
            String airport = scanner.nextLine();
            try {
                Flight flight = new Flight("Warsaw", airport);
                System.out.println(FindFlight.findFlight(flight));
                break;
            } catch (RouteNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
