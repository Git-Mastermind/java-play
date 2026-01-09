package main.java;

public class MathUtils {
    public int divide(int dividend, int divisor) {
        int quotient = 1;

        while ((dividend - divisor) > divisor) {
            dividend -= divisor;
            quotient ++;
        }
        return quotient;
    }

    public int mod(int dividend, int divisor) {
        int remainder = dividend;
        while ((dividend - divisor) >= divisor) {
            remainder = dividend - divisor;
            dividend = remainder;
        }
        return remainder;
    }

    
    public int log(int result, int base) {
        int exponent = 1;
        if (result == 0) {
            throw new IllegalArgumentException("Invalid result! Result cannot be zero!");
        }
        else {
            while (result != 0) {
                result /= base;
                exponent++;
            }
        }
        return exponent;
    }
}