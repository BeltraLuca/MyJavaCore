package com.beltraluca.excerises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class concatenateTest {

    @Test
    void concatenate() {
        String[] strings=new String[]{"Hello", " ", "World!"};

        assertEquals(concatenate.concatenate(strings),"Hello World!");
    }
}