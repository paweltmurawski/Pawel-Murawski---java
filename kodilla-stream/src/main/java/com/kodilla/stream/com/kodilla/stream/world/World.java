
package com.kodilla.stream.com.kodilla.stream.world;

import java.math.BigDecimal;

import java.util.HashSet;

import java.util.Set;


public final class World {

    private final Set<Continent> listOfContinents = new HashSet<>();

    public BigDecimal getPeopleQuantity() {



        return listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }

}
