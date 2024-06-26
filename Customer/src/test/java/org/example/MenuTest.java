package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuTest {

    @DisplayName("메뉴 이름에 해당하는 메뉴를 반환한다")
    @Test
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));

        MenuItem menuItems = menu.choose("돈까스");

        assertThat(menuItems).isEqualTo(new MenuItem("돈까스", 5000));
    }


    @DisplayName("메뉴판에 없는 메뉴를 선택할 시 메뉴를 반환한다.")
    @Test
    void chooseTest2() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));

        assertThatCode(()-> menu.choose("통닭"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("없는 메뉴 입니다.");
    }
}
