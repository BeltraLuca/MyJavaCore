package com.beltraluca.excerises.arrays;

public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end){
        String[] res=new String[end-start];
        int pointer=0;
        for(int i=start;i<end;i++){
            if(i%3==0){
                res[pointer++]="Fizz";
            }else if(i%5==0){
                res[pointer++]="Buzz";
            }else{
                res[pointer++]=String.valueOf(i);
            }
        }
        return res;
    }
}
