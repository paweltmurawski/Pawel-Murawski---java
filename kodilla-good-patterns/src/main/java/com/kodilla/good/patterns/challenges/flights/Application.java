package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Flights flights = new Flights();
        List<Cities> listOfFlights = flights.flightsListCreator();
        List<Cities> flightsFrom = flights.fligthsSearcherFrom("Warszawa", listOfFlights);
        List<Cities> flightsTo = flights.fligthsSearcherTo("Waszyngton", listOfFlights);
        List<Cities> flightsThrough = flights.fligthsSearcherThrough("Warszawa", listOfFlights);
        System.out.println(flightsFrom);
        System.out.println(flightsTo);
        System.out.println(flightsThrough);
    }
}

