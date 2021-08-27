import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @ParameterizedTest
    @CsvSource({"10, 9, 38", "3.14, 5, 16.28"})
    public void isCorrectCircuit(double dimensionA, double dimensionB, double expectedCircuit) {
        //when
        double result = Square.circuit(dimensionA, dimensionB);
        //then
        assertEquals(expectedCircuit, result);
    }

    @ParameterizedTest
    @CsvSource({"10, 9, 90", "3.14, 5, 15.7", "2.2, 5, 11","2.6, 6.1, 15.86"})
    public void isCorrectField(double dimensionA, double dimensionB, double expectedField) {
        //when
        double result = Square.field(dimensionA, dimensionB);
        //then
        assertEquals(expectedField, result);
    }
}
