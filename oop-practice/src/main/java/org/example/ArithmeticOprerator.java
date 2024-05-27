package org.example;

import java.util.Arrays;

public enum ArithmeticOprerator {
    ADDITION("+") {
        @Override
        public int Arithemticcalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }, SUBTRACTION("-") {
        @Override
        public int Arithemticcalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int Arithemticcalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, DIVISION("/") {
        @Override
        public int Arithemticcalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmeticOprerator(String operator) {
        this.operator = operator;
    }

    public abstract int Arithemticcalculate(final int operand1, final int operand2);


    public static int calculate(int operand1, String operator, int operand2){
        ArithmeticOprerator arithmeticOprerator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

        return arithmeticOprerator.Arithemticcalculate(operand1, operand2);
    }

}
