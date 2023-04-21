package com.beltraluca.excerises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] v=new int[]{5,4,3,2,1};
        BubbleSort.bubbleSort(v);
        assertArrayEquals(v,new int[]{1,2,3,4,5});

    }

    @Test
    void bubbleSortCopy() {
        int[] v=new int[]{5,4,3,2,1};
        int[] n=BubbleSort.bubbleSortCopy(v);
        BubbleSort.bubbleSort(v);
        assertArrayEquals(n,v);
    }
}