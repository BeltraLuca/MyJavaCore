package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchUpTest {

    @Test
    void matchUp() {
        int[] v1=new int[]{1, 2, 3};
        int[] v2=new int[]{2, 3, 10};
        assertTrue(MatchUp.matchUp(v1,v2)==2);
    }
}