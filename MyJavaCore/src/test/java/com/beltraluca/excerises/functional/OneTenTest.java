package com.beltraluca.excerises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OneTenTest {

    @Test
    void oneTen() {
        List<Integer> i= new ArrayList<>(List.of(1, 2, 3));
        System.out.println(OneTen.oneTen(i));
    }
}