package airport;

import java.util.Objects;

public class Flight {
    private final String startAirport;
    private final String finishAirport;

    public String getStartAirport() {
        return startAirport;
    }

    public String getFinishAirport() {
        return finishAirport;
    }

    public Flight(String startAirport, String finishAirport) {
        this.startAirport = startAirport;
        this.finishAirport = finishAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startAirport='" + startAirport + '\'' +
                ", finishAirport='" + finishAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(startAirport, flight.startAirport) &&
                Objects.equals(finishAirport, flight.finishAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startAirport, finishAirport);
    }
}
