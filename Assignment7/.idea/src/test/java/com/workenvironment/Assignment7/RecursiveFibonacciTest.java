package com.workenvironment.Assignment7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveFibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, RecursiveFibonacci.fibonacci(0));
        assertEquals(1, RecursiveFibonacci.fibonacci(1));
        assertEquals(1, RecursiveFibonacci.fibonacci(2));
        assertEquals(2, RecursiveFibonacci.fibonacci(3));
        assertEquals(3, RecursiveFibonacci.fibonacci(4));
        assertEquals(5, RecursiveFibonacci.fibonacci(5));
        assertEquals(8, RecursiveFibonacci.fibonacci(6));
        assertEquals(13, RecursiveFibonacci.fibonacci(7));
        assertEquals(21, RecursiveFibonacci.fibonacci(8));
        assertEquals(34, RecursiveFibonacci.fibonacci(9));
        assertEquals(55, RecursiveFibonacci.fibonacci(10));
    }
}