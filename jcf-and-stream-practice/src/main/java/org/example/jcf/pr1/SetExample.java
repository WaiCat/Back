package org.example.jcf.pr1;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");

        System.out.println("Elements in the set:");
        for (String element : set) {
            System.out.println(element);
        }

        System.out.println("Is 'banana' present in the set? " + set.contains("banana"));

        set.remove("banana");
    }
}
