package com.beltraluca.excerises.string;

public class concatenate {

    public static String concatenate(String[] strings){

        StringBuilder s1=new StringBuilder();

        for(String i:strings){
            s1.append(i);
        }
        return s1.toString();

    }
}
