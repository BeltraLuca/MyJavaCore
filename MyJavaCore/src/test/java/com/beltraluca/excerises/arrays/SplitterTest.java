package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitterTest {

    @Test
    void splitter() {
        int[] p=Splitter.splitter(123);
        assertArrayEquals(Splitter.splitter(123),new int[]{1,2,3});
    }
}