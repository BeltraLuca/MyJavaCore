package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanBalanceTest {

    @Test
    void canBalance() {
        int[] v=new int[]{1, 1, 1, 2, 1};
        assertTrue(CanBalance.canBalance(v));
    }
}