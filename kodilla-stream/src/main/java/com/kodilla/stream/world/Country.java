package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private String countryName;
    private BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName(){
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    public String toString(){
        return ("Country name: " + countryName + " people quantity: " + peopleQuantity);
    }
}
