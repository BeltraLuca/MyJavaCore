package com.beltraluca.excerises.arrays;

import java.util.Arrays;

public class SearchArray {

    public static boolean containsBruteForce(String[] strings, String searched){
        for(int i=0;i<strings.length;i++){
            if(strings[i].equals(searched)){
                return true;
            }
        }
        return false;
    }
    public static boolean containsBinary(String[] strings, String searched){
        String[] strings1= Arrays.copyOf(strings,strings.length);
        Arrays.sort(strings1);
        return Arrays.binarySearch(strings1,searched)>=0;

    }
}
