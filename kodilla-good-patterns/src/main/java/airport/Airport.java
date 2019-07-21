package airport;

import java.util.Arrays;
import java.util.List;

public class Airport {
    Connection connection;

    private String name;

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Airport warsaw = new Airport("Warsaw");
    Airport berlin = new Airport("Berlin");
    Airport radom = new Airport("Radom");
    Airport rhodos = new Airport("Rhodos");
    Airport milan = new Airport("Milan");


    List<Airport> availableAirports = Arrays.asList(warsaw, berlin, radom, rhodos, milan);

    Connection warsawBerlin = new Connection(warsaw, berlin);
    Connection warsawMilan = new Connection(warsaw, milan);
    Connection warsawRhodos = new Connection(warsaw, rhodos);
    Connection milanRadom = new Connection(milan, radom);
    Connection milanRhodos = new Connection(milan, rhodos);
    Connection radomWarsaw = new Connection(radom, warsaw);


    List<Connection> connectionList = Arrays.asList(warsawBerlin, warsawMilan, warsawRhodos, milanRadom, milanRhodos, radomWarsaw);

    public void startAirport() {
        connectionList.stream() //wyswietlenie lotnisk poczatkowych
                .map(v -> v.startAirport.getName())
                .forEach(System.out::println);
    }

    public void finishAirport() {
        connectionList.stream()
                .map(b -> b.finishAirport.getName())
                .forEach(System.out::println);
    }

}
