package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroEndTest {

    @Test
    void moveZerosEnd() {
        int[] v=new int[]{4,0,2,3};
        assertArrayEquals(MoveZeroEnd.moveZerosEnd(v),new int[]{4,2,3,0});
    }
}