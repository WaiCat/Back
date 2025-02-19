package org.example.stream.pr1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class MapEntryTransfomationExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 85);
        scores.put("Lee", 92);
        scores.put("Park", 78);

        List<Map.Entry<String, Integer>> scoreEntries
                = scores.entrySet().stream().toList();

        System.out.println(scoreEntries);

        Function<Map.Entry<String, Integer>, String> entryToSring =
                new Function<Map.Entry<String, Integer>, String>() {
                    @Override
                    public String apply(Map.Entry<String, Integer> entry) {
                        return entry.getKey() + ": " + entry.getValue();
                    }
                };

        scores.entrySet().stream()
                .map(entryToSring)
                .forEach(result -> System.out.println(result));


        scores.entrySet().stream()
                .map(entryToSring)
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });

    }
}
