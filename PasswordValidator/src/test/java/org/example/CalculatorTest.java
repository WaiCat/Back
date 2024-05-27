package org.example;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    @DisplayName("덧샘 연산을 수행한다.")
    @Test
    void additionTest() {
        int result = Calculator.calculate(1, "+", 2);
        AssertionsForClassTypes.assertThat(result).isEqualTo(3);
    }

    @DisplayName("뺄샘 연산을 수행한다.")
    @Test
    void subtractionTest() {
        int result = Calculator.calculate(1, "-", 2);
        AssertionsForClassTypes.assertThat(result).isEqualTo(-1);
    }

    @DisplayName("뺄샘 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculatorTest(int operand1,String operator, int operand2, int check) {
        int result = Calculator.calculate(operand1, operator, operand2);
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
}
