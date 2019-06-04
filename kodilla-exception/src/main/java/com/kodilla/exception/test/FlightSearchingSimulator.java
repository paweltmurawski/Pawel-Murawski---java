package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchingSimulator {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightList = new HashMap<>();
        flightList.put("Warsaw", true);
        flightList.put("Bydgoszcz", true);
        flightList.put("London", false);
        System.out.println("Flight List: " + flightList);

        if(flightList.containsKey(flight.getArrivalAirport()) && flightList.containsKey(flight.getDepartureAirport())) {
            System.out.println("Airports available list: " + flight.getDepartureAirport() + " " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }

    }
}
