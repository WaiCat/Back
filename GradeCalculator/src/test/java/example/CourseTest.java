package example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseTest {


    @Test
    void createTest() {
        Assertions.assertThatCode(() -> new src.test.java.example.Course("OOP", 3, "A+"))
                .doesNotThrowAnyException();

    }
}
