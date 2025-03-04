package sb02.stream.pr4;

import java.util.List;

public class SortedExample2 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Kim", 7),
                new Person("Lee", 10),
                new Person("Park", 23),
                new Person("Jang", 1),
                new Person("Ha", 100)
        );

        people.stream().sorted().forEach(System.out::println);
    }
}
