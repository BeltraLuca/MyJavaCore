package com.beltraluca.excerises.arrays;

public class isEveryWhere {

    public static boolean isEverywhere(int[] v, int value){
        int i=0;
        while((i+1)!=(v.length-1)){
            if(v[i]!=value && v[i+1]!=value){
                return false;
            }else{
                i++;
            }
        }
        return true;
    }
}
