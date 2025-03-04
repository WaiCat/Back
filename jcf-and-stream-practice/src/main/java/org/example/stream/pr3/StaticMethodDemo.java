package org.example.stream.pr3;

import java.util.function.Function;

public class StaticMethodDemo {
    public static int doubleValue(int x){
        return x * 2;
    }

    public static void main(String[] args) {
//        Function<Integer, Integer> f1 =
//                num -> StaticMethodDemo.doubleValue(num);

        Function<Integer, Integer> f1 = StaticMethodDemo::doubleValue;

        System.out.println(f1.apply(5));
    }
}
