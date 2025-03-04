package sb02.stream.pr1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMapExample {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 75);
        scores.put("Park", 88);
        scores.put("Kim", 100);

        /*
        2차원 구조
        "Kim" 100
        "Lee" 75
        "Park" 88

        stream을 위해서는 1차원 구조(Map.Entry)로 변경
        ("Kim", 100), ("Lee", 75"), ("Park", 88)
         */

//        Predicate<Map.Entry<String, Integer>> highScore = new Predicate<Map.Entry<String, Integer>>() {
//            @Override
//            public boolean test(Map.Entry<String, Integer> entry) {
//                return entry.getValue() >= 80;
//            }
//        };

        scores.entrySet().stream()
                .filter(entry -> entry.getValue() >= 80)
                .forEach(entry -> {
                    System.out.println("High scorer: " + entry.getKey() + " => " + entry.getValue());
                });

        System.out.println("------------");

        Map<String, Integer> filteredScores = scores.entrySet().stream()
                .filter(entry -> entry.getValue() >= 80)
                .collect(
                        Collectors.toMap(
                                entry -> entry.getKey(),
                                entry -> entry.getValue()
                        )
                );
        System.out.println(filteredScores);
    }
}
