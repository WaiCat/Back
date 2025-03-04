package com.sb02.generic;

import java.util.List;

public class NoGenericDemo {

    public static void main(String[] args) {

        // Object 타입으로 선언된 리스트는 모든 타입의 객체를 담을 수 있다. (안정성 X)
        List<Object> list = List.of("Hello", 1, 10.0, -100, new SomeCustomClass("뭐지 이건"));
        System.out.println(list);

        Integer[] intArray = {1, 2, 3, 4, 5};
        Float[] floatArray = {1.5f, 2.2f, 3.1f, 4.009f, 5.2f};
        String[] stringArray = {"Hello", "World", "Java"};

        System.out.println("Printing intArray w. printIntArray()");
        printIntArray(intArray);
        System.out.println("Printing floatArray w. printFloatArray()");
        printFloatArray(floatArray);
        System.out.println("Printing stringArray w. printStringArray()");
        printStringArray(stringArray);

        System.out.println("Printing intArray w. printAnyObjectArray()");
        printAnyObjectArray(intArray);
        System.out.println("Printing floatArray w. printAnyObjectArray()");
        printAnyObjectArray(floatArray);
        System.out.println("Printing stringArray w. printAnyObjectArray()");
        printAnyObjectArray(stringArray);
    }

    public static class SomeCustomClass {
        private String content;

        public SomeCustomClass(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "SomeCustomClass{" +
                    "content='" + content + '\'' +
                    '}';
        }
    }

    public static void printAnyObjectArray(Object[] array) {
        for (Object o : array) {
            System.out.println(o);
        }
    }

    public static void printIntArray(Integer[] intArray) {
        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void printFloatArray(Float[] intArray) {
        for (float j : intArray) {
            System.out.println(j);
        }
    }

    public static void printStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
