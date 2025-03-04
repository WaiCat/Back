package org.example.stream.pr4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectSquareEvenExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,5,7,21,1,2);

        List<Integer> process = numbers.stream()
                .filter(n-> n%2 == 0)
                .map(n-> n*n)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(process);
    }
}
