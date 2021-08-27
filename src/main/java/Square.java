import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square {
    public static double circuit(double dimensionA, double dimensionB) {
        BigDecimal circuit = new BigDecimal(dimensionA + dimensionA + dimensionB + dimensionB);
        return circuit.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double field(double dimensionA, double dimensionB) {
        BigDecimal field = new BigDecimal(dimensionA * dimensionB);
        return field.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
