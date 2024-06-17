import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;


class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Сложение")
    public void testCalc_plus() {
        // given:
        final int a = 5;
        final int b = 7;
        final int expected = 12;
        // when:
        final int result = calculator.plus.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Вычитание")
    public void testCalc_minus() {
        //given;
        final int a = 34;
        final int b = 15;
        final int expected = 19;
        // when;
        final int result = calculator.minus.apply(a, b);
        // then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Деление")
    public void testCalc_devide() {
        //given;
        final int a = 121;
        final int b = 11;
        final int expected = 11;
        // when;
        final int result = calculator.devide.apply(a, b);
        // then;
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Деление на ноль")
    public void testCalc_devideByZero() {
        //given;
        final int a = 121;
        final int b = 0;
        // then
        assertThrows(ArithmeticException.class, () -> calculator.devide.apply(a, b), "Внимание!Деление на 0!");
    }

    @Test
    @DisplayName("Умножение")
    public void testCalc_multiply() {
        //given;
        final int a = 12;
        final int b = 4;
        final int expected = 48;
        // when;
        final int result = calculator.multiply.apply(a, b);
        // then;
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Абсолютное значение")
    public void testCalc_abs() {
        //given
        Calculator calc = new Calculator();
        final int x = -8;
        final int expected = 8;
        //when
        final int result = calc.abs.apply(x);
        //then
        Assertions.assertEquals(expected, result);
    }

    // hamcrest
    @Test
    @DisplayName("Возведение в квадрат")
    public void testCalc_pow() {
        final int a = 4;
        final int expected = 16;
        final int actual = calculator.pow.apply(a);
        assertThat(actual, is(expected));
    }

}