package challenges;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String result = movieStore.getMovies().entrySet().stream()
                .map(s->s.toString())
                .collect(Collectors.joining(" ! "));

        System.out.println(result);
    }

}
