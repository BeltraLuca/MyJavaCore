package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isEveryWhereTest {

    @Test
    void isEverywhere() {
        int[] v=new int[]{1,2,1,2,1,2};
        assertTrue(isEveryWhere.isEverywhere(v,2));
    }
}