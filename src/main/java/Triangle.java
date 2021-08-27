import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle {
    public static double circuit(double dimensionA, double dimensionB, double dimensionC) {
        BigDecimal circuit = new BigDecimal(dimensionA + dimensionB + dimensionC);
        return circuit.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double field(double dimensionA, double dimensionH) {
        BigDecimal field = new BigDecimal(dimensionA * dimensionH * 0.5);
        return field.setScale(2,RoundingMode.HALF_UP).doubleValue();
    }
}
