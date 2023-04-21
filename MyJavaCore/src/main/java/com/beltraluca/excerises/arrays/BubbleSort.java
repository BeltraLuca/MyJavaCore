package com.beltraluca.excerises.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] v){
        Arrays.sort(v);
    }
    public static int[] bubbleSortCopy(int[] v){
        int[] dst=Arrays.copyOf(v,v.length);
        Arrays.sort(dst);
        return dst;
    }
}
