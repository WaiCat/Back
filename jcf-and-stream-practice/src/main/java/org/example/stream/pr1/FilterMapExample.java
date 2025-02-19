package org.example.stream.pr1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Kim", 85);
        scores.put("Lee", 92);
        scores.put("Park", 78);
        scores.put("Kim", 88);

//        Predicate<Map.Entry<String, Integer>> highscore = new Predicate<Map.Entry<String, Integer>>(){
//            @Override
//            public boolean test(Map.Entry<String, Integer> entry) {
//                return entry.getValue() >= 80;
//            }
//        };

        // entrySet : 자료를 1차원 구조로 바꿔줌
//        scores.entrySet().stream()
//                .filter(highscore)
//                .forEach(entry -> {
//                    System.out.println(entry.getKey() + " : " + entry.getValue());
//                });

            scores.entrySet().stream()
            .filter(entry -> entry.getValue() >= 80)
            .forEach(entry -> {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            });

        Map<String, Integer> filteredScore = scores.entrySet().stream()
            .filter(entry -> entry.getValue() >= 80)
            .collect(Collectors.toMap(
                    entry -> entry.getKey(),
                    entry -> entry.getValue()
            ));
        System.out.println(filteredScore);

    }
}
