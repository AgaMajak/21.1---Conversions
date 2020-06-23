package logic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LengthCalculator {
    public static BigDecimal convertToMeters(BigDecimal value, String operation) {
        BigDecimal meters;
        switch (operation) {
            case "metry":
                meters = value;
                break;
            case "centymetry":
                meters = value.divide(BigDecimal.valueOf(100)).setScale(3, RoundingMode.HALF_UP);
                break;
            case "milimetry":
                meters = value.divide(BigDecimal.valueOf(1000)).setScale(4, RoundingMode.HALF_UP);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return meters;
    }

    public static BigDecimal convertToCentimeters(BigDecimal value, String operation) {
        BigDecimal centimeters;
        switch (operation) {
            case "metry":
                centimeters = value.multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.HALF_UP);
                break;
            case "centymetry":
                centimeters = value;
                break;
            case "milimetry":
                centimeters = value.divide(BigDecimal.valueOf(10)).setScale(2, RoundingMode.HALF_UP);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return centimeters;
    }

    public static BigDecimal convertToMilimeters(BigDecimal value, String operation) {
        BigDecimal milimeters;
        switch (operation) {
            case "metry":
                milimeters = value.multiply(BigDecimal.valueOf(1000)).setScale(0, RoundingMode.HALF_UP);
                break;
            case "centymetry":
                milimeters = value.multiply(BigDecimal.valueOf(10)).setScale(0, RoundingMode.HALF_UP);
                break;
            case "milimetry":
                milimeters = value;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return milimeters;
    }
}