package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlySearching {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Chopin Airport", true);
        airportMap.put("Ireland Airport", true);
        airportMap.put("Chicago Airport", false);
        airportMap.put("Washington Airport", true);
        airportMap.put("Krakow Airport", false);

        if (airportMap.get("Chopin Airport") != null) {
            System.out.println("Airport ready");

        } else {
            throw new RouteNotFoundException("error");
        }
    }
}

