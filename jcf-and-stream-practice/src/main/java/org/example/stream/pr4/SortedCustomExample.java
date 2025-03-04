package org.example.stream.pr4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedCustomExample {
    public static void main(String[] args) {
        List<String> cities  = Arrays.asList("Seoul", "Busna", "New York", "London");

        cities.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);
    }
}
