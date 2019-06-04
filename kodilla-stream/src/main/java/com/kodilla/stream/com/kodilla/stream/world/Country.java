
package com.kodilla.stream.com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countriesNames;
    private final BigDecimal peopleQuantity;

    public Country(final String countriesNames, final BigDecimal peopleInCountry) {
        this.countriesNames = countriesNames;
        this.peopleQuantity = peopleInCountry;
    }

    public String getCountriesNames() {
        return countriesNames;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return countriesNames.equals(country.countriesNames);
    }

    @Override
    public int hashCode() {
        return countriesNames.hashCode();
    }
}
