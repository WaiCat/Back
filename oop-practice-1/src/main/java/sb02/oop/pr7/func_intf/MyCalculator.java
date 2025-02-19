package sb02.oop.pr7.func_intf;

@FunctionalInterface //한가지의 기능만 있는 인터페이스
public interface MyCalculator {
    int operator(int x, int y);
}
