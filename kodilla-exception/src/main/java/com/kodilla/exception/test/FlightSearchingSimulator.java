package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchingSimulator {
    public Map<String, Boolean> findFlight(Flight flight) {
        Map<String, Boolean> flightList = new HashMap<>();
        flightList.put("Warsaw", true);
        flightList.put("Bydgoszcz", true);
        flightList.put("London", false);

        return flightList;

    }
}
