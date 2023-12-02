package seminars.first.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // Проверка метода calculateDiscount:
        assertThat(Calculator.calculateDiscount(100.0, 20)).isEqualTo(80.0);
        assertThat(Calculator.calculateDiscount(50.0, 10)).isEqualTo(45.0);
        assertThat(Calculator.calculateDiscount(0.0, 5)).isEqualTo(0.0);
        assertThat(Calculator.calculateDiscount(150.0, 0)).isEqualTo(150.0);

        // Проверка метода calculateDiscount с некорректными аргументами:
        assertThatThrownBy(() ->
                Calculator.calculateDiscount(-50.0, 10)
        ).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() ->
                Calculator.calculateDiscount(100.0, -10)
        ).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() ->
                Calculator.calculateDiscount(100.0, 110)
        ).isInstanceOf(IllegalArgumentException.class);

        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
        System.out.println(Calculator.squareRootExtraction(169));
    }
}
