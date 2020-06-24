package logic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WeightCalculator {
    public static BigDecimal convertToKilograms(BigDecimal value, String operation) {
        BigDecimal kilograms;
        switch (operation) {
            case "kilogramy":
                kilograms = value;
                break;
            case "gramy":
                kilograms = value.divide(BigDecimal.valueOf(1000)).setScale(3, RoundingMode.HALF_UP);
                break;
            case "miligramy":
                kilograms = value.divide(BigDecimal.valueOf(1000000)).setScale(6, RoundingMode.HALF_UP);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return kilograms;
    }

    public static BigDecimal convertToGrams(BigDecimal value, String operation) {
        BigDecimal grams;
        switch (operation) {
            case "kilogramy":
                grams = value.multiply(BigDecimal.valueOf(1000)).setScale(0, RoundingMode.HALF_UP);
                break;
            case "gramy":
                grams = value;
                break;
            case "miligramy":
                grams = value.divide(BigDecimal.valueOf(1000)).setScale(3, RoundingMode.HALF_UP);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return grams;
    }

    public static BigDecimal convertToMiligrams(BigDecimal value, String operation) {
        BigDecimal miligrams;
        switch (operation) {
            case "kilogramy":
                miligrams = value.multiply(BigDecimal.valueOf(1000000)).setScale(0, RoundingMode.HALF_UP);
                break;
            case "gramy":
                miligrams = value.multiply(BigDecimal.valueOf(1000)).setScale(0, RoundingMode.HALF_UP);
                break;
            case "miligramy":
                miligrams = value;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return miligrams;
    }
}