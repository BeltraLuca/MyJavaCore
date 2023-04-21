package com.beltraluca.excerises.string;

import java.util.ArrayList;

public class Reverse {

    public static String reverse(String string){
        StringBuilder res=new StringBuilder();
        for (int i=string.length()-1;i>=0;i--){
            res.append(string.charAt(i));
        }
        return res.toString();
    }
}


