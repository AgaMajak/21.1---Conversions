package logic;

import java.io.PrintWriter;
import java.math.BigDecimal;

public class ConversionCalculator {
    public static void convertWeightAndWriteItToUser(BigDecimal value, String operation, PrintWriter writer) {
        BigDecimal kilograms = WeightCalculator.convertToKilograms(value, operation);
        BigDecimal grams = WeightCalculator.convertToGrams(value, operation);
        BigDecimal miligrams = WeightCalculator.convertToMiligrams(value, operation);

        writer.println("<h1>Podana wartość w przeliczeniu na:</h1>");
        writer.println("<h2> kilogramy: " + kilograms + "</h2>");
        writer.println("<h2> gramy: " + grams + "</h2>");
        writer.println("<h2> miligramy: " + miligrams + "</h2>");
    }

    public static void convertLengthAndWriteItToUser(BigDecimal value, String operation, PrintWriter writer) {
        BigDecimal meters = LengthCalculator.convertToMeters(value, operation);
        BigDecimal centimeters = LengthCalculator.convertToCentimeters(value, operation);
        BigDecimal milimeters = LengthCalculator.convertToMilimeters(value, operation);

        writer.println("<h1>Podana wartość w przeliczeniu na:</h1>");
        writer.println("<h2> metry: " + meters + "</h2>");
        writer.println("<h2> centymetry: " + centimeters + "</h2>");
        writer.println("<h2> milimetry: " + milimeters + "</h2>");
    }
}