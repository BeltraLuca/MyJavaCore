package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        assertArrayEquals(FizzBuzz.fizzBuzz(1,6),new String[]{"1", "2", "Fizz", "4", "Buzz"});
    }
}