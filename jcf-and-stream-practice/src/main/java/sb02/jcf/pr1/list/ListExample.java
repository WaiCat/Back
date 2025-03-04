package sb02.jcf.pr1.list;

import java.util.LinkedList;
import java.util.List;


public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

        fruits.add("Apple");    // 0
        fruits.add("Banana");   // 1
        fruits.add("Cherry");   // 2
        System.out.println("After add: " + fruits);

        String secondFruit = fruits.get(1);
        System.out.println("Second fruit: " + secondFruit);

        fruits.remove(0);
        System.out.println("After remove: " + fruits);

        fruits.remove("Banana");
        System.out.println("After remove: " + fruits);

        System.out.println("List size: " + fruits.size());

        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}
