package com.kodilla.exception.test;

import javax.swing.text.StyledEditorKit;
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


        if (airportMap.get(flight.getArrivalAirport()) != null) {

            if (airportMap.get(flight.getArrivalAirport())) {
                System.out.println("Landing is available");
            } else {

                System.out.println("Landing is not available");
            }

        } else {
            throw new RouteNotFoundException("Landing is unavailable");
        }
    }
}

