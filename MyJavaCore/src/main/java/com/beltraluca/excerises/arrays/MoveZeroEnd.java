package com.beltraluca.excerises.arrays;

import java.util.Arrays;

public class MoveZeroEnd {

    public static int[] moveZerosEnd(int[] v){
        int[] src=new int[v.length];
        Arrays.fill(src,0);
        int index=0;
        for(int i=0;i<v.length;i++){
            if(v[i]!=0){
                src[index]=v[i];
                index++;
            }
        }
        return src;
    }
}
