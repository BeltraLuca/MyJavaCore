package com.beltraluca.excerises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {

    @Test
    void removeFirstLast() {
        assertEquals(RemoveFirstLast.removeFirstLast("aenema"),"enem");
        assertEquals(RemoveFirstLast.removeFirstLast("FF"),"");
    }
}