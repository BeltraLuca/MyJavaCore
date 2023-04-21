package com.beltraluca.excerises.arrays;

public class MatchUp {

    public static int matchUp(int[] v1, int[] v2){
        int res=0;
        int cal;
        for(int i=0;i<v1.length;i++){
            cal=Math.abs(v1[i]-v2[i]);
            if (cal<=2) {
                if(cal!=0){
                    res++;
                }
            }
        }
        return res;
    }
}
