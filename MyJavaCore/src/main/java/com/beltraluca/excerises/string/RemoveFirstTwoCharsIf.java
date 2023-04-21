package com.beltraluca.excerises.string;

public class RemoveFirstTwoCharsIf {

    public static String removeFirstTwoCharsIf(String string){
        StringBuilder res=new StringBuilder();

        if(string.length()>0) {
            if (string.charAt(0)=='H' || string.charAt(0)=='h'){
                res.append(string.charAt(0));
            }
            if(string.length()>1) {
                if(string.charAt(1)=='E' || string.charAt(1)=='e'){
                    res.append(string.charAt(1));
                }
                for (int i = 2; i < string.length(); i++) {
                    res.append(string.charAt(i));
                }
            }
            return res.toString();
        }else{
            return "";
        }
    }
}
