package org.example.stream.pr3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InstanceMethodRefDemo {
    public void printString(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        InstanceMethodRefDemo demo = new InstanceMethodRefDemo();

        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        Consumer<String> consumer = demo::printString;
        list.forEach(consumer);

    }
}
