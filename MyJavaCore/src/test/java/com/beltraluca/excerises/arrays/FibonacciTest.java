package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        assertArrayEquals(Fibonacci.fibonacci(5),new long[]{0,1,1,2,3});
    }
}