package sb02.stream.pr1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        Function<Map.Entry<String, Integer>, String> entryToString =
                new Function<Map.Entry<String, Integer>, String>() {
                    @Override
                    public String apply(Map.Entry<String, Integer> entry) {
                        return entry.getKey() + ": " + entry.getValue();
                        // ("Kim", 90) => "Kim: 90"
                    }
                };

        scores.entrySet().stream()
                .map(entryToString)
                .forEach(s -> System.out.println(s));
//                .forEach(new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//                        System.out.println(s);
//                    }
//                });
    }
}
