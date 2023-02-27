package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] firstWords = "1,2".split(",");
        assertThat(firstWords).containsExactly("1","2");

        String[] secondWords = "1".split(",");
        assertThat(secondWords).containsExactly("1");

    }

    @Test
    void substring(){
        String word = "(1,2)".substring(1, 4);
        assertThat(word).isEqualTo("1,2");
    }
}
