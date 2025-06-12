package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplyTest {
    @Test
    public void testMultiplyPositiveCase() {
        assertEquals(2, Multiplication.multiply(1, 2));
        assertEquals(0, Multiplication.multiply(0, 0));
    }

    @Test
    public void testMultiplyFailingCase() {
        assertNotEquals(4, Multiplication.multiply(-1, -1));
    }

    @Test
    public void testExceptionalCase() {
         assertThrows(ArithmeticException.class, () -> { Multiplication.multiply(Integer.MAX_VALUE, 2); });
    }
}
