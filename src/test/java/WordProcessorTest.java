import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class WordProcessorTest {


    private WordProcessor processor;

    @BeforeEach
    void setUp(){
        processor = new WordProcessor();
    }

    @Test
    @DisplayName("문자열 입력 테스트")
    void stringInput(){
        // scanner 테스트 https://steadyjay.tistory.com/m/10
        String input = "2 + 3 * 4 / 2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertThat(processor.inputString()).isEqualTo(input);
    }

}
