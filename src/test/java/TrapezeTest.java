import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrapezeTest {
    @ParameterizedTest
    @CsvSource({"31, 5, 77.5, 34, 147.5", "10.1 , 10, 50.5, 11.11, 81.71"})
    public void isCorrectCircuit(double dimensionA, double dimensionB, double dimensionC, double dimensionD, double expectedCircuit) {
        //when
        double result = Trapeze.circuit(dimensionA, dimensionB, dimensionC, dimensionD);
        //then
        assertEquals(expectedCircuit, result);
    }

    @ParameterizedTest
    @CsvSource({"31, 5, 77.5, 1395", "10.1 , 10, 50, 502.5"})
    public void isCorrectField(double dimensionA, double dimensionB, double dimensionH, double expectedField) {
        //when
        double result = Trapeze.Field(dimensionA, dimensionB, dimensionH);
        //then
        assertEquals(expectedField, result);
    }
}
