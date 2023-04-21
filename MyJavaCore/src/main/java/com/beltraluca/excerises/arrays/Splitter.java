package com.beltraluca.excerises.arrays;

public class Splitter {

    public static int[] splitter(int input){
        int temp=input,i=0;
        while(temp!=0){
            i++;
            temp=temp/10;
        }
        temp=input;
        int[] dst=new int[i];
        for(int p=i-1;p>=0;p--){
            dst[p]=temp%10;
            temp=temp/10;
        }
        return dst;
    }
}
