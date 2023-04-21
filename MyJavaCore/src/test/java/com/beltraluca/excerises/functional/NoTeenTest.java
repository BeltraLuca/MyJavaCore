package com.beltraluca.excerises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoTeenTest {

    @Test
    void noTeen() {
        List<Integer> i=List.of(12, 13, 19, 20);
        System.out.println(NoTeen.noTeen(i).toString());
    }
}