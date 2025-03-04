package org.example.stream.pr4;

import java.util.List;

public class SortredExample2 {
    public static void main(String[] args) {
        List<Person> people =  List.of(
                new Person("Kim", 7),
                new Person("Park", 3),
                new Person("Lee", 9),
                new Person("Choi", 5)
        );

        people.stream().sorted().forEach(System.out::println);
    }
}
