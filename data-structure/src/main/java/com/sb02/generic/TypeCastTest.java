package com.sb02.generic;

public class TypeCastTest {
    public static void main(String[] args) {
        String numberText = "20";
        double doubleNum = 10.0;
        Integer number1 = Integer.parseInt(numberText);
        Integer number2 = (int) doubleNum;      // 같은 숫자 타입이므로 컴파일 에러가 발생하지 않음
        // Integer number3 = (int) numberText;  // 컴파일 에러
    }
}
