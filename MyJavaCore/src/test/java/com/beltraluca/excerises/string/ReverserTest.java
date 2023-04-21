package com.beltraluca.excerises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserTest {

    @Test
    void reverse() {
        String s="ciao Eli";
        assertEquals(Reverse.reverse(s),"ilE oaic");
    }
}