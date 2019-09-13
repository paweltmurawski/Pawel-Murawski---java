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

    public List<Cities> fligthsSearcherThrough(String cityFrom, String cityThrough, String cityTo, List<Cities> listOfFlights) {
        List<Cities> flightsFrom = listOfFlights.stream()
                .filter(e -> e.getCityFrom().equals(cityFrom))
                .collect(Collectors.toList());

        List<Cities> flightsTo = listOfFlights.stream()
                .filter(e -> e.getCityTo().equals(cityTo))
                .collect(Collectors.toList());

        //List<Cities> commonList = new ArrayList<>();
        //for (Cities common : flightsThrough) {
         ///   if (flightsTo.contains(common)) {
          //      commonList.add(common);
          //  }
        //}
       //// return commonList;
    //}

       // List<Cities> commonList = new ArrayList<>(flightsTo);
        //if(flightsTo.contains(flightsFrom)) {
          //  commonList.addAll(flightsTo);
       // }
        //commonList.retainAll(flightsTo);

        //return commonList;

        List<Cities> commonListOfFlights = flightsTo.stream()
                .filter(flightsFrom::contains)
                .collect(Collectors.toList());

        return commonListOfFlights;
   }
}
