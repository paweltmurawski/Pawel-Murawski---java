package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Flights flights = new Flights();
        List<Cities> listOfFlights = flights.flightsListCreator();
        List<Cities> flightsFrom = flights.fligthsSearcherFrom("Warszawa", listOfFlights);
        List<Cities> flightsTo = flights.fligthsSearcherTo("Waszyngton", listOfFlights);
        List<Cities> flightsThrough = flights.fligthsSearcherThrough("Warszawa", "Berlin", "Waszyngton", listOfFlights);
        System.out.println(flightsFrom.size());
        System.out.println(flightsTo.size());
        System.out.println(flightsThrough.size());
    }
}

