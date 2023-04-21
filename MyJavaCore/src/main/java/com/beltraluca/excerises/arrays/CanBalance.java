package com.beltraluca.excerises.arrays;

public class CanBalance {

    public static boolean canBalance(int[] v){
        int sum1=0;
        for(int i=0;i<v.length;i++){
            sum1+=v[i];
            int sum2=0;
            for(int o=i+1;o<v.length;i++){
                sum2+=v[o];
            }
            if(sum1==sum2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] v=new int[]{1, 1, 1, 2, 1};
        System.out.println(canBalance(v));
    }
}
