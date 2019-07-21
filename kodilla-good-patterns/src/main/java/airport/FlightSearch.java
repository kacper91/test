package airport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlightSearch {

    private final List<Flight> connectionList;


    public FlightSearch(List<Flight> connectionList) {
        this.connectionList = connectionList;
    }

    public List<Flight> findFlyFromAirport(String startAirport) {

        List<Flight> result = connectionList.stream()
                .filter(v -> v.getStartAirport().equals(startAirport))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
    }


    public List<Flight> findFlyToDestination(String finishAirport) {

        List<Flight> result = connectionList.stream()
                .filter(b -> b.getFinishAirport().equals(finishAirport))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;

    }

    public void findFlyBetween(String startAirport, String finishAirport) {

        List<Flight> startList = findFlyFromAirport(startAirport);
        List<Flight> resultList = connectionList.stream()
                .filter(s -> startList.stream()
                        .map(f -> f.getFinishAirport())
                        .collect(Collectors.toList())
                        .contains(s.getStartAirport())
                )
                .filter(d -> d.getFinishAirport().equals(finishAirport))


                .collect(Collectors.toList());


        resultList.forEach(System.out::println);
    }


}
