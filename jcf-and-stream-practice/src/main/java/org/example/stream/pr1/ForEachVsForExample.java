package org.example.stream.pr1;

import java.util.Arrays;
import java.util.List;

public class ForEachVsForExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        System.out.println("== using for loop==");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                continue;
            }
            System.out.println("numbers.get(i)); = " + numbers.get(i));
        }
    }
}
