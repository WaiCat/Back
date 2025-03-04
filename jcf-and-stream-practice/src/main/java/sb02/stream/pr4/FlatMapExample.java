package sb02.stream.pr4;

import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
            List.of("Apple", "Banana"),
            List.of("Cat", "Dog"),
            List.of("Egg")
        );

        List<String> elems = nestedList.stream()
                .peek(strList -> System.out.println(strList))
                .flatMap(strList -> strList.stream())
                .peek(s -> System.out.println(s))
                .filter(s -> s.length() > 3)
                .toList();

        System.out.println(elems);
    }
}
