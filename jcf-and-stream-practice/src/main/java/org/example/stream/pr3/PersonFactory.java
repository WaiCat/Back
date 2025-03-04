package org.example.stream.pr3;

@FunctionalInterface
public interface PersonFactory {
    Person create(String name, int age);
}
