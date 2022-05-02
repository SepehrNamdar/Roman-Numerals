import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    @Test
    void should_convert_Roman_Numeral_To_Arabic_Number() {
        RomanNumerals romanNumerals = new RomanNumerals();

        String result = romanNumerals.convert(1);

        assertThat(result).isEqualTo("I");
    }
}
