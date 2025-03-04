package sb02.stream.pr3;

@FunctionalInterface
public interface PersonFactory {
    Person create(String name, int age);
}
