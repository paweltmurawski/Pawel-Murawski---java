

package com.kodilla.stream.world;

import com.kodilla.stream.com.kodilla.stream.world.Continent;
import com.kodilla.stream.com.kodilla.stream.world.Country;
import com.kodilla.stream.com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        BigDecimal germanyQuantity = new BigDecimal("80000000");
        BigDecimal polandQuantity = new BigDecimal("40000000");
        BigDecimal franceQuantity = new BigDecimal("65000000");
        BigDecimal chinaQuantity = new BigDecimal("1300000000");
        BigDecimal indiaQuantity = new BigDecimal("1000000000");
        Country germany = new Country("Germany", germanyQuantity);
        Country poland = new Country("Poland", polandQuantity);
        Country france = new Country("France", franceQuantity);
        Country china = new Country("China", chinaQuantity);
        Country india = new Country("India", indiaQuantity);

        Set<Country> europeCountries = new HashSet<>();
        europeCountries.add(germany);
        europeCountries.add(poland);
        europeCountries.add(france);
        Continent europe = new Continent("Europe", europeCountries);

        Set<Country> asiaCountries = new HashSet<>();
        asiaCountries.add(china);
        asiaCountries.add(india);
        Continent asia = new Continent("Asia", asiaCountries);

        Set<Continent> listOfContinents = new HashSet<>();
        listOfContinents.add(europe);
        listOfContinents.add(asia);

        World world = new World(listOfContinents);

        //When
        BigDecimal peopleInTheWorld = BigDecimal.ZERO;
        peopleInTheWorld = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleInTheWorld = new BigDecimal("2485000000");
        Assert.assertEquals(expectedPeopleInTheWorld, peopleInTheWorld);
    }
}





