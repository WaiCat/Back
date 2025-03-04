package com.sb02.generic;

import com.sb02.generic.shape.Circle;
import com.sb02.generic.shape.Rectangle;
import com.sb02.generic.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Circle(3.0));

        printAllShapes(shapes);

        List<Object> shapes2 = new ArrayList<>();
        addDefaultShapes(shapes2);
        printAll(shapes2);
    }

    // List shapes 파라미터를 생산자로 사용하겠다.
    public static void printAllShapes(List<? extends Shape> shapes) {
        // shapes.add(new Circle(1.0)); // 컴파일 에러
        for (Shape s : shapes) {
            System.out.println(s + ", area: " + s.getArea());
        }
    }

    // List list 파라미터를 소비자로 사용하겠다.
    public static void addDefaultShapes(List<? super Shape> list) {
        list.add(new Circle(1.0));
        list.add(new Rectangle(2.0, 3.0));
    }

    // List shapes를 일반 제너릭을 이용해서 사용한 함수 예시.
    public static <T> void printAll(List<T> shapes) {
        for (T s : shapes) {
            System.out.println(s);
        }
    }
}
