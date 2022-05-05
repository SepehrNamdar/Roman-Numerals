import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    private final Map<Integer, String> romanNumeralSymbols;
    private int arabicNumber;

    public RomanNumerals(int arabicNumber) {
        this.arabicNumber = arabicNumber;
        romanNumeralSymbols = new LinkedHashMap<>();
        romanNumeralSymbols.put(1000, "M");
        romanNumeralSymbols.put(900, "CM");
        romanNumeralSymbols.put(500, "D");
        romanNumeralSymbols.put(400, "CD");
        romanNumeralSymbols.put(100, "C");
        romanNumeralSymbols.put(90, "XC");
        romanNumeralSymbols.put(50, "L");
        romanNumeralSymbols.put(40, "XL");
        romanNumeralSymbols.put(10, "X");
        romanNumeralSymbols.put(9, "IX");
        romanNumeralSymbols.put(5, "V");
        romanNumeralSymbols.put(4, "IV");
        romanNumeralSymbols.put(1, "I");
    }

    public String convert() {
        StringBuilder romanNumeral = new StringBuilder();

        for (Integer number : romanNumeralSymbols.keySet()) {
            final StringBuilder converted = findSymbol(number);
            romanNumeral.append(converted);
        }

        return romanNumeral.toString();
    }

    private StringBuilder findSymbol(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        while (arabicNumber >= number) {    // Transformation Priority Premise
            final String romanSymbol = romanNumeralSymbols.get(number);
            romanNumeral.append(romanSymbol);
            arabicNumber -= number;
        }
        return romanNumeral;
    }

}
