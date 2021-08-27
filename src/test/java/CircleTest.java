
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @ParameterizedTest
    @CsvSource({"3, 18.84", "5, 31.4", "10, 62.8"})
    public void isCorrectCircuit(double radius, double expectedCircuit) {
        //when
        double result = Circle.circuit(radius);
        //then
        assertEquals(expectedCircuit, result);
    }

    @ParameterizedTest
    @CsvSource({"3, 28.26", "5, 78.5", "10, 314.0"})
    public void isCorrectField(double radius, double expectedField) {
        //when
        double result = Circle.field(radius);
        //then
        assertEquals(expectedField, result);
    }

}
