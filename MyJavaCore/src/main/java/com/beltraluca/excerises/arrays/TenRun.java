package com.beltraluca.excerises.arrays;

public class TenRun {

    public static int[] tenRun(int[] v){

        int[] vectorTen=new int[v.length];
        int multiple=0;

        for(int i=0;i<v.length;i++) {
            if(v[i]%10==0){
                multiple=v[i]/10;
            }

            if(multiple!=0){
                vectorTen[i]=multiple*10;
            }else{
                vectorTen[i]=v[i];
            }
        }
        return vectorTen;
    }
}
