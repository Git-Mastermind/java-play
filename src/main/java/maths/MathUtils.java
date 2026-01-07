package main.java.maths;

public class MathUtils {
    public int divide(int dividend, int divisor) {
        int quotient = 0;

        while ((dividend - divisor) > divisor) {
            dividend -= divisor;
            quotient ++;
        }
        return quotient;
    }
}
