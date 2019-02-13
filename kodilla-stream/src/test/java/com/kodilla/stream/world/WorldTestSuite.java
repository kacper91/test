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
        List<Continent> continents = new ArrayList<>();
        //When
        //Then
        World world = new World(continents);
        Assert.assertEquals(world.getPeopleQuantity(), new BigDecimal("519490000"));

    }


}



