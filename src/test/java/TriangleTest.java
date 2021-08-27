import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TriangleTest {
    @ParameterizedTest
    @CsvSource({"31, 5, 16.28, 52.28", "10.1 ,10 , 10, 30.1"})
    public void isCorrectCircuit(double dimensionA, double dimensionB, double dimensionC, double expectedCircuit){
        //when
        double result = Triangle.circuit(dimensionA, dimensionB, dimensionC);
        //then
        assertEquals(expectedCircuit, result);
    }

    @ParameterizedTest
    @CsvSource({"31, 5, 77.5", "10.1 ,10 , 50.5"})
    public void isCorrectField(double dimensionA, double dimensionH, double expectedCircuit){
        //when
        double result = Triangle.field(dimensionA, dimensionH);
        //then
        assertEquals(expectedCircuit, result);
    }
}
