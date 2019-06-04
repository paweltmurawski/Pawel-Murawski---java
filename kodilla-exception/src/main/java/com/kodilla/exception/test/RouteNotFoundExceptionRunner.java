package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        FlightSearchingSimulator flightSearchingSimulator = new FlightSearchingSimulator();
        Flight flight = new Flight("Warsau", "Sopt");

        try {
            flightSearchingSimulator.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("Airport was not found");
        }

    }
}
