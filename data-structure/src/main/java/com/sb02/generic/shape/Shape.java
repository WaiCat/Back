package com.sb02.generic.shape;

public interface Shape extends Comparable<Shape> {
    double getArea();


    // default로 구현된 compareTo 메서드를 제공함으로써,
    // Shape 인터페이스를 구현하는 클래스에서 compareTo 메서드를 구현하지 않아도 된다.
    default int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
