package org.example;

public class Multiplication {
    public static int multiply(int x, int y) {
        try {
            return Math.multiplyExact(x, y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Overflow/underflow error");
        }
    }
}
