package com.beltraluca.excerises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareFiveTest {

    @Test
    void squareFive() {
        List<Integer> l= List.of(5);
        System.out.println(SquareFive.squareFive(l));
    }
}