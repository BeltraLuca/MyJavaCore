package com.beltraluca.excerises.functional;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PayMoreTest {

    @Test
    void payMore() {
        Map<String, Double> fees =Map.of(
                "34745...", 11.75,
                "33367...", 9.75,
                "34833...", 7.75,
                "33188...", 7.75,
                "33112...",7.95);
        PayMore.payMore(fees,"333",+0.5);
    }
}