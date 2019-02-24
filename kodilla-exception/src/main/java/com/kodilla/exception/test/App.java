package com.kodilla.exception.test;

public class App {
    public static void main(String[] args) {

        try {
            Flight flight0001 = new Flight("Chopin Airport", "Chicago Airport");
            FlySearching flySearching = new FlySearching();
            flySearching.findFlight(flight0001);

        } catch (Exception e) {
            System.out.println("Airport unavailable");
        } finally {
            System.out.println("\nThe end of program");

        }
    }
}
