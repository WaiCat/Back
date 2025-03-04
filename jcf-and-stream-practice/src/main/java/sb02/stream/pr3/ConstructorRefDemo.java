package sb02.stream.pr3;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        PersonFactory factory1 = (name, age) -> new Person(name, age);
        Person p1 = factory1.create("Kim", 25);
        System.out.println("Created Person: " + p1);

        PersonFactory factory2 = Person::new;
        Person p2 = factory2.create("Park", 21);
        System.out.println("Created Person: " + p2);
    }
}
