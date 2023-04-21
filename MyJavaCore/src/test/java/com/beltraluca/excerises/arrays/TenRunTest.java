package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenRunTest {

    @Test
    void tenRun() {
        int[] v=new int[]{2, 12, 9, 8, 20, 5};
        assertArrayEquals(TenRun.tenRun(v),new int[]{2,12,9,8,20,20});
    }
}