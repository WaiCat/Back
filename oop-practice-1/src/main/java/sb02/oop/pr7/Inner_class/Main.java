package sb02.oop.pr7.Inner_class;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(10);
        Outer.Inner inner = outer.new Inner();
        inner.printInstanceValues();
    }
}
