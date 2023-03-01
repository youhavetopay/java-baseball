import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("숫자 계산")
    void calculate(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 2));
        List<String> operators = new ArrayList<>(Arrays.asList("+", "*", "/"));
        assertThat(calculator.calculate(numbers, operators)).isEqualTo(10.0);

    }

}
