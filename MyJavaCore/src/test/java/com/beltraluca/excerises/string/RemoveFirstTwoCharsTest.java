package com.beltraluca.excerises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsTest {

    @Test
    void removeFirstTwoChars() {
        assertEquals(RemoveFirstTwoChars.removeFirstTwoChars("Hello world"),"llo world");
        assertEquals(RemoveFirstTwoChars.removeFirstTwoChars("yes"),"s");
        assertEquals(RemoveFirstTwoChars.removeFirstTwoChars("ye"),"");
    }
}