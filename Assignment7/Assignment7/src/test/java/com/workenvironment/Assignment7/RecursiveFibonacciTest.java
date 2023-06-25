package com.workenvironment.Assignment7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveFibonacciTest {

    @Test
    public void testFibonacci() {
        // Test the first 10 terms of the Fibonacci sequence
        long[] expectedResults = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        
        for (int i = 0; i < expectedResults.length; i++) {
            long result = RecursiveFibonacci.fibonacci(i);
            Assertions.assertEquals(expectedResults[i], result, "Incorrect Fibonacci result for term " + i);
        }
    }
}