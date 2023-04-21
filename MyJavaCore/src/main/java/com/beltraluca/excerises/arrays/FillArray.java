package com.beltraluca.excerises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {

    public static double[] fillArray(int size, int value, boolean randomize){
        double src[]=new double[size];
        RandomGenerator g1=RandomGenerator.getDefault();
        for(int i=0;i<size;i++) {
            if (randomize) {
                src[i] = value - g1.nextDouble(-0.5, 0.5);
            } else {
                src[i]=(double)value;
            }
        }

        return src;
    }
}
