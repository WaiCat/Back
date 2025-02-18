package org.example.pr1;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println("fruits = " + fruits);
        
        String secondFruits = fruits.get(0);
        System.out.println("secondFruits = " + secondFruits);

        fruits.remove(0);
        System.out.println("fruits = " + fruits);

        fruits.remove("banana");
        System.out.println("fruits = " + fruits);

        fruits.clear();
        System.out.println("fruits = " + fruits);
    }
}