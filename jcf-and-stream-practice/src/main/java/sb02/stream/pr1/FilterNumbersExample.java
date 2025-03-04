package sb02.stream.pr1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterNumbersExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        Stream<Integer> stream = numbers.stream();
        Stream<Integer> evenStream = stream.filter(new EvenIntegerPredicate());
        Stream<Integer> overTenStream = evenStream.filter(
                new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer value) {
                        return value > 10;
                    }
                }
        );
        Stream<Integer> overTwentyStream = overTenStream.filter(value -> value > 20);

        overTwentyStream.forEach(num -> {
            System.out.println(num);
        });

        numbers.stream()
                .filter(val -> val % 2 == 0)
                .filter(val -> val > 10)
                .filter(val -> val > 20)
                .forEach(System.out::println);
    }
}
