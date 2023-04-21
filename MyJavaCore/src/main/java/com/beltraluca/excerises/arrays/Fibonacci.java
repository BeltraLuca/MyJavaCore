package com.beltraluca.excerises.arrays;

public class Fibonacci {

    public static long[] fibonacci(int n){
        long[] fib=new long[n];

        switch(n){
            case 0:
                return null;

            case 1:
                fib[0]=0;
                break;

            default:
                fib[0]=0;
                fib[1]=1;
                int point=2;
                for(int i=2;i<n;i++){
                    fib[i]=fib[point-1]+fib[point-2];
                    point++;
                }

                break;
        }
        return fib;
    }
}
