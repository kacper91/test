package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given

        List<Country> countries = new ArrayList<>();
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country ukraine = new Country("Ukraine", new BigDecimal("44000000"));
        Country france = new Country("France", new BigDecimal("67000000"));
        Country spain = new Country("Spain", new BigDecimal("46000000"));
        Country luxemburg = new Country("Luxemburg", new BigDecimal("590000"));
        Country japan = new Country("Japan", new BigDecimal("126000000"));
        Country southkorea = new Country("South Korea", new BigDecimal("51400000"));
        Country armenia = new Country("Armenia", new BigDecimal("4500000"));
        Country ghana = new Country("Ghana", new BigDecimal("28900000"));
        Country angola = new Country("Angola", new BigDecimal("29800000"));
        Country kongo = new Country("Kongo", new BigDecimal("81300000"));
        countries.add(poland);
        countries.add(ukraine);
        countries.add(france);
        countries.add(spain);
        countries.add(luxemburg);
        countries.add(japan);
        countries.add(southkorea);
        countries.add(armenia);
        countries.add(ghana);
        countries.add(angola);
        countries.add(kongo);

        //When
        Continent continent = new Continent(countries);
        List<Continent> continents = new ArrayList<>();
        continents.add(continent);


        //Then
        World world = new World(continents);
        System.out.println(world.getPeopleQuantity());
        Assert.assertEquals(new BigDecimal("519490000"), world.getPeopleQuantity());

    }


}



