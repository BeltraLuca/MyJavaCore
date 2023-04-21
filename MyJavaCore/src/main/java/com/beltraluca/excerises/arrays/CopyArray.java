package com.beltraluca.excerises.arrays;

public class CopyArray {


    public static double[] copyArray(double[] v){
        double[] dst=new double[v.length];
        for(int i=0;i<v.length;i++){
            dst[i]=v[i];
        }
        return dst;
    }
}
