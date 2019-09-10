package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collectors;

public class Flights {

    public List<Cities> flightsListCreator() {
        List<Cities> listOfFlights = new ArrayList<>();
        listOfFlights.add(new Cities("Warszawa", "Nowy Jork"));
        listOfFlights.add(new Cities("Poznan", "Waszyngton"));
        listOfFlights.add(new Cities("Paryz", "Madryd"));
        listOfFlights.add(new Cities("Moskwa", "Manchester"));
        listOfFlights.add(new Cities("Warszawa", "Berlin"));
        listOfFlights.add(new Cities("Bydgoszcz", "Waszyngton"));

        return listOfFlights;
    }

    public List<Cities> fligthsSearcherFrom(String cityFrom, List<Cities> listOfFlights) {
        List<Cities> startCities = listOfFlights.stream()
                .filter(e -> e.getCityFrom().equals(cityFrom))
                .collect(Collectors.toList());
        return startCities;
    }

    public List<Cities> fligthsSearcherTo(String cityTo, List<Cities> listOfFlights) {
        List<Cities> endCities = listOfFlights.stream()
                .filter(e -> e.getCityTo().equals(cityTo))
                .collect(Collectors.toList());
        return endCities;
    }

    public List<Cities> fligthsSearcherThrough(String cityThrough, List<Cities> listOfFlights) {
        List<Cities> flightsThrough = listOfFlights.stream()
                .filter(e -> e.getCityFrom().equals(cityThrough))
                .collect(Collectors.toList());
        return flightsThrough;
    }
}



