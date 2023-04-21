package com.beltraluca.excerises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {

    @Test
    void goodAroundTheBeginning() {
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("_good Sweet"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good Sweet"));
    }
}