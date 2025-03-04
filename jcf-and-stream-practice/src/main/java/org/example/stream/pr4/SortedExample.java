package org.example.stream.pr4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 1, 9, 2, 5);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        numbers.stream()
                        .sorted(Comparator.reverseOrder())
                                .map(num ->"Number: "+num)
                                        .forEach(System.out::println);

        System.out.println("Sorted numbers: " + sortedNumbers);


    }
}
