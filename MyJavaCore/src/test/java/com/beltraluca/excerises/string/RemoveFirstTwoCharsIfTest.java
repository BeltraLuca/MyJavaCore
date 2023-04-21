package com.beltraluca.excerises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsIfTest {

    @Test
    void removeFirstTwoCharsIf() {
        assertEquals(RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Hello world"),"Hello world");
        assertEquals(RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("yes"),"es");
        assertEquals(RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("ye"),"e");
    }
}