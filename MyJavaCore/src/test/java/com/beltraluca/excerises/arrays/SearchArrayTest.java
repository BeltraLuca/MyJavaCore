package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchArrayTest {

    @Test
    void containsBruteForce() {
        String[] v=new String[]{"car", "boat", "bike", "plane"};
        String searched="bike";
        assertTrue(SearchArray.containsBruteForce(v,searched));
    }

    @Test
    void containsBinary() {
        String[] v=new String[]{"car", "boat", "bike", "plane"};
        String searched="car";
        assertTrue(SearchArray.containsBinary(v,searched));
    }
}