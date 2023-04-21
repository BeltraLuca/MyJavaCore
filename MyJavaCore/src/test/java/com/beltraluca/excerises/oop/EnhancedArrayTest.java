package com.beltraluca.excerises.oop;

import com.beltraluca.excerises.oop.basic.EnhancedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedArrayTest {

    private EnhancedArray e=new EnhancedArray(10);
    @Test
    void size() {
        assertEquals(e.size(),10);
    }

    @Test
    void get() {
        System.out.println(e.get(2));
    }

    @Test
    void set() {
        e.set(2,50);
        assertEquals(e.get(2),50);
    }

    @Test
    void contains() {
        e.set(2,50);
        assertTrue(e.contains(50));
    }

    @Test
    void resetZero() {
        e.resetZero();
        System.out.println("zero\n\n");
        for(int i:e.toArray()){
            System.out.println(i);
        }
    }

    @Test
    void resetRandom() {
        e.resetRandom();
        System.out.println("\n\n");
        for(int i:e.toArray()){
            System.out.println(i);
        }
    }

}