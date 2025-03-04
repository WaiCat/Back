package sb02.jcf.pr1.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea"); // 중복된 요소에 대한 더하기 시도

        System.out.println("After add: " + countries);

        System.out.println("Contains 'Japan'? " + countries.contains("Japan"));

        countries.remove("China");
        System.out.println("After remove 'China': " + countries);

        System.out.println("Set size: " + countries.size());

        countries.clear();
        System.out.println("After clear: " + countries);
    }
}
