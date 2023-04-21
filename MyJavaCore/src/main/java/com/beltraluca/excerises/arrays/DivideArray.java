package com.beltraluca.excerises.arrays;

public class DivideArray {

    public static double[] divideArray(double[] v, double factor){
        double[] dst=new double[v.length];
        int index=0;
        for(double i:v){
            dst[index]=i/factor;
            index++;
        }
        return dst;
    }
}
