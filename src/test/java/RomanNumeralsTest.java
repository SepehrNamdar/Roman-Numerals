import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    // Single Assertion Principle
    @Test
    void should_convert_Arabic_Numeral_To_Roman_Number() {

        assertThat(new RomanNumerals(1).convert()).isEqualTo("I");
        assertThat(new RomanNumerals(2).convert()).isEqualTo("II");
        assertThat(new RomanNumerals(3).convert()).isEqualTo("III");

        assertThat(new RomanNumerals(5).convert()).isEqualTo("V");
        assertThat(new RomanNumerals(6).convert()).isEqualTo("VI");
        assertThat(new RomanNumerals(7).convert()).isEqualTo("VII");
        assertThat(new RomanNumerals(8).convert()).isEqualTo("VIII");

        assertThat(new RomanNumerals(10).convert()).isEqualTo("X");
        assertThat(new RomanNumerals(11).convert()).isEqualTo("XI");
        assertThat(new RomanNumerals(12).convert()).isEqualTo("XII");
        assertThat(new RomanNumerals(13).convert()).isEqualTo("XIII");

        assertThat(new RomanNumerals(20).convert()).isEqualTo("XX");
        assertThat(new RomanNumerals(21).convert()).isEqualTo("XXI");
        assertThat(new RomanNumerals(28).convert()).isEqualTo("XXVIII");
        assertThat(new RomanNumerals(25).convert()).isEqualTo("XXV");

        assertThat(new RomanNumerals(30).convert()).isEqualTo("XXX");
        assertThat(new RomanNumerals(37).convert()).isEqualTo("XXXVII");

        assertThat(new RomanNumerals(50).convert()).isEqualTo("L");
        assertThat(new RomanNumerals(60).convert()).isEqualTo("LX");
        assertThat(new RomanNumerals(70).convert()).isEqualTo("LXX");
        assertThat(new RomanNumerals(80).convert()).isEqualTo("LXXX");
        assertThat(new RomanNumerals(87).convert()).isEqualTo("LXXXVII");

        assertThat(new RomanNumerals(652).convert()).isEqualTo("DCLII");
        assertThat(new RomanNumerals(1549).convert()).isEqualTo("MDXLIX");

    }

}
