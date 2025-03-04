package sb02.stream.pr4;

import java.util.Comparator;
import java.util.List;

public class SortedCustomExample2 {

    public static class PersonCustomComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge() % 10, o2.getAge() % 10);
        }
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Kim", 7),
                new Person("Lee", 10),
                new Person("Park", 23),
                new Person("Jang", 1),
                new Person("Ha", 100)
        );

        people.stream()
                .sorted(new PersonCustomComparator())
                .forEach(System.out::println);
    }
}
