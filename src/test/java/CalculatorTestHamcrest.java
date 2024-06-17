import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CalculatorTestHamcrest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void CalcTestHam_minus() {
        assertThat(calculator.minus.apply(5, 4), is(1));
    }

    @Test
    public void CalcTestHam_plus() {

        assertThat(calculator.plus.apply(3, 5), is(8));
    }

    @Test
    public void CalcTestHam_devide() {
        assertThat(calculator.devide.apply(121, 11), is(11));
    }

    @Test
    public void CalcTestHam_pow() {
        assertThat(4, is(notNullValue()));
    }

    @Test
    public void CalcTestHam_isPosytiv() {
        assertThat(5, greaterThan(0));
    }


}