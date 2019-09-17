package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collectors;

public class Flights {

    public List<Cities> flightsListCreator() {
        List<Cities> listOfFlights = new ArrayList<>();
        listOfFlights.add(new Cities("Warszawa", "Berlin"));
        listOfFlights.add(new Cities("Berlin", "Waszyngton"));
        listOfFlights.add(new Cities("Paryz", "Madryd"));
        listOfFlights.add(new Cities("Moskwa", "Manchester"));
        listOfFlights.add(new Cities("Warszawa", "Nowy Jork"));
        listOfFlights.add(new Cities("Bydgoszcz", "Warszawa"));

        return listOfFlights;
    }

    public List<Cities> fligthsSearcherFrom(String flightsFrom, List<Cities> listOfFlights) {
        List<Cities> startCities = listOfFlights.stream()
                .filter(e -> e.getCityFrom().equals(flightsFrom))
                .collect(Collectors.toList());
        return startCities;
    }

    public List<Cities> fligthsSearcherTo(String flightsTo, List<Cities> listOfFlights) {
        List<Cities> endCities = listOfFlights.stream()
                .filter(e -> e.getCityTo().equals(flightsTo))
                .collect(Collectors.toList());
        return endCities;
    }

    public List<Cities> fligthsSearcherThrough(String flightsFrom, String flightsThrough, String flightsTo, List<Cities> listOfFlights) {
      List<Cities> flightsStartPoint = listOfFlights.stream()
              .filter(e -> e.getCityFrom().equals(flightsFrom))
              .filter(e -> e.getCityTo().equals(flightsThrough))
              .collect(Collectors.toList());

        List<Cities> flightsEndPoint = listOfFlights.stream()
                .filter(e -> e.getCityTo().equals(flightsTo))
                .filter(e -> e.getCityFrom().equals(flightsThrough))
                .collect(Collectors.toList());

        List<Cities> throughFlights = new ArrayList<>();
        throughFlights.addAll(flightsStartPoint);
        throughFlights.addAll(flightsEndPoint);

        return throughFlights;
   }
}
