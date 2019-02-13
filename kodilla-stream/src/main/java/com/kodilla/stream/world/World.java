package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private Continent continent;
    private BigDecimal peopleQuantity;

public World(Continent continent,BigDecimal peopleQuantity){
    this.continentName=continentName;
    this.peopleQuantity=peopleQuantity;
}

    List<Continent> continentsList = new ArrayList<>();


    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;

    }

}
