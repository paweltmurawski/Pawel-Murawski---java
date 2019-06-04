
package com.kodilla.stream.com.kodilla.stream.world;


import java.util.Set;

public final class Continent {
    private final String continentsNames;
    private final Set<Country> listOfCountries;

    public Continent(final String continentsNames, final Set<Country> listOfCountries) {
        this.continentsNames = continentsNames;
        this.listOfCountries = listOfCountries;
    }


    public String getContinentsNames() {
        return continentsNames;
    }

    public Set<Country> getListOfCountries() {
        return listOfCountries;
    }
}



