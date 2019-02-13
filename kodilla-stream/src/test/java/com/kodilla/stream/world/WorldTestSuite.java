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

        //When
        List<Country> countryList = new ArrayList<>();
        countryList.add(poland);
        countryList.add(ukraine);
        countryList.add(france);
        countryList.add(spain);
        countryList.add(luxemburg);
        countryList.add(japan);
        countryList.add(southkorea);
        countryList.add(armenia);
        countryList.add(ghana);
        countryList.add(angola);
        countryList.add(kongo);

        //Then
        int size = countryList.size();
        Assert.assertEquals(size, 11);

    }

    @Test
    public void testContinent() {
        //Given
        Continent eur1 = new Continent(new Country("Poland", new BigDecimal("40000000")));
        Continent eur2 = new Continent(new Country("Ukraine", new BigDecimal("44000000")));
        Continent eur3 = new Continent(new Country("France", new BigDecimal("67000000")));
        Continent eur4 = new Continent(new Country("Spain", new BigDecimal("46000000")));
        Continent eur5 = new Continent(new Country("Luxemburg", new BigDecimal("590000")));

        Continent afr1 = new Continent(new Country("Ghana", new BigDecimal("28900000")));
        Continent afr2 = new Continent(new Country("Angola", new BigDecimal("29800000")));
        Continent afr3 = new Continent(new Country("Kongo", new BigDecimal("81300000")));

        Continent asia1 = new Continent(new Country("Japan", new BigDecimal("126000000")));
        Continent asia2 = new Continent(new Country("South Korea", new BigDecimal("51400000")));
        Continent asia3 = new Continent(new Country("Armenia", new BigDecimal("4500000")));

        List<Continent> Europe = new ArrayList<>();
        List<Continent> Africa = new ArrayList<>();
        List<Continent> Asia = new ArrayList<>();

        Europe.add(eur1);
        Europe.add(eur2);
        Europe.add(eur3);
        Europe.add(eur4);
        Europe.add(eur5);
        Africa.add(afr1);
        Africa.add(afr2);
        Africa.add(afr3);
        Asia.add(asia1);
        Asia.add(asia2);
        Asia.add(asia3);


        //Given
//        List<Country> europe = new ArrayList<>();
//        europe.add(new Country("Poland", new BigDecimal("40000000")));
//        europe.add(new Country("Ukraine", new BigDecimal("44000000")));
//        europe.add(new Country("France", new BigDecimal("67000000")));
//        europe.add(new Country("Spain", new BigDecimal("46000000")));
//        europe.add(new Country("Luxemburg", new BigDecimal("590000")));
//
//
//        List<Country> asia = new ArrayList<>();
//        asia.add(new Country("Japan", new BigDecimal("126000000")));
//        asia.add(new Country("South Korea", new BigDecimal("51400000")));
//        asia.add(new Country("Armenia", new BigDecimal("4500000")));
//
//
//        List<Country> africa = new ArrayList<>();
//        africa.add(new Country("Ghana", new BigDecimal("28900000")));
//        africa.add(new Country("Angola", new BigDecimal("29800000")));
//        africa.add(new Country("Kongo", new BigDecimal("81300000")));
//        //When
//        //Then
//
//        Assert.assertEquals(europe.size(), 5);
//        Assert.assertEquals(asia.size(), 3);
//        Assert.assertEquals(africa.size(), 3);

    }

    @Test
    public void testGetPeopleOfContinent() {



    }

}



