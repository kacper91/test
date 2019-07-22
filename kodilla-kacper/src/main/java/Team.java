import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team {

    List<Person> newTeam = new ArrayList<>();

    public void addPersonToTeam(String name, String lastname, int age, char sex) {
        Person person = new Person(name, lastname, age, sex);

        if (newTeam.contains(person)) {
            System.out.println("Person " + person + " already exist");

        } else {
            newTeam.add(person);
            System.out.println(person + " add to team");

        }

        System.out.println("Team completed " + newTeam.size() + " person");
    }

    public void personOlderThan25() {
        System.out.println("Older than 25yo: ");
        newTeam.stream()
                .filter(c -> c.getAge() > 25)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    public void showOnlyWoman() {
        System.out.println("Woman in team: ");
        newTeam.stream()
                .filter(d -> d.getSex() == 'f')
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    public void totalAgeInTeam() {
        System.out.println("Total age in team: ");
        int totalAge = newTeam.stream()
                .collect(Collectors.summingInt(Person::getAge));
        System.out.println(totalAge);
    }


}
