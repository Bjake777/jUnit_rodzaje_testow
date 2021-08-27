import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.FileSystemNotFoundException;

public class Circle {
    public static double circuit (double radious)  {
        BigDecimal circuit = new BigDecimal( 2 * 3.14 * radious);
        return circuit.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    public static double field(double radioius){
        BigDecimal field = new BigDecimal(3.14 * radioius * radioius);
        return field.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
