package study;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set 길이 확인 테스트")
    void size(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    // @Test 이거 지워줘야 함
    @DisplayName("Set contains 테스트")
    @ParameterizedTest // 여기에도 Test가 있어서 중복됨
    @ValueSource(ints = {1,2,3})
    void contains(int input){
        assertThat(numbers.contains(input)).isTrue();
    }
}
