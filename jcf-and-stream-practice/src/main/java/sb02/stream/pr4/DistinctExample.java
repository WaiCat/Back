package sb02.stream.pr4;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Kim", "Park", "Lee");

        names.stream()
                .distinct()
                .map(name -> "Distinct name: " + name)
                .forEach(System.out::println);
    }
}
