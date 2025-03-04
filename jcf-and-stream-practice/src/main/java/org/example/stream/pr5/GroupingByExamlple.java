package org.example.stream.pr5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExamlple {
    public static void main(String[] args) {
        List<String> names = List.of("Kim", "Lee", "choi", "Park", "Kang");

        Map<String, List<String>> collect = names.stream()
                .collect(Collectors.groupingBy(
                        name -> String.valueOf(name.charAt(0)))
                );

        System.out.println(collect);
    }


}
