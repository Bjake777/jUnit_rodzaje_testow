import java.math.BigDecimal;
import java.math.RoundingMode;

public class Trapeze {
    public static double circuit(double dimensionA, double dimensionB, double dimensionC, double dimensionD) {
        BigDecimal circuit = new BigDecimal(dimensionA + dimensionB + dimensionC + dimensionD);
        return circuit.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double Field(double dimensionA, double dimensionB, double dimensionH) {
        BigDecimal field = new BigDecimal((dimensionA + dimensionB) * dimensionH * 0.5);
        return field.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
