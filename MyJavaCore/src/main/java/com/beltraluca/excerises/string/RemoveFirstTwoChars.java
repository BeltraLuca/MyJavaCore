package com.beltraluca.excerises.string;

public class RemoveFirstTwoChars {

    public static String removeFirstTwoChars(String string){
        StringBuilder res=new StringBuilder();
        if(string.length()<=2){
            return "";
        }
        for(int i=2;i<string.length();i++){
            res.append(string.charAt(i));
        }
        return res.toString();
    }
}
