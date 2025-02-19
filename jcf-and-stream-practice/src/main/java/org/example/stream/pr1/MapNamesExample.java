package org.example.stream.pr1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Function<String, Integer>  nameLengthMapper = new Function<String, Integer>() {
            @Override
            public Integer apply(String name) {
                return name.length();
            }
        };

        names.stream()
                .map(nameLengthMapper)
                .forEach(length -> {
                     System.out.println("Length of name: " + length);

                });

        names.stream()
                .map(name -> name.length())
                .forEach(length -> {
                     System.out.println("Length of name: " + length);

                });
    }
}
