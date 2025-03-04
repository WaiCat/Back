package sb02.stream.pr3;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefDemo {

    // 객체 범위 (member method)
    public void printString(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        InstanceMethodRefDemo demo = new InstanceMethodRefDemo();

        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        list.forEach(demo::printString);
    }
}
