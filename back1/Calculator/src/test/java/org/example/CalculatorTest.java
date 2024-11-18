package org.example;

import org.assertj.core.api.Assertions;
import org.example.calculator.Calculator;
import org.example.calculator.PositiveNumber;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    @DisplayName("연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculatorTest(int operand1,String operator, int operand2, int check) {
        int result = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));
        AssertionsForClassTypes.assertThat(result).isEqualTo(check);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                Arguments.arguments(1, "+", 2, 3),
                Arguments.arguments(1, "-", 2, -1),
                Arguments.arguments(1, "*", 2, 2),
                Arguments.arguments(2, "/", 1, 2)
        );
    }

    @DisplayName("나눗셈에서 0을 나누는 경우 예외를 발생시킨다.")
    @Test
    void calculatorExceptionTest() {
        Assertions.assertThatCode(() -> Calculator.calculate(new PositiveNumber(1), "/", new PositiveNumber(0)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0으로는 나눌 수 없습니다.");
    }
}
