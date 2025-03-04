package org.example.stream.pr3;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        PersonFactory factory1 = (name, age) -> new Person(name, age);
        Person p1 = factory1.create("Kim", 22);
        System.out.println("p1 = " + p1);
        
        
        PersonFactory factory2 = Person::new;
        Person p2 = factory2.create("Park", 23);
        System.out.println("p2 = " + p2);
        
    }
}
