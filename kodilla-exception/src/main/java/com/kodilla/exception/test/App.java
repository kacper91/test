package com.kodilla.exception.test;

public class App {
    public static void main(String[] args) {

        try {
            Flight flight0001 = new Flight("Chopin airport", "Chicago airport");
            FlySearching flySearching = new FlySearching();
            flySearching.findFlight(flight0001);

        } catch (Exception e) {
            System.out.println("airport unavailable");
        } finally {
            System.out.println("\nThe end of program");

        }
    }
}
