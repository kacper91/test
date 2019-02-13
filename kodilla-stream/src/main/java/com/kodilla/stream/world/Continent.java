package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private String continentName;
    private Country country;

    public Continent(Country country ){
        this.country=country;
    }
    List<Continent> Europe = new ArrayList<>();
    List<Continent> Africa = new ArrayList<>();
    List<Continent> Asia = new ArrayList<>();

}
