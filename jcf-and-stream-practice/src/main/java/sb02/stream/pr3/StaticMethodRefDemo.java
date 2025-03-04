package sb02.stream.pr3;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class StaticMethodRefDemo {

    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void printString(String x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
//        Function<Integer, Integer> f1 =
//                num -> StaticMethodRefDemo.doubleValue(num);

        Function<Integer, Integer> f1 = StaticMethodRefDemo::doubleValue;
        System.out.println(f1.apply(5));

        BiFunction<Integer, Integer, Integer> f2 = Math::addExact;
        System.out.println(f2.apply(5, 10));

        BinaryOperator<Integer> f3 = Math::addExact;
        System.out.println(f3.apply(5, 10));

        Consumer<String> c1 = StaticMethodRefDemo::printString;
        c1.accept("Hello");
    }
}
