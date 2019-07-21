package airport;


import java.util.Arrays;

public class Start {
    public static void main(String... args) {

        Flight flight1 = new Flight("WWA", "RZE");
        Flight flight2 = new Flight("RZE", "BER");
        Flight flight3 = new Flight("LIZ", "MIL");
        Flight flight4 = new Flight("RZE", "MIL");

        FlightSearch flightSearch = new FlightSearch(Arrays.asList(flight1, flight2, flight3, flight4));


        flightSearch.findFlyBetween("WWA", "MIL");


    }
}
