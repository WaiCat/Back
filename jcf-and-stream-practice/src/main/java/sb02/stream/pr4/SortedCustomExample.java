package sb02.stream.pr4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedCustomExample {

    public static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String refined_o1 = o1.replaceAll(" ", "");
            String refined_o2 = o2.replaceAll(" ", "");
            return Integer.compare(refined_o1.length(), refined_o2.length());
        }
    }

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Seoul", "Bu       san", "New York", "London");

        cities.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);

        System.out.println("---");

        cities.stream()
                .sorted(new CustomComparator().reversed())
                .forEach(System.out::println);

        System.out.println("---");

        cities.stream()
                .sorted((str1, str2) -> str1.length() < str2.length() ? -1 : (str1.length() == str2.length() ? 0 : 1))
                .forEach(System.out::println);
    }
}
