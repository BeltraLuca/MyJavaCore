package com.beltraluca.excerises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoTenTest {

    @Test
    void twoTwo() {
        List<Integer> l=new ArrayList<>(List.of(1, 2, 3));
        System.out.println(TwoTen.twoTwo(l).toString());
    }
}