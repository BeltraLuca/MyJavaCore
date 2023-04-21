package com.beltraluca.excerises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DownSizeTest {

    @Test
    void downsize() {
        List<String> l=new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        l.add("F");
        DownSize.downsize(l,2);
        System.out.println(l.toString());
    }
}