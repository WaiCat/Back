package sb02.stream.pr4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 9);

        numbers.stream()
                .sorted(Comparator.reverseOrder())
//                .forEach(num -> System.out.println("Number: " + num));
                .map(num -> "Number: " + num)
                .forEach(System.out::println);
    }
}
