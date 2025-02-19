package org.example.stream.pr1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

//        List<String> namesWithLength = names.stream()
//                .map(new Function<String, String>(){
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        })
//                .toList();
//
//        System.out.println(namesWithLength);

        List<String> namesWithLength = names.stream()
                .map(name -> name + ": " + name.length())
                .toList();

        System.out.println(namesWithLength);

    }
}
