package com.beltraluca.excerises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {

    @Test
    void goodAtTheBeginning() {
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("Good morning"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("GOOD morning"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good morning"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("gOoD morning"));
    }
}