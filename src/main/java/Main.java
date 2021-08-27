import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        double radious = 30;

        System.out.println("circle radious: " + radious + " circumference of a circle: " + Circle.circuit(radious));
        System.out.println("circle radious: " + radious + " circle field: " + Circle.field(radious));

        double dimA = 10;
        double dimB = 20;
        double dimC = 30;
        double dimD = 40;
        double dimH = 25;

        System.out.println("square circuit: " + Square.circuit(dimA, dimB) + "square field" + Square.field(dimA, dimB));
        System.out.println("trapeze circuit: " + Trapeze.circuit(dimA, dimB, dimC, dimD) + "trapeze field: " + Trapeze.Field(dimA, dimB, dimH));
        System.out.println("triangle circuit: " + Triangle.circuit(dimA, dimB, dimC) + "triangle field: " + Triangle.field(dimA, dimH));

    }
}
