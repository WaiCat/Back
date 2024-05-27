package example;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GradeCalculatorTest {

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 2, "B+"));

        GradeCalculator gradeCalculator = new GradeCalculator(new Courses(courses));
        double geadeResult = gradeCalculator.calculateGrade();

        AssertionsForClassTypes.assertThat(geadeResult).isEqualTo(4.5);
    }
}
