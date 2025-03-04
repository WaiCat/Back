package sb02.stream.pr1;

import java.util.function.Predicate;

public class EvenIntegerPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}
