package uta.cse.cse3310.JSBSimEdit.utils;

public class DoubleUtils {

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean isPositiveDouble(String str) {
        try {
            double d = Double.parseDouble(str);
            if (d > 0)
                return true;
            else
                return false;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
