package com.beltraluca.excerises.oop;

import com.beltraluca.excerises.oop.basic.EnhancedResizableArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedResizableArrayTest {
    private EnhancedResizableArray e=new EnhancedResizableArray();
    @Test
    void add() {
        assertEquals(e.size(),100);
        e.add(10);
        assertEquals(e.size(),101);
        assertEquals(e.get(100),10);
    }

    @Test
    void remove() {
        assertEquals(e.size(),100);
        e.remove(2);
        assertEquals(e.size(),99);
    }

    @Test
    void get() {
        e.set(2,10);
        assertEquals(e.get(2),10);
        assertTrue(e.contains(10));
    }

}